package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: Solution1678
 * 创建者: xufang
 * 创建时间:2020/12/8 15:38
 * 描述: TODO
 **/
public class Solution1678 {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                res.append("G");
            }else if(command.charAt(i)=='('){
                i = i+1;
                if(command.charAt(i)==')'){
                    res.append("o");
                }else if(command.charAt(i)=='a'){
                    i = i+2;
                    res.append("al");
                }
            }
        }
        return res.toString();
    }
}
