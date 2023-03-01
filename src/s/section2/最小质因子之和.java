package s.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class 最小质因子之和 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out= new PrintWriter(new PrintWriter(System.out));
    static int N=3000000;
    static boolean [] st=new boolean[N+1];
    static long[] pre=new long[N+1];


    public static void get_primes(int n){
        for (int i = 2; i <= n; i++) {
            //st[i]为true就跳过
            if(st[i])continue;      //!!像埃式筛 !!//这就是埃式筛XD
            //per[i] 就是i的最小质因子
            pre[i]=i;
            for (int j = i+i; j <= n; j+=i) {
                if(!st[j]){
                    st[j]=true; //把质数i倍数的合数j 数组j位置填上true 上面continue 就跳过了;
                    pre[j]=i;   //pre[j]就是j的最小质因子填上
                }

            }

        }
    }

    public static void main(String[] args) throws IOException {
        get_primes(3000000);
        //这里把它变成 前缀和数组 !
        for(int i=1;i<=N;++i)pre[i]+=pre[i-1];

        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            int x=Integer.parseInt(br.readLine());
            //pre[x] 就表示[2,x] 位的和
            out.println(pre[x]);
        }
        out.flush();

    }
}
