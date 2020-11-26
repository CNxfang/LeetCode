package data;

import code.solution.Solution1662;

/**
 * @author xufang
 * @date 2020/11/26
 */
public class Test1662 {
    public static boolean getRes() {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        Solution1662 solution = new Solution1662();
        if(solution.arrayStringsAreEqual(word1,word2)) {
            return true;
        }else {
            return false;
        }
    }
}
