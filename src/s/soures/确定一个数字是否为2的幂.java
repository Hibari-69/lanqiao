package s.soures;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class 确定一个数字是否为2的幂 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(Integer.bitCount(x)==1?"YES":"NO");
    }
}
//Integer.bitCount() 二进制中1的个数;
//打表康康,二进制只有一个1;
//        System.out.println(Integer.toString(2,2));
//        System.out.println(Integer.toString(4,2));
//        System.out.println(Integer.toString(8,2));
//        System.out.println(Integer.toString(16,2));
//        System.out.println(Integer.toString(32,2));
//        System.out.println(Integer.toString(64,2));
//        System.out.println(Integer.toString(128,2));
//        System.out.println(Integer.toString(256,2));