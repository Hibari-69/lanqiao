package s.s1;

import com.sun.source.doctree.IndexTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fast {
    public static void main(String[] args) {
        //System.in 读取的字节流 InputStreamReader字节流->字符流转换的一个桥梁
        //BufferedReader 类从字符输入流中带缓存功能的读取字符.readLine() 按行读取字符串
        //34 43
        //344 433
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String line="";//每次从in里面去读取一行字符串

            try {
                while((line=in.readLine())!=null){
                    String[] s=line.split(" +");//弄个+多个空格也能拆分了，regex 正则表达式
                    int a= Integer.parseInt(s[0]);//把字符串转换成整数
                    int b=Integer.parseInt(s[1]);
                    System.out.println(a+b);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
}
