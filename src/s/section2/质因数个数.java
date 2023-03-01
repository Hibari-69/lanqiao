package s.section2;

import java.util.Scanner;

public class 质因数个数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        Long count = Long.valueOf(0);
        for (int i = 2; i < n/i; i++) {
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                }
                count ++;
            }

        }
        if(n>1)count ++;
        System.out.println(count);
    }
}
