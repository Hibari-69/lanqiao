package s.unit5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//先进后出

//有问题 。。。
public class 栈的基础 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            String bds=sc.next();
            Stack<Character> s=new Stack<Character>();
            if(bds.equals("#"))break;
            char[] c=bds.toCharArray();
            System.out.println(Arrays.toString(c));
            int i = 0;
            for (; i < c.length; i++) {
                if(c[i]=='('||c[i]=='[')s.push(c[i]);// 放进去
                else if(c[i]==']'){
                    if(s.isEmpty()||s.pop()!='{')break;                //peek() 是只看不把它取出来 pop() 是把ta取出来
                }

                else if(c[i]==')'){
                    if(s.isEmpty()||s.pop()!='[')break;
                }
                System.out.println(s);

            }
            System.out.println(i);
            System.out.println(s.size()==0&&i==c.length?"Yes":"No");


        }
    }

}
