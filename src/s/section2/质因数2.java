package s.section2;

import java.util.Scanner;

//指定区间有多少个数能被分解为12个质因子相乘
//[2333333,23333333]
//例如：28=2*2*7 ;
public class 质因数2 {
    public static void main(String[] args) {
        int ans=0;
        for (int i = 2333333; i < 23333333; i++) {
            int count=0;
            int n=i;
            for (int j = 2; j <= n/j; j++) {
                if(n%j==0){
                    while(n%j==0){
                        count++;
                        n/=j;
                    }

                }
            }
            if(n>1)count++;
            if(count==12)ans++;
        }
        System.out.println(ans);//25606
    }
}
