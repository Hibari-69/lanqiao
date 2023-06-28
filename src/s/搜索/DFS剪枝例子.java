package s.搜索;

import java.util.Scanner;
//dfs将数n分成k个数相加方案不重复
public class DFS剪枝例子 {

    //1 1 5 ； 1 5 1视为重复
    static int ans, cnt=0;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        ans=0;
        int min=1;//用来防止  1 1 5 ； 1 5 1这种重复的情况
        int ans=0;//方案个数
        dfs(n,k,min,"");
        System.out.println(cnt);

    }
    /***
     *
     * @param n	//待划分的数
     * @param k //份数
     * @param min //保证唯一 、  构造非降序、
     * 	min 为 目前被拆分使用的最大的值  下次拆分可用的最小值
     * @param s 详细记录下过程
     */
    public static void dfs(int n,int k,int min,String s){
        cnt++;
        if(k==1&&min<=n){
            ans++;
            System.out.println(s+n);
            return;
        }

        if(min*k>n)return;//剪枝	 次数能少一半

        for(int i=min;i<=n;++i){
            dfs(n-i,k-1,i,s+i+"+");
        }

    }


}
