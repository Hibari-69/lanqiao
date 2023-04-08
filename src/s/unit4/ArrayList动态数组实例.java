package s.unit4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList动态数组实例 {

    //有点类似hashmap 的getOrDefault 的功能吧
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n<=0)break;
            ArrayList<balloon> list=new ArrayList<>();
            for (int i = 1; i <=n; i++) {
                String qiqiu =sc.next();//读取气球的颜色
                boolean isexist=false;//假设这颜色不存在
                for (int j = 0; j < list.size(); j++) {
                    if(list.get(j).color.equals(qiqiu)){
                        list.get(j).count++;//这个颜色的气球又多了一次
                        isexist=true;
                        break;
                    }
                }
                if(!isexist)list.add(new balloon(qiqiu,1));

            }
            Collections.sort(list);
            System.out.println(list.get(0).color);
        }
    }
}
class balloon implements Comparable<balloon>{
    public String color;
    public int count;//气球的颜色和次数

    //构造函数和类同名
    public balloon(String color,int count){
        this.color=color;
        this.count=count;
    }

    @Override
    public int compareTo(balloon o) {
        return o.count-this.count;//o.count 就是别人的count  后面如果反了 就颠倒一下就好了
    }
}
