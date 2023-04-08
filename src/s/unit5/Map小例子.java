package s.unit5;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map小例子 {
    //输出N个数中，出现最多的颜色
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n<=0)break;
            //key color value 次数
            Map<String,Integer> map=new HashMap<>();
            for (int i = 1; i <=n ; i++) {
                String color=sc.next();
                Integer count=map.get(color);
                if(count==null)count= 1;//第一次出现
                else count+=1;//颜色已经存在，我们次数+1
                map.put(color,count);
            }
            System.out.println(map);
            Iterator it=map.keySet().iterator();
            while(it.hasNext()){
                String x=(String)it.next();
                int a=map.get(x);
                System.out.println(x+" "+a);
            }
            int max = -1;
            String morecolor="";
            for(Object s:map.keySet()){
                int c=map.get(s);
                if(max<c){
                    max=c;
                    morecolor=(String)s;
                }
            }
            System.out.println(morecolor);
        }
    }
}
