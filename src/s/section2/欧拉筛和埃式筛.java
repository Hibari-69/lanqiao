package s.section2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 欧拉筛和埃式筛 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oraoraora(n);
        SieveOfEra(n);

    }
    //埃式筛

    public static void SieveOfEra(int n){
        List<Integer> isprime=new ArrayList<>();
        boolean [] a=new boolean[n+1];
        //Arrays.fill(a,true);  这个用法能用来填数组
        for (int i = 2; i <= n; i++) {
            if(a[i]!=true)isprime.add(i);
            for (int j = 2; j <= n/i; j++) {
                a[i*j]=true;
            }

        }
        System.out.println(isprime);
    }




    //欧拉筛(线性筛)
    //让这个合数被它的最小质因子筛掉
    public static void oraoraora(int n){
        boolean [] a=new boolean[n+1];
        List<Integer> isprime =new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if(a[i]!=true)isprime.add(i);
            for (int j = 0; j < isprime.size()&&i* isprime.get(j) <=n; j++) {
                a[isprime.get(j)*i]=true;
                if(i%isprime.get(j)==0)break;   //这句吊;
            }
        }
        System.out.println(isprime);
    }
}
