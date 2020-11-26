package code.solution;

/**
 * @author xufang
 * @date 2020/11/26
 *
 *  题目：检查两个字符串数组是否相等
 *   难度：简单
 *   描述：
 *   给你两个字符串数组 word1 和 word2 。
 *   如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
 *   数组表示的字符串是由数组中的所有元素 按顺序 连接形成的字符串。
 */
public class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1.length==0 && word2.length==0) {
            return true;
        }else if (word1.length>0 && word2.length>0){
            int i=0;
            int j=0;
            int ii=0;
            int jj=0;
            String firstStr = "";
            String secondStr = "";
            while(i<word1.length && j<word2.length) {
                firstStr = word1[i];
                secondStr = word2[j];
                if(firstStr.length() == 0) {
                    i = i+1;
                    continue;
                }
                if(secondStr.length() == 0) {
                    j = j+1;
                    continue;
                }
                while(ii<firstStr.length() && jj<secondStr.length()) {
                    if(firstStr.charAt(ii)-secondStr.charAt(jj)==0) {
                        ii = ii + 1;
                        jj = jj + 1;
                    }else {
                        return false;
                    }
                }
                if(ii>=firstStr.length()) {
                    ii = 0;
                    i = i +1;
                }
                if(jj>=secondStr.length()) {
                    jj = 0;
                    j = j + 1;
                }
            }
            if(i>=word1.length && j>=word2.length) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
