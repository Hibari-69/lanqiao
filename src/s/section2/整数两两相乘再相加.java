package s.section2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class 整数两两相乘再相加 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));

    //就是说 1e5 2e5 这样的数据范围 一般就卡的是 n^2 的做法


    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Long [] a=new Long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        long ans=0;
        Long[] b=Arrays.copyOf(a,n);
        bbb(b);
        for (int i = 1; i < n; i++) {
            ans+=a[i]*b[i-1];
            System.out.println(ans);
        }
        for (long x :
                b) {
            System.out.print(x);

        }
        //System.out.println(ans);


    }
    public static Long[] bbb(Long [] x){
        for (int i = 1; i <x.length; i++) {
            x[i]+=x[i-1];
        }
        return x;

    }
}

// 上面的做法是超时的，上面创建bbb 方法的目的是获得前缀和；
//然而其实在第一次遍历数组的同时我们就可以同时统计出来前缀和；pre+=a[i-1];

//    public static void main(String[] args) throws IOException {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        Long [] a=new Long[n];
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.nextLong();
//        }
//        long ans=0;
//        long pre=0;
//        for (int i = 1; i < n; i++) {
//            pre+=a[i-1];
//            ans+=a[i]*pre;
//        }
//
//        System.out.println(ans);
//
//
//    }
