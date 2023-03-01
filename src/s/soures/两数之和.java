package s;

import java.util.Scanner;

public class 两数之和 {
    static int N=110;
    static int[] a=new int[N];

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        //时间复杂度O(n^2)   100*100=10000   n=1e5=100000
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]+a[j]==target){
                    System.out.println(i+" "+j);
                    //break只是break掉内层的循环;咱就用return
                    //j从i+1开始枚举咱可以少一半
                    return;


                }
            }
        }
    }
}
