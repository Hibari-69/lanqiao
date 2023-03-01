package s.section2;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        String num="FF";//num当作16进制,那么对应的10进制应该是255;
        System.out.println(BigInteger.ONE); //BigInteger.TEN  BigInteger.ZERO 基本常量 1 0 10
        BigInteger a=new BigInteger("9527");
        System.out.println(a);
        BigInteger b=new BigInteger(num,16);    //把num作为16进制输出
        System.out.println(b);
        System.out.println(b.toString(8));//3 7 7
        System.out.println(b.toString(2));//11 111 111
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
        System.out.println(a.gcd(b));
        System.out.println(a.isProbablePrime(10));  //1-(1/(2^10)) 的概率不出错
        //a^b%p  快速幂
        BigInteger two=new BigInteger("2");
        System.out.println(BigInteger.TEN.modPow(two,new BigInteger("13")));
        //10^2%13

    }
}
