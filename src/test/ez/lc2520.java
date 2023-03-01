package test.ez;

import java.util.Scanner;

public class lc2520 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int val=1;
        int ans=0;
        int a=num;
        int b=num;
        while(b/10!=0){val++;b/=10;}
        for(int i=0;i<val;i++){

            int nums=a%10;
            if(num%nums==0)ans++;
            a/=10;
        }
        System.out.println(ans);

    }
    }

