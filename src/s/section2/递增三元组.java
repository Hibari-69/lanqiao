package s.section2;

import java.io.*;
import java.util.Arrays;

public class 递增三元组 {
    //当a数组中小于bj的个数为x个;c数组中大于bj的个数为y个;那么以bj(确定的元素)为中间元素，存在多少答案？x*y个
    //那么问题来了:如何确定a和c中有多少个比bj小;我们就可以使用二分了;但是由于a,c数组不是有序的,先排序;
    //在a中找到大于bj 的位置,在b中找到大于b的位置

    //二分和双指针这两个东西有很多地方都能使用 ,nlongn
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    static final int N=100010;
    static int[] a=new int[N],b=new int[N],c=new int[N];
    public static void main(String[] args) throws IOException {
        String[] s=br.readLine().split(" ");
        int k=Integer.parseInt(s[0]);
        s=br.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            a[i]=Integer.parseInt(s[i]);
        }
        s=br.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            b[i]=Integer.parseInt(s[i]);
        }
        s=br.readLine().split(" ");
        for(int i=0;i<k;++i){
            c[i]=Integer.parseInt(s[i]);
        }
        //先对a,c数组排序
        Arrays.sort(a,0,k);

        Arrays.sort(c,0,k);

        long cnt=0;

        //枚举b[]
        //二分了两次 复杂度 nlognlongn nlong^2
        for(int i=0;i<k;++i){
            //在a中二分
            int l=0,r=k-1;
            while(l<r){
                int mid=l+r+1>>1;
                if(a[mid]<b[i])l=mid;
                else r=mid-1;           //这里mid+1,mid-1 有点懵
                                        //如果需要l=mid mid=l+r+1;
            }

            //在b中二分
            int t=r;
            l=0;
            r=k-1;
            while(l<r){
                int mid=l+r>>1;
                if(c[mid]>b[i])r=mid;
                else l=mid+1;
            }

            //最后判断是否符合要求
            if(a[t]<b[i]&&c[r]>b[i])cnt+=(long) (t+1)*(k-r);

        }

        out.println(cnt);
        out.flush();
    }
}
