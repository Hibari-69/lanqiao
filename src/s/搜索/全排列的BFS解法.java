package s.搜索;

import java.util.LinkedList;
import java.util.Queue;

public class 全排列的BFS解法 {

    //二叉树的层次遍历  从上往下 从左往右  这时候就轮到咱们的队列出场了
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=3;
        Queue<String> q=new LinkedList<>();
        for(int i=1;i<=n;++i)q.offer(""+i);

        while(!q.isEmpty()){
            String head=q.poll();//弹出对头

            //拿着head 往后面加 有点像dfs的分支
            for(int i=1;i<=n;++i){
                if(head.contains(""+i))continue;//剪枝

                if((head+i).length()==n)System.out.println(head+i);
                else q.offer(head+i);
            }
        }
    }

}

