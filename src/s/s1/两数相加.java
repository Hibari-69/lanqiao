package s.s1;

import java.util.Scanner;

public class 两数相加 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(sc.hasNext()){
            n=sc.nextInt();
            if(n==0)break;
            int n2=0;
            for (int i = 0; i < n; i++) {
                n2=sc.nextInt();
                if(n2==0)break;
                int sum=0;
                for (int j = 0; j < n2; j++) {
                    sum+=sc.nextInt();

                }System.out.println(sum);
            }
            System.out.println();//打个空行
        }
    }
}
