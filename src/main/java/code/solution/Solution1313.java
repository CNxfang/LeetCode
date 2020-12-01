package code.solution;

import java.util.List;

/**
 * 项目名: LeetCode
 * 文件名: Solution1313
 * 创建者: xufang
 * 创建时间:2020/12/1 17:22
 * 描述: TODO
 **/
public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<nums.length;i=i+2){
            for(int j=0;j<nums[i];j++){
                res.append(nums[i+1]).append(",");
            }
        }
        String mid = res.subSequence(0,res.length()-1).toString();
        int[] ans = new int[mid.split(",").length];
        System.out.println(ans.length);
        for (String s : mid.split(",")){
            ans[res.indexOf(s)/2] = Integer.valueOf(s);
        }
        return ans;
    }
}
