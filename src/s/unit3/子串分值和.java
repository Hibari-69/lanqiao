package s.unit3;

//贡献思想

//就是那种需要考虑所有字串的情况的题目
import java.util.Arrays;
import java.util.Scanner;

public class 子串分值和 {

    //贡献思想：就是考虑每一个位置能贡献多少；
    //子序列与字串的区别：子串是连续的；子序列是非连续的
    static int[] last=new int[26];//记录每个字母上一次出现的位置;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray();
        int n=s.length;
        Arrays.fill(last, -1);
        long ans=0;
        for(int i=0;i<n;++i){
            //加上当前位置这个字符的贡献
            ans+=(long)(i-last[s[i]-'a'])*(n-i);
            last[s[i]-'a']=i;
        }
        System.out.println(ans);
    }

}

