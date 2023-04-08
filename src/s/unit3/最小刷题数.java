package s.unit3;


import java.io.*;

public class 最小刷题数 {
    static int N=(int)1e5;
    static int[] a=new int[N+1];
    static int[] cnt=new int[N+1];
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));

    // 为了使得全班刷题 比他多的学生数不超过刷题比他少的学生数  ta 最少还要再刷多少道题
    //5                 5个同学
    //12 10 15 20 6

    //输出 0 3 0 0 7


    public static void main(String[] args) throws IOException {
        int n=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(s[i]);
            cnt[a[i]]++;//同时用统计人数
        }
        //前缀和
        for (int i = 1; i <= N; i++) {
            cnt[i]+=cnt[i-1];
        }
        //判断是否需要修改以及使用二分找到最小需要修改的数
        for (int i = 0; i < n; i++) {
            if(cnt[100000]-cnt[a[i]]<=cnt[Math.max(0,a[i]-1)]){
                out.print(0+" ");
                continue;
            }
            int l=a[i]+1,r=100000;
            while(l<r){
                int mid=l+r>>1;
                if(cnt[100000]-cnt[mid]<=cnt[mid-1]-1)r=mid;  //这里就是前缀和数组的满足题意条件的判断条件
                else l=mid+1;
            }
            out.print((r-a[i])+" ");

        }

        out.flush();

    }
}
