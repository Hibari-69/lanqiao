package s.unit3;

//哈希带二分
//例如: 统计小写字母子串的哈希值  p为进制
// hasht[i]=hasht[i-1]*p+(t[i]-96)
//进制哈希 O(1) 能够快速获取字串哈希值

import java.io.*;
import java.util.Arrays;

public class 最长公共连续子串 {
    //1.input s,t 生成字符串哈希 p=131 (大一点的质数) hs[i]=hs[i-1]*p+s.charAt(i)-96;
    //2.[0,min{s.length,t.length}] 里去做二分


    public static int base=131; //把字符串当作一个 p 进制数
    public static long M=Long.MAX_VALUE;//防溢出
    public static long[] hashs=new long[100005];//储存字符串S的哈希前缀和for(){hs[i]=hs[i-1]*p+s[i]-96}
    public static long[] hasht=new long[100005];//储存字符串T的哈希前缀和for(){hs[i]=hs[i-1]*p+s[i]-96}
    public static long[] hasha=new long[100005];//临时储存字串
    public static long[] p=new long[100005];//用来计算p的次方的。

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));

        String s=br.readLine();
        String t=br.readLine();

        for (int i = 1; i <= s.length(); i++)hashs[i]=(hashs[i-1]*base+s.charAt(i-1)-96)%M;
        for (int i = 1; i <= t.length(); i++)hasht[i]=(hasht[i-1]*base+t.charAt(i-1)-96)%M;
        for (int i = 1; i <= Math.max(s.length(),t.length()); i++) p[i]=((p[i-1]*base))%M;


        int l=0,r=Math.min(s.length(),t.length());

        //理论上边界还要再特判一下
        while(l<r){
            int mid=l+r>>1;
            if(checkLenMid(mid,s,t))r=mid;
            else l=mid+1;

        }
        //他这个二分有许多都检查不出来
//        while(l<=r){
//            int mid=l+r>>1;
//            if(checkLenMid(mid,s,t))l=mid+1;
//            else r=mid-1;
//        }

        out.println(r);
        out.flush();
        
    }
    public static boolean checkLenMid(int len,String s,String t){
        int cnt=0;//穷举长度为len的字串有多少个
        //hashs[i -> j] =hashs[j]-hashs[i-1]*p^(j-i) 存到hasha当中去 就是s.substring(i,j)的哈希
        for(int i=len;i<=s.length();++i)hasha[cnt++]=(hashs[i]-p[len]*hashs[i-len]);    //o(1)
        Arrays.sort(hasha,0,cnt);   //对cnt长度为len的字串进行排序，然后再次二分

        for(int i=len;i<=t.length();++i){
            long key=(hasht[i]-p[len]*hasht[i-len]);//拿到长度为len的t里的子串

            //二分的Api
            if(Arrays.binarySearch(hasha,0,cnt,key)>=0)return true;//能够找到hasha中的存在key

        }
        return false;
    }
}
