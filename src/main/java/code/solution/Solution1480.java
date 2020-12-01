package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution1480
 * 创建者: xufang
 * 创建时间:2020/12/1 15:05
 * 描述: 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 **/
public class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                res[i] = nums[i];
            }else{
                res[i] = res[i-1] + nums[i];
            }
        }
        return res;
    }
}
