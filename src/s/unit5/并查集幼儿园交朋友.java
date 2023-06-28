package s.unit5;

import java.util.Scanner;

//
public class 并查集幼儿园交朋友 {
    static int N=200010;
    static int[] p=new int[N];//p[i]表示该学生属于哪个集合
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        //并查集初始化
        for (int i = 0; i <=n; i++) {
            p[i]=i;//最开始指向ta自己（自己是自己的朋友）
        }
        for (int i = 0; i < m; i++) {
            int op=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(op==1) {//就链接
                merge(x, y);
            }else{
       //         System.out.println("\n");
                if(find(x)==find(y)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    static int find(int x){//查找ta 的祖先   路径压缩...
        if(p[x]!=x)p[x]=find(p[x]);
        return p[x];
    }
    static void merge(int x,int y){//就是merge祖宗节点就行了
        x=find(x);
        y=find(y);
        p[x]=y;         //链接起来
    }
}
//no
//yes
//yes
