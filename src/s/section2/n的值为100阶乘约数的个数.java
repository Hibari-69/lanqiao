package s.section2;

import java.util.Arrays;

public class n的值为100阶乘约数的个数 {
    public static void main(String[] args) {
        int n=100;
        System.out.println(ans(n));

    }

    public static long ans(int n){
        int[] prime=new int[n+1];
        for (int i = 2; i <= n; i++) {
            int x=i;
            for (int j = 2; j <= x/j; j++) {
                while(x%j==0){
                    prime[j]++;
                    x/=j;
                }
            }
            if(x>1){
                prime[x]++;
            }

                //原理参照 n的约数的个数  :D
        }
        System.out.println(Arrays.toString(prime));
        long ans=1;
        for (int x :
                prime) {
            ans*=(x+1);
        }

        return ans;

    }
}
