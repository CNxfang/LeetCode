package data;

import code.question.question1662;

public class test1662 {
	public static boolean getRes() {
		String[] word1 = {"ab","c"};
		String[] word2 = {"a","bc"};
		question1662 solution = new question1662();
		if(solution.arrayStringsAreEqual(word1,word2)) {
			return true;
		}else {
			return false;
		}
	}
}
