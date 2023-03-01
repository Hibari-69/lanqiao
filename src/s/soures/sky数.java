package s.soures;

import java.util.Scanner;

//天空树定义：这个数的十进制各位的和与这个数16进制,12进制数的各个数位的数和相等;

public class sky数 {
    public static void main(String[] args) {
        int a=0;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            a=sc.nextInt();
            if(getRsum(a,10)==getRsum(a,16)&&getRsum(a,10)==getRsum(a,12))
                System.out.println("yes");
            else System.out.println("no");
        }
    }
    public static int getRsum(int n,int r){
        int sum=0;
        while(n>0){
            sum+=n%r;
            n/=r;
        }
        return sum;
    }
}
