package s.section2;

import java.math.BigInteger;
//一共有64个格子的棋盘;第一个格子放1个;

public class 棋盘放麦子 {
    public static void main(String[] args) {
        BigInteger x=new BigInteger("1");
        BigInteger ans=new BigInteger("1");

        for (int i = 1; i < 64; i++) {
            x=x.multiply(new BigInteger("2"));
            ans=ans.add(x);


        }
        System.out.println(ans);
        //18446744073709551615

    }
}
