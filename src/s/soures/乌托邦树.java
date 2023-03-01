package s.soures;

import java.math.BigInteger;
import java.util.Scanner;
//这个太容易i爆了;

public class 乌托邦树 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger ans= new BigInteger("1");
        if(n==0) System.out.println(1);;
        int flag=1;//为循环BigInteger
        while(n!=0){
            if(flag==1){
                ans=ans.add(ans);//BigInteger.multiply(new BigInteger("2")) 乘2
                flag=0;
            }
            else {
                ans=ans.add(new BigInteger("1"));
                flag=1;
            }
            n--;
            System.out.println(ans);
        }
        System.out.println(ans);

    }
}
