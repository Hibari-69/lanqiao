package s.soures;

import java.util.Scanner;

//例如：4
//     1 1 2 2 3 4 4
//返回 3
// a^a=0 ; a^0=a ; a^b^c=a^c^b  !!
public class 找出单身数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,ans=0;
        while(sc.hasNext()){
            n=sc.nextInt();
            ans=0;
            for (int i = 0; i < n*2-1; i++) {
                ans^=sc.nextInt();
            }
            System.out.println(ans);
        }
    }
}
