package s.section2;

import java.util.Scanner;

//约数的个数 = 这个数的相乘的每个质因子的指数+1再相乘;

public class n的约数的个数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int num=1;
            int x=n;
            for (int i = 2; i < x/i; i++) {
                int a=0;
                while(x%i==0){
                    x/=i;
                    a++;
                }
                num*=a+1;
            }
            System.out.println(x>1?num*2:num);

            //num *2  当还有一个素数时，应该是* 他本身的指数1 再加1 也就是 * 2；
        }

    }
}
