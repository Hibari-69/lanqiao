package s.section2;

import java.io.*;
import java.util.Scanner;

public class 统计子矩阵 {

    //查询子矩阵的和,那就要先处理二位区间的前缀和数组;如果去遍历的话n^4那肯定就超时了;那我们就去枚举纵坐标
    //
    static int n,m,k;
    static int[][] a=new int[510][510];
    static int[][] b=new int[510][510];
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    //static StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));


    public static void main(String[] args) throws IOException {
        String[] s=br.readLine().split(" ");
        n=Integer.parseInt(s[0]);
        m=Integer.parseInt(s[1]);
        k=Integer.parseInt(s[2]);

        for (int i = 1; i <= n; i++) {
            s=br.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                a[i][j]=Integer.parseInt(s[j-1]);
                b[i][j]=b[i-1][j]+b[i][j-1]-b[i-1][j-1]+a[i][j];    //二维数组的前缀和! :)
            }
        }

        long res=0;
        //枚举上下的边
        for (int x1 = 1; x1 <= n; x1++) {
            for (int x2 = x1; x2<=n ; x2++) {
                //来个双指针
                int l=1;
                int r=1;
                while(r<=m){
                    while(l<=r&&!check(x1,l,x2,r))l++;
                    res+=(long)r-l+1;
                    r++;
                }
            }
        }
        System.out.println(res);



    }
    public static boolean check(int x1,int y1,int x2,int y2){
        return b[x2][y2]-b[x1-1][y2]-b[x2][y1-1]+b[x1-1][y1-1]<=k;      //判断目标数组的

    }
}
