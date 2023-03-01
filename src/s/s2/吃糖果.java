package s.s2;

import java.util.Scanner;
//小蓝有 nn 种糖果，每种数量已知。
//
//小蓝不喜欢连续 22 次吃同样的糖果。问有没有可行的吃糖方案。
//我c ,感觉我是单细胞生物了,题理解错了c ,下面代码也平台过不了

public class 吃糖果 {
    static int [] s=new int[1000000];
    static String [] s2=new String[1000000];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for (int i = 0; i < a1; i++) {
//            int mi=1;
//            String a2=sc.next();
//            for (int j = 0; j < a2.length(); j++) {
//                char s=a2.charAt(i);
//                if(s>mi){
//                    System.out.println("NO");
//                }else{
//                    System.out.println("YES");
//                }
//            }
//        }
        for (int i = 0; i < n; i++) {
            int mi = 1;
            String s1 = sc.next();
            s2=s1.split(" ");
            for (int j = 0; j < s1.length(); j++) {
                s[j] = Integer.parseInt(s2[j]);
                if (s[j] > mi) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }}

