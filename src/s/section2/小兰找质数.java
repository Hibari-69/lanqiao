package s.section2;

//小蓝很喜欢科研, 他最近做了一个实验得到了一批实验数据, 一共是两百 万个正整数。
//如果按照预期, 所有的实验数据
//x 都应该满足 10^7<=x<=10^8
//但是做实验都会有一些误差, 会导致出现一些预期外的数据, 这种误差数据
//y 的 范围是 10^3<=x<=10^12由于小蓝做实验很可靠, 所以他所有的实验数据中99.99% 以上都是符合预期的。
//小蓝的所有实验数据都在 primes.txt 中, 现 在他想统计这两百万个正整数中有多少个是质数, 你能告诉他吗?

//少 就说明 特判 这些少的内容 ;就整个check；
//质数 那就是 欧拉筛埃式筛单独判断

import java.io.*;

public class 小兰找质数 {

    static final int n=(int)1e8;
    static boolean[] st=new boolean[(int)1e8+1];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\java_workspace\\lq\\src\\s\\section2\\primes.txt")));
        aiss();
        long ans=0;
        while(true){
            String s=br.readLine();
            if(s==null)break;
            long v=Long.parseLong(s);   //一定要开 long 1e12 把字符串转为long类型
            if(v>n){
                if(check(v))ans++;
            }else if(!st[(int)v])ans++;
        }
        System.out.println(ans);
        System.out.println(342693);



    }
    //筛预处理 埃式筛
    public static void aiss(){
        for (int i = 2; i <= n; i++) {
            if(st[i])continue;
            for (int j = i+i; j<=n ;j+=i ) {
                st[j]=true;     //true就不是质数

            }
        }
    }

    //特判
    public static boolean check(long n){
        for (int i = 2; i < n/i; i++) {
            if(n%i==0)return false;
            }
        return true;
        }


    }

