package s.unit5;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//最后先输出 vip窗口的人 再 输出 normal窗口的人
//5
//IN xiaoming N
//IN Adel V
//IN laozhao N
//OUT N
//IN CLZ V
//就是个java 队列的API 掌握

public class 队列银行排队 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        int m=Integer.parseInt(br.readLine());
        Queue<String> qv=new LinkedList<>();
        Queue<String> qn=new LinkedList<>();
        for(int i=0;i<m;++i){
            String[] s=br.readLine().split(" ");
            if(s[0].equals("IN")){
                if(s[2].equals("V"))qv.add(s[1]);
                else qn.add(s[1]);
            }else{
                if(s[1].equals("V"))qv.poll();
                else qn.poll();
            }
        }
        while(!qv.isEmpty())out.println(qv.poll());
        while(!qn.isEmpty())out.println(qn.poll());
        out.flush();
    }
}
//输出：
//Adel
//CLZ
//laozhao
