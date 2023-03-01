package s.s2;

import java.util.Scanner;

public class 最大化交易利润 {
//    注意放在最小值上:超简单的了
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] c=new int[n];
    for (int i = 0; i < n; i++) {
        c[i]=sc.nextInt();
    }

    int ans=(int) -1e5;
    int min=(int) 1e5;
    for (int i = 0; i < n; i++) {
        ans=Math.max(ans,c[i]-min);
        min=Math.min(min,c[i]);//同时维护一下min; O(n)
    }
    System.out.println(ans);
}
}
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] c=new int[n];
//        for (int i = 0; i < n; i++) {
//            c[i]=sc.nextInt();
//        }
//        int max1=(int)-1e7,max2=(int)-1e7;
//        while(n-1!=0){
//            int x=c[n-1];
//            for (int i = 0; i < n-1; i++) {
//                max1=Math.max(max1,x-c[i]);
//            }
//            n--;
//            max2=Math.max(max1,max2);
//        }
//        System.out.println(max2);
//
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] a=new int[(int) 1e4];
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.nextInt();
//        }
//        int max=0;
//        int maxi=0;
//        for (int i = 0; i < a.length; i++) {
//            if(max<a[i]) {
//                max = a[i];
//                maxi=i;
//            }
//        }
//        int ans=0;
//        int min=0;
//        if (maxi!=0){
//            min=a[0];
//            for (int i = 0; i < maxi-1; i++) {
//                if(a[i]<min)min=a[i];
//            }}
//        int max2=a[maxi+1];
//        for (int i = maxi+1; i < a.length; i++) {
//            if(a[i]>max2){max2=a[i];
//            }
//        }
//        if(maxi!=0)
//            System.out.println(Math.max(max2-max,max-min));
//        else System.out.println(max2-max);
//    }
////啊哈哈哈这种太贪了,可是我这解决不了 like 5 9 1 8 这种数鸭我艹·