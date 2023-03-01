package s.section2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//如果嫩找到一个长度为x的美丽区间，那么也一定能找到一个长度大于x的美丽区间.
//给的数据就是正数，我们这边可以二分答案；

public class 美丽区间 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    static int N=100010;
    static int[] a=new int[N],g=new int[N];
    public static void main (String[] args)throws IOException {
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int t=Integer.parseInt(s[1]);
        int ans=N;
        s=br.readLine().split(" ");
        for(int i=1;i<=n;++i){
            a[i]=Integer.parseInt(s[i-1]);
            g[i]=g[i-1]+a[i]; // 前缀和函数
        }
        //枚举l
        for(int i=1;i<=n;++i){
            int l=i,r=n;
            while(l<r){
                int mid=l+r>>1;

                if(g[mid]-g[i-1]>=t)r=mid;  //滑窗  枚举l; R 用二分找

                else l=mid+1;
            }
            if(g[r]-g[i-1]>=t)ans=Math.min(ans,r-i+1);
        }
        System.out.println(ans==N?0:ans);
        out.flush();


    }

}

