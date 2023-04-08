package s.unit5;

//先入先出

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// n个人 第m个出列  最后剩下谁？
public class 队列约瑟夫环 {
    // 芜湖芜湖！
    //不到m 出列再入列
    //到了m 出列
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            int cnt=1;
            for (int i = 1; i <= n; i++) {
                q.offer(i);
            }
            while(!q.isEmpty()){
                if(cnt==m){
                    System.out.println(q.poll()+"->");
                    cnt=1;//detail
                }
                else {
                    cnt++;
                    q.offer(q.poll());  //出队再入队
                }
            }
            System.out.println();

        }
    }
}
