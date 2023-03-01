package s.section2;

import java.util.Arrays;
import java.util.Scanner;
// 就是模拟 列式计算乘法
public class TowBigNumberMultiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int [] c=new int[a.length()+b.length()];
        //将a b 反转一下;好让他们从左边的低位数开始处理起走
        a=new StringBuffer(a).reverse().toString();
        b=new StringBuffer(b).reverse().toString();
        for (int i = 0; i < a.length(); i++) {
            int ai=a.charAt(i)-'0';
            for (int j = 0; j < b.length(); j++) {
                int bj=b.charAt(j)-'0';
                c[i+j]+=ai*bj;   //下标就相当于权重 权重相同相加
            }
        }
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length-1; i++) {
            int x=c[i]%10;
            int jw=c[i]/10;
            c[i]=x;
            c[i+1]+=jw;

        }
        int pos=c.length;
        while(pos!=0&&c[--pos]==0); //相当于whlie(c[pos]==0)pos--;
        while(pos>=0) System.out.print(c[pos--]); //哈哈哈,想起之前用for循环输出Arrays才瓜...

    }
}
