package s;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 三数乘积2 {
    static int N=1010;
    static int[] a=new int[N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            //int x =sc.nextInt();
            //list.add(x); 用list去存
        }

        //如果数组都是正数，我们就选出最大的三个
        //Collections.sort(list);

        Arrays.sort(a,0,n);//排序；数组a 区间o-n;

        //arrays.sort() 就相当于 quicksort()

        //Java里面自带的排序函数一般是用的快排;复杂度一般视为nlogn 一般能解决1e5 1e6 1e7危险的问题;
        //复数情况
        //-1000 -1000 1 2 3 就选两个负数加一个正数
        int ans =a[n-1]*a[n-2]*a[n-3];
        ans=Math.max(ans,a[0]*a[1]*a[n-1]);
        System.out.println(ans);

        //int ans=list.get(n-1)*list.get(n-2)*list.get(n-3);
        //ans=Math.max(ans,list.get(0)*list.get(1)*list.get(n-1));
        //System.out.println(ans);

    }
}


