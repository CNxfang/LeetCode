package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution860
 * 创建者: xufang
 * 创建时间:2020/12/10 14:35
 * 描述: TODO
 **/
public class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveCnt = 0;
        int tenCnt = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fiveCnt = fiveCnt + 1;
            }else if(bills[i]==10){
                fiveCnt = fiveCnt - 1;
                tenCnt = tenCnt + 1;
            }else{
                if(tenCnt > 0){
                    tenCnt = tenCnt - 1;
                    fiveCnt = fiveCnt - 1;
                }else{
                    fiveCnt = fiveCnt - 3;
                }
            }
            if(fiveCnt < 0 || tenCnt < 0){
                return false;
            }
        }
        return true;
    }
}
