package s.unit3;

import java.util.Scanner;

public class 字符串加密基础版 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            //String jiami=sc.nextLine().toLowerCase(); //统一小写;

            //2.字符串中连续相同的个数的

            String words=sc.next();
           // if(words.equals("#"))break;//字符串是类，words对象，比较字符串内容是否相等equals，是否同意对象 ==

            //jiema(jiami);

            System.out.println(isEasy(words)?"yes":"no");
        }

    }

    //简单的相差3位的解密;打表
    public static void jiema(String jiami){
        String ming="abcdefghijklmnopqrstuvwxyz";
        String anwe="defghijklmnopqrstuvwxyzabc";
        for (int i = 0; i < jiami.length(); i++) {
            char x=jiami.charAt(i);
            if(x>='a'&&x<='z'){
                int pos=anwe.indexOf(x);
                System.out.print(ming.substring(pos,pos+1));
            }
            else System.out.print(x);

        }
        System.out.println();
    }
    //如果一个字符串包含两个相邻的重复子串，则称他为Easy 其他的就为困难串
    public static boolean isEasy(String s){
        for (int len = 2; len < s.length(); len+=2) {   //遍历长度为2的字串，在其中分两半一一对应找
            for (int start = 0; start+len < s.length(); start++) {
                String sub=s.substring(start,start+len);
                String left=sub.substring(0,len/2);
                String right=sub.substring(len/2,len);
                if(left.equals(right))return true;
            }

        }
        return false;
    }
}
