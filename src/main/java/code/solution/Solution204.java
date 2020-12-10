package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution204
 * 创建者: xufang
 * 创建时间:2020/12/3 16:43
 * 描述: 统计所有小于非负整数 n 的质数的数量。
 **/
public class Solution204 {
    public int countPrimes(int n) {
        int count = 0;
        int x=0;
        while(true){
            if(6*x-1 < n ){
                if(isZhishu(6*x-1)){
                    count = count + 1;
                }
            }else{
                break;
            }
            if(6*x+1 <n ){
                if(isZhishu(6*x+1)){
                    count = count + 1;
                }
            }else{
                break;
            }

            x = x + 1;
        }
        if(n>3){
            count = count + 2;
        }else if(n>2){
            count = count + 1;
        }
        return count;
    }
    public static boolean isZhishu(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
