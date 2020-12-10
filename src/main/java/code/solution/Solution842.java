package code.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名: LeetCode
 * 文件名: Solution842
 * 创建者: xufang
 * 创建时间:2020/12/8 15:50
 * 描述: TODO
 **/
public class Solution842 {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res= new ArrayList<Integer>();
        if(S.length()<3){
            return res;
        }
        int i = 1;
        int firstStart = 0;
        int secondStart = firstStart + i;

        while(secondStart<=S.length()/2){
            try {
                if(S.charAt(firstStart)=='0' && secondStart-firstStart>1){
                    return res;
                }
                int thirdStart = secondStart + 1;
                while(S.length()-thirdStart >= Math.max(secondStart-firstStart, thirdStart-secondStart)) {
                    int firstI = Integer.valueOf(S.substring(firstStart, secondStart));
                    if(S.charAt(secondStart)=='0' && thirdStart-secondStart>1){
                        res = new ArrayList<Integer>();
                        break;
                    }
                    int secondI = Integer.valueOf(S.substring(secondStart, thirdStart));
                    if (Integer.MAX_VALUE - firstI >= secondI) {
                        int thirdI = firstI + secondI;
                        String thirdStr = String.valueOf(thirdI);
                        int len3 = thirdStr.length();
                        if (S.substring(thirdStart, thirdStart + len3).equals(thirdStr)) {
                            res.add(firstI);
                            firstStart = secondStart;
                            secondStart = thirdStart;
                            thirdStart = thirdStart + len3;
                            if(thirdStart==S.length()){
                                res.add(Integer.valueOf(S.substring(firstStart,secondStart)));
                                res.add(Integer.valueOf(S.substring(secondStart,thirdStart)));
                            }
                        }else{
                            res = new ArrayList<Integer>();
                            thirdStart = thirdStart + 1;
                        }
                    }else{
                        res = new ArrayList<Integer>();
                        thirdStart = thirdStart + 1;
                    }
                }
                if(thirdStart==S.length()){
                    return res;
                }else{
                    res = new ArrayList<Integer>();
                }
            }catch(Exception e){
                res = new ArrayList<Integer>();
            }
            i = i + 1;
            firstStart = 0;
            secondStart = firstStart + i;
            System.out.println(secondStart);
        }
        return res;
    }
}
