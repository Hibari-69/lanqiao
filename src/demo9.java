import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class demo9 {
    //a -> z
    public static void main(String[] args) {
        String s="aa";

        //a1的位置
        int a1=check1(s);
            String s1 = s.substring(0, a1 + 1);
            //a2 的位置
            String s2 = s.substring(a1 + 1);
            if (s1.length() > 1) {
                String temp = s.substring(0, a1);
                String temp2 = s.substring(a1);
                System.out.println(change(temp) + temp2);
                System.exit(1);
            }

        if(check1(s2)==-1){
            System.out.println(s1+change(s2));
            System.exit(1);
        }
        String s3=s2.substring(a1+1,check1(s2));
        String s4=s2.substring(check1(s2));
        System.out.println(s1+change(s3)+s4);



    }
    //返回第一个a 的位置
    public static int check1(String s){
        int logca=-1;
        for (int i = 0; i < s.length(); i++) {
            if("a".equals(s.charAt(i)+"")){
                logca=i;
                break;
            }
        }
        return logca;
    }

    public static String change(String s){
        char[] temp=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(temp[i]=='a')temp[i]='z';
            else temp[i]= (char)(temp[i]-1);
        }
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            ans+=temp[i]+"";
        }
        return ans;

    }
}
