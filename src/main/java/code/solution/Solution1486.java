package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution1486
 * 创建者: xufang
 * 创建时间:2020/12/1 16:38
 * 描述: TODO
 **/
public class Solution1486 {
    public int xorOperation(int n, int start) {
        if(n==1){
            return start;
        }else {
            return (start + 2 * (n - 1)) ^ xorOperation(n - 1, start);
        }
    }
}
