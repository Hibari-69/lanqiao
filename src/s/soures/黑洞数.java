package s.soures;

import java.util.Arrays;
import java.util.Scanner;
//hh,黑洞数

public class 黑洞数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] x=s.toCharArray();
        int ans = 0,count=0;
        while (ans != 6174) {
            Arrays.sort(x,0,4);
            char[] min=x;
            StringBuffer max=new StringBuffer(toStr(min)).reverse();
            ans=Integer.parseInt(max.toString());
            ans-=Integer.parseInt(toStr(min));
            count++;
            System.out.println(ans);
            x=String.valueOf(ans).toCharArray();
        }
        System.out.println(count);
    }

    public static String toStr(char[] min){
        //遍历 数组转字符串
        StringBuffer x = new StringBuffer();
        for (char s : min) {
            x.append(s);
        }
        return x.toString();
    }
}
