package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution1672
 * 创建者: xufang
 * 创建时间:2020/12/1 14:58
 * 描述:
 * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 **/
public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int maxMoney = 0;
        for(int i=0; i< accounts.length;i++){
            int iMoney = 0;
            for(int j=0;j<accounts[i].length;j++){
                iMoney = iMoney + accounts[i][j];
            }
            if(iMoney > maxMoney){
                maxMoney = iMoney;
            }
        }
        return maxMoney;
    }
}
