package s.搜索;

import java.util.Arrays;

public class 二进制递归树2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a=new int[4];
        dfs(0,a);
    }

    public static void dfs(int depth,int[] a){
        if(depth==4){

            System.out.println(Arrays.toString(a));
            return;
        }
//		a[depth]=0;dfs(depth+1,a);
//		a[depth]=1;dfs(depth+1,a);
        //就是把上面 =0 =1 的状态 用for 循环代替了
        for(int i=1;i<4;++i){
            a[depth]=i;
            dfs(depth+1,a);
        }
    }

}

