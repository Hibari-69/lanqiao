package s.分治算法;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 快速幂 {

    public static void main(String[] args)throws IOException {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            long a=sc.nextLong();
            long n=sc.nextLong();
            long p=131;//防止爆int
            System.out.println((long)Math.pow(a, n)%p);
            //System.out.println(fenzhi(a,n));
            System.out.println(an(a,n,p));
        }

    }
    //来, 快速幂；四个大字 ：扩低降幂S
    public static long an(long a,long n,long p){
        long ans=1;

        while(n>0){
            //这里if这里哦~;1.判断奇偶 是奇数的时候单独乘个a先
            if((n&1)==1)ans=ans*a%p;//2.充当出口；
            n>>=1;
            a=a*a%p;
        }
        return ans;
    }

    //分治+递归思想
    //这里 奇数时 咱可以 把a^n 拆成 a^[(n-1)/2]*a^[(n+1)/2]
    //	    偶数时					a^(n/2)*a^(n/2)   这样的子问题 的 递归式
    //
    public static long fenzhi(long a,long n){
        if(n==0)return 1;
        if(n==1)return a;
        if((n&1)==0)return fenzhi(a, n/2)*fenzhi(a,n/2);
        else return fenzhi(a, (n-1)/2)*fenzhi(a, (n+1)/2);
    }

}

