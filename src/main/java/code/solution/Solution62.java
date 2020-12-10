package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution62
 * 创建者: xufang
 * 创建时间:2020/12/9 17:24
 * 描述: TODO
 **/
public class Solution62 {
    public int uniquePaths(int m, int n) {
        if(m>n){
            return uniquePaths(n,m);
        }
        int addres = m + n - 2;
        long fenzi = 1;
        long fenmu = 1;
        for(int i=0;i<m-1;i++){
            fenzi = fenzi * (addres - i);
            fenmu = fenmu * (m - 1 - i);
        }
        return (int) (fenzi/fenmu);
    }
}
