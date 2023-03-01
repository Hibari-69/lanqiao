package s.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 卡牌 {
    static int N=200010;
    static int[][] a=new int[2][N];
    static long n,m;
    static BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] s=br.readLine().split(" ");
         n=Long.parseLong(s[0]);
         m=Long.parseLong(s[1]);
        s=br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[0][i]=Integer.parseInt(s[i]);
        }
        s=br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[1][i]=Integer.parseInt(s[i]);
        }
        int l=0,r=N*2;
        while(l<r){
            int mid=(l+r+1)>>1;
            if(check(mid))l=mid;
            else r=mid-1;
        }
        System.out.println(r);

    }
    //问题为：小明最多能凑出多少套牌?这里我们看问题就能看出二段性：
    //能凑出答案X套牌;那么小于X套牌也能凑出;大于X套牌一定不能凑出;
    //有的题给的数据有单调性,可能能用得上二分;
    public static boolean check(int mid){
        long x=m;
        for (int i = 0; i < n; ++i) {
            if(a[0][i]>mid)continue;
            if(a[0][i]+a[1][i]<mid)return false;
            if(a[0][i]+a[1][i]>=mid&&x>=mid-a[0][i]){
                x-=(mid-a[0][i]);
            }else{
                return false;
            }


        }return true;


    }
}
//wa了
