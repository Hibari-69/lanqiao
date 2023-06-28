package s.unit3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 数位排序2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        //如果是要自定义排序的话 Integer[]
        Integer[] a=new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i]=i+1;
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //a是o1的数位和，b是o2的数位和
                int a=check(o1);
                int b=check(02);
                if(a!=b)return a-b;
                else return o1-o2;
            }
        }) ;
    }
    static int check(Integer x){
        int res=0;
        while(x!=0){
            res+=x%10;
            x/=10;
        }
        return res;
    }
}


