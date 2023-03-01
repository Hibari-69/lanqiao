package s.section2;

import java.util.Scanner;

public class 数列123 {
    //1 1 2 1 2 3 1 2 3 4 ...
    //这个数列中，连续一段的和是多少
    static long[] s=new long[1500010];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //预处理得到s[i] 表示 前i个 区间的和[块]
        long t=0;
        for (int i = 1; i < 1500000; i++) {
            t+=i;
            s[i]=s[i-1]+t;
        }

        int n=sc.nextInt();
        while(n-- > 0){

            long a=sc.nextLong(),b=sc.nextLong();
            System.out.println(slove(b)-slove(a-1));
        }





    }

    //用二分求给 出的 l r 分别在第几个块中;
    private static long slove(long x){
        int l=1,r=1500000;
        while(l<r){
            int mid=l+r>>1;
            if(f(mid)<x)
                l=mid+1;
            else
                r=mid;
        }
        r--;//求得前面块
        x -=f(r);//当前块的位置
        return s[r]+f(x);

    }

    //求出[1,n] 的值;
    private static long f(long x){
        return (1L+x)*x/2;  //等差数列求和
    }




}
