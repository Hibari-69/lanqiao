package test.lc_dp_wanna;

import java.util.Scanner;

//lc 25666
public class 替换数字后的最大差值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int x = num;
        int[] spt = new int[11];

        while (x > 0) {
            spt[i] = x % 10;
            x /= 10;
            i++;
        }
        i--;
        int mio = spt[i];
        while (i >= 0 && spt[i] == 9) {
            i--;
        }
        int mao = 0;
        if (i < 0) {
            mao = spt[i];
        }


        x = num;
        int mi = 0;
        int ma = 0;
        int k = 1;
        while (x > 0) {
            int t = x % 10;
            int tmi = t;
            int tma = t;
            if (t == mio) {
                tmi = 0;
            }
            if (t == mao) {
                tma = 9;
            }
            mi = mi + tmi * k;
            ma = ma + tma * k;
            k *= 10;
            x /= 10;
        }
        System.out.println(ma - mi);


    }
}
