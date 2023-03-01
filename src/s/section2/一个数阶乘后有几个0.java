package s.section2;

import java.math.BigInteger;

public class 一个数阶乘后有几个0 {
    public static void main(String[] args) {
        int n=100;
        f1(n);
        f2(n);

    }

    // n:一个数 ;  因子能拆出来几个5 就能提供几个0
    public static void f1(int n){
        int ans=0;
        while(n>0){
            ans=ans+n/5;    //能拆出1个5的数的个数
            n=n/5;      //能拆出 2,3..个5的数个数
        }
        System.out.println(ans);
    }

    //BigInteger
    public static void f2(int n){
        BigInteger a=new BigInteger("1");
        for (int i = 1; i <=n; i++) {
            a=a.multiply(BigInteger.valueOf(i));
        }
        String s=a.toString();
        int count=0;
        for (int i = s.length()-1; i >=0 ; --i) {
            if(s.charAt(i)!='0')break;
            count++;
        }
        System.out.println(count);
    }


}
