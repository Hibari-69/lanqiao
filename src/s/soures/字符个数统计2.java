package s.soures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//开个哈希表太浪费了、创个数组来进行桶计数

public class 字符个数统计2 {
    //a->0 b->1 c->2 d->3
    static int[] cnt=new int[26];   //创一个计数数组
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        for (int i = 0; i < s.length(); i++) {
            //记录出现最多次数的字符出现了多少次
            char c=s.charAt(i);
            //c=='a' c-'a' =0   'b'-'a'=1 a、b的ASCII码值相差1  这个位置加1
            cnt[c-'A']++;
        }
        List<Integer> list=new ArrayList<>();
        int max=0;
        //遍历这个桶
        //0->A  25->Z
        for (int i = 0; i < 26; i++) {
            if(cnt[i]>max){
                list.clear();
                list.add(i);
                max=cnt[i];
            } else if (cnt[i]==max) {
                list.add(i);
            }
        }for(int i:list){
            System.out.println((char)(i+'A'));
        }
    }
}
