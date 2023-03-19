package s.unit3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 字符串一些基操 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //简单加密
        String ming="abcdefghijklmnopqrstuvwxyz";
        String anwe="defghijklmnopqrstuvwxyzabc";
        for (int i = 0; i < ming.length(); i++) {

        }
        while(sc.hasNext()){
//            String id=sc.next();
//            char pos17=id.charAt(16);//第十七位数字
//            //char 9 的Ascii码值为 57    0->45;
//            if(pos17=='1'||pos17=='3'||pos17=='5'||pos17=='7'||pos17 ==57)
//                System.out.println("boy");
//            else
//                System.out.println("girl");
//
//            //char to number   char to 字母转对应数字 xxxx-'a'
//            int n=id.charAt(3)-'0';
//
//            int a=Integer.valueOf(id.substring(16,17));//截取字符串中的16位,转成int
//
//            String pos18=id.substring(16,17);
//            System.out.println("13579".indexOf(pos18)==-1?"Girl":"Boy");
//            System.out.println("13579".contains(pos18)?"Boy":"Girl");

            String s=sc.nextLine();
            String[] s1=s.split(" +"); //" +"

//            System.out.println(Arrays.toString(s1));数组输出

//            Set<String> set= new HashSet<>();

//            for (String x :
//                    s1) {
//                set.add(x);
//            }
//            System.out.println(set);

            String aa="192.168.1.1";
            String[] bb=aa.split("\\."); // . 在正则表达式里有语义的了, \\ -> java 里用两个\\转义 因为类似 \n 是有语义的

            // the quick brown fox jumps over the lazy dog





        }
    }
}
