package s.section2;

import java.util.Scanner;

public class TwoBigNumberAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String a=sc.next(),b=sc.next();
            String ans="";
            a=new StringBuffer(a).reverse().toString();
            b=new StringBuffer(b).reverse().toString();
            int jw=0;
            for (int i = 0; i <= Math.max(a.length(),b.length()); i++) {
                int ai=i<a.length()?a.charAt(i)-'0':0;  //这里没有限制条件,可能会造成字符串越界;这样打个补丁;
                int bi=i<b.length()?b.charAt(i)-'0':0;
                int temp=ai+bi+jw;
                ans=temp%10+ans;    //ans=ans+temp%10 这样有反转作用;就不用输出时反转了;
                jw=temp/10;
            }
            //if(jw==1)ans="1"+ans;
            System.out.println(ans);
        }
    }
}
