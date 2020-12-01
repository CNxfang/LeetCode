package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution
 * 创建者: xufang
 * 创建时间:2020/12/1 15:30
 * 描述:
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 **/
public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int godNum = 0;
        int[] count = new int[101];
        for(int i=0; i<nums.length; i++){
            godNum = godNum + count[nums[i]];
            count[nums[i]] = count[nums[i]] + 1;
        }
        return godNum;
    }
}
