package s.section2;

import java.util.Scanner;

public class 阶乘打个表 {
    public static void main(String[] args) {
//        long x=1;
//        for (long  i = 1; i <=10; i++) {
//            x=i*x;
//            System.out.print(x+",");
//            }
        //得：1,2,6,24,120,720,5040,40320,362880,3628800
        //

        //静态打表;
        int[] fac={1,2,6,24,120,720,5040,40320,362880,3628800};
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            long n=sc.nextLong();
            for (int i = fac.length-1; i >=0 ; i--) {
                if(n>=fac[i])n-=fac[i];
            }
            System.out.println(n==0?true:false);

        }


    }
    }

