package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution1470
 * 创建者: xufang
 * 创建时间:2020/12/1 16:25
 * 描述: TODO
 **/
public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
            res[2*i] = nums[i];
            res[2*i + 1] = nums[nums.length/2 + i];
        }
        return res;
    }
}
