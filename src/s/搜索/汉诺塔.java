package s.搜索;

import java.util.Scanner;

public class 汉诺塔 {
    // 需要移动 2^(几层)-1 次
    // 64 层 需要移动 2^64-1 次
    // 1、N 个问题分成子问题
    // 2、
    // 3、
    public static int step=1;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // long n=(long) Math.pow(2, 64);
        // System.out.println(n);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            step=1;
            hannuota(n, 'A', 'B', 'C');
        }
    }
    public static void hannuota(int n, char A, char B, char C) {
        //出口
        if(n==1){
            System.out.printf("第%3d步，将%3d盘子%c->%c\n",step++,n,A,C);
        }
        else{
            hannuota(n - 1, A, C, B);//前n-1移动到B,为 n 腾位置方便从A移动到C
            System.out.printf("第%3d步，将%3d盘子%c->%c\n",step++,n,A,C);
            hannuota(n - 1, B, A, C);//完成所有n个都到C
        }
    }
}
