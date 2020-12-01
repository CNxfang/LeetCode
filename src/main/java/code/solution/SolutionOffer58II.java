package code.solution;

/**
 * 项目名: LeetCode
 * 文件名: SolutionOffer58II
 * 创建者: xufang
 * 创建时间:2020/12/1 15:13
 * 描述:
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"
 **/
public class SolutionOffer58II {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        String res = (s+s).substring(n,n+len);
        return res;
    }
}
