package s.搜索;

import java.util.Arrays;

//所有的计算机编程问题都可以抽象为：
//在一个状态空间里面，去搜索某一条路径,或某一个叶子节点作为ta的解

//1、状态树2、展开规则3、要么深度dfs要么广度bfs
public class 全排列的DFS解法 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        dfs(0,"",4);

    }
    //这里全排列用DFS做的话是可以把他搞成顺序输出的
    public static void dfs(int depth,String ans,int n){
        if(depth==n){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=n;++i){
            if(!ans.contains(""+i)){ //这就是传说中的减枝！不包含i的时候才需要
                dfs(depth+1,ans+i,n);
            }
        }
    }

}

