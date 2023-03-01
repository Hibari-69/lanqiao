package s.section2;

import java.util.Scanner;

//满足N ! 的末尾恰好有K 个 0 的最小的N 是多少?
//如果这样的N 不存在输出−1
public class 求阶乘 {
    //10^18 复杂度得是多少? log n ;  超过1e8 2e8 就爆了
    //计算n! 所含质因子p 的个数 (去搜)
    //那么问题来了，复杂度得是log n 的话；就可以想到 二分 了;
    // 5!-1个5；10!-2个5；15!-3个5；20!-4个5；25!-6个5；  那么5 个 5 也就是n! 后跟了5个0的数不存在
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long k=sc.nextLong();
        long l=1,r=(long)1e20;
        while(l<r){
            long mid=l+(r-l)>>1;
            if(check(mid)>=k)r=mid;
            else l=mid+1;
        }
        long x=check(r);
        System.out.println(x==k?r:-1);



    }
    static long check(long n){
        long ans=0;
        while (n > 0) {
            ans+=n/5;
            n/=5;
        }
        return ans;
    }
}
