import java.util.HashSet;

/**
 * 描述
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是2或者3。
 * 存在不合法的输入的话输出-1
 *
 * 数据范围： 0 ≤ � ≤ 10000 0≤n≤10000 进阶：时间复杂度 � ( � ) O(n) ，空间复杂度 � ( � ) O(n)
 */
public class 数组中重复的数字 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        // write code here
        //思路：遍历，然后统计每一个数字的个数，返回任意一个就行
        if(numbers == null || numbers.length == 0){
            return -1;
        }
        //方法一：用set进行判断
        HashSet<Integer> hashset = new  HashSet<>();
        for(int i : numbers){
            if(hashset.contains(i)){
                return i;
            }else{
                hashset.add(i);
            }
        }
        return -1;
    }

    public int duplicate2 (int[] numbers) {
        //方法二：新建一个数组，将原数组中的每一个数字当做新数组的下标，而新数组中存放每个下标出现的次数。
        //这是一种及其重要的思想
        int[] res = new int[numbers.length];
        for(int i : numbers){
            res[i]++;
            if(res[i] == 2){
                return i;
            }
        }
        return -1;
    }
}
