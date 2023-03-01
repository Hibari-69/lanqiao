package s.soures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

//实现一个算法来识别一个字符串 str2 是否是另一个字符串 str1 的排列。排列的解释如下：如果将 str1 的字符拆分开，重新排列后再拼接起来，能够得到 str2 ，那么就说字符串 str2 是字符串 str1 的排列。
// （不忽略大小写）开两个26 的数组
//如果 str2 字符串是 str1 字符串的排列，则输出 YES；如果 str2 字符串不是 str1 字符串的排列，则输出 NO；
//
public class 字符串是否是另一个的排列 {
    //br 就可以让你的程序快7倍以上
    // scanner 带锁很慢;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //避免许多格式问题
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray();
        char[] t=sc.next().toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        String s1=new String(s);
        String s2=new String(t);
        System.out.println(s1.equals(s2)?"YES":"NO");
    }
}
// 数组计数;
//static int[] c1=new int[26],c2=new int[26];
//    static int[] c3=new int[26],c4=new int[26];
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
//        String t=sc.next();
//        for (int i = 0; i < s.length(); i++) {
//            char c=s.charAt(i);
//            if(c>'Z') c2[c-'a']++;//小写字母的ASCII码值大些
//            else c1[c-'A']++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char c=s.charAt(i);
//            if(c>'Z') c4[c-'a']++;
//            else c3[c-'A']++;
//        }
//        for (int i = 0; i < 26; i++) {
//            if(c1[i]!=c3[i]||c2[i]!=c4[i]){ System.out.println("NO");
//            return;}
//        }
//        System.out.println("YES");
//
//    }