package s.s2;

import java.util.Scanner;

//
public class 吃糖果2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //记录的总长
        long l=0;
        //记录最大一次放入的数量
        int max=0;
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            l+=x;
            max=Math.max(x,max);    //我测,这里这样写就可以不用创数组放进去再对比了
        }
        System.out.println(max*2L-l>1?"NO":"YES");
    }
}
