package s.soures;

import java.util.Arrays;
import java.util.Scanner;

public class 分发饼干 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] a= new int[n];
        int [] b=new int[m];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        //最大的饼干喂最大的孩纸
        Arrays.sort(a);     //1e5 可以
        Arrays.sort(b);     //O(nlogn) 复杂度
        int l1=n-1;
        int l2=m-1;
        int ans=0;
        while(l1>=0&&l2>=0){
            if(b[l2]>=a[l1]){
                ans++;
                l1--;
                l2--;
            }else{
                l1--;
            }
        }
        System.out.println(ans);

    }
}
