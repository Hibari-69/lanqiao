package s.s2;

import java.util.HashMap;
import java.util.Scanner;
//这次这里用数组来计数
//就单纯的看输入数据是小写字母的话
public class 剪杂志3 {
    static int[] m1=new int[26],m2=new int[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        for (int i = 0; i < s1.length(); i++) {
            char s11 = s1.charAt(i);
            m1[s11-'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char s22 = s2.charAt(i);
            m2[s22-'a']++;
        }
        //咱还可以这样写,因为字母的ASCII码值都是挨在一起的
        for (char i = 'a'; i < 'z'; i++) {
            if (m1[i-'a']<m2[i-'a']) {
                System.out.println("NO");
                return;
            }
        }System.out.println("YES");
    }
}
