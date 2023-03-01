package s;

import java.util.Scanner;

public class 三数乘积 {
    static int N=1010;
    static int[] a=new int[N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        //ans用来记录答案
        //每次来对比一下
        //超过1e9就可以开long 了   O(n^3) 1e9 一般已经超时了 1e8
        int ans= (int) -1e9;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    ans=Math.max(ans,a[i]*a[j]*a[k]);
                }
            }
        }
        System.out.println(ans);
    }
}
