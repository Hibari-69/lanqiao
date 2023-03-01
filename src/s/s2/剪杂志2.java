package s.s2;

import java.util.HashMap;
import java.util.Scanner;

//他题干这里的输入数据都是小写的字母的话
//哈希表计数,有点大材小用

public class 剪杂志2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char s11 = s1.charAt(i);
            m1.put(s11, m1.getOrDefault(s11, 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char s22 = s2.charAt(i);
            m2.put(s22, m2.getOrDefault(s22, 0) + 1);
        }
        //咱还可以这样写,因为字母的ASCII码值都是挨在一起的
        for (char i = 'a'; i < 'z'; i++) {
            if (m1.getOrDefault(i, 0) < m2.getOrDefault(i, 0)) {
                System.out.println("NO");
                return;
            }
        }System.out.println("YES");
    }
}
