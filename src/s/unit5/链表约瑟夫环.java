package s.unit5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 链表约瑟夫环 {

    // N=6 M=3   六个人围成一圈；每第三个人出列；最后留下是？


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        node head=new node(1); //头节点 第一个人
        node temp=head; //最开始指向链表开头
        for (int i = 2; i <= n; i++) {
            temp.next=new node(i);  //2-n 依次入队
            temp=temp.next;
        }
        temp.next=head; //为了形成环，最后一个指向头指针

        int cnt=1;
        while(head.next!=head){

            if(cnt==m-1){
                System.out.println(head.next.val+"->");
                head.next=head.next.next;       //出列  考研要考的话大概就要考这句 :D
                cnt=1;
            }else cnt++;

            head=head.next;     //每次都向后移一个、就当模板记一下先

        }

        System.out.println(head.val);
    }
}
class node{
    int val;
    node next;
    public node(int val){
        this.val=val;
    }
}
