package s.s2;


import java.util.Scanner;

public class 剪杂志 {

    static char[] a = new char[100], b = new char[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        for (int i = 0; i < s.length(); i++) {
//            a[i]=s.charAt(i);
//        }
        String s1 = sc.next();
//        for (int i = 0; i < s1.length(); i++) {
////            b[i]=s1.charAt(i);
////        }
        //contains复杂度挺高
        if (s.contains(s1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
