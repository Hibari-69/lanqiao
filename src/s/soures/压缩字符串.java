package s.soures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 压缩字符串 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] c=sc.next().toCharArray();
        boolean f=false;
        for (int i = 1; i < c.length; i++) {
            if(c[i]==c[i-1])f=true;
        }
        if(!f){
            System.out.println("NO");//不能压缩输出NO;
            return;
        }
        //java的string是不可变的;用StringBuilder;
        StringBuilder sb=new StringBuilder();
        for (int i = 0,j=0; i < c.length; i=j+1) {

            while(j+1<c.length&&c[i]==c[j+1])j++;
            int len=j-i+1;
            sb.append(c[i]);
            if(len>1)sb.append(len);
        }
        System.out.println(sb);

    }
}
