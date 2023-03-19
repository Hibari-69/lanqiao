package s.unit3;

import java.util.Scanner;

public class 周期串基础版 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            String words=sc.next();
            period1(words);
            period2(words);
            period3(words);
        }
    }

    public static void period1(String s){
        char[] f=s.toCharArray();//转化为字符数组方便操作
        boolean isok=true;//假设当前周期合理的
        int t=1;
        for(;t<=f.length;++t) {//把所有可能的周期都试探一遍
            if (f.length % t == 0) {//周期串的长度一定是周期的倍数,还是要这样判断下 不然会出现  输入abca 返回 3
                isok = true;
                for (int start = 0; start < f.length; start++) {
                    if (f[start] != f[start % t]) {
                        isok = false;
                        break;
                    }
                }
                if (isok == true) break;
            }
        }
            System.out.println(t);

    }
    public static void period2(String s){
        String s1=s+s;
        int n=s1.length();
        int pos=1;
        for ( ; pos < n; pos++) {
            if(s.length()%pos!=0)continue;//只考虑能够成为字串长度约数的字符串
            if(s1.substring(pos,s.length()+pos).equals(s)) {
                break;
            }
        }
        System.out.println(pos);
    }

    public static void period3(String s){
        for (int len = 1; len <= s.length(); len++) {
            if(s.length()%len==0){//只考虑能够成为字串长度约数的字符串
                String sub=s.substring(0,len);
                if(s.replace(sub,"").length()==0){
                    System.out.println(len);
                    break;
                }
            }

        }
    }


}
