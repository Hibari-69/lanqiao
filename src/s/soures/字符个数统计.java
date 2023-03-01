package s.soures;

import java.util.*;

public class 字符个数统计 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //肯定要有一个东西去统计每个字符出现的次数
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            //记录出现最多次数的字符出现了多少次
            //put是放入key =c
            //如果你map.get(x) 然而x是没有的 ->报错
            // getOrDefault (c,0) 如果没有这个c 就返回 0 ;如果存在,就返回key的value;
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);

        }
        //记录出现最多次的字符出现了多少次
        int max=0;
        //用来存答案
        List<Character> list = new ArrayList<>();
        //key 存取的字符
        for(char key: hashMap.keySet()){
            int x= hashMap.get(key);
            if(x>max){
                list.clear();
                list.add(key);
                max=x;
            } else if (x==max) {
                list.add(key);
            }

        }
        Collections.sort(list); //这里最好是排个序
        for(char c:list){
            System.out.print(c);
        }

    }
}
