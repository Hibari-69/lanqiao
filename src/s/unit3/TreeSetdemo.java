package s.unit3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetdemo {
    public static void main(String[] args) {
        //set 集合去重 无序的
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int anum=sc.nextInt();
            int bnum=sc.nextInt();
            TreeSet<Integer> set=new TreeSet<>();
            for (int i = 0; i < anum; i++)set.add(sc.nextInt());
            for (int i = 0; i < bnum; i++)set.add(sc.nextInt());
            //System.out.println(set);
            String ans=set.toString().replace(",","");
            System.out.println(ans.substring(1,ans.length()-1));

            Iterator<Integer> it=set.iterator();
            while(it.hasNext()) System.out.print(it.next()+" ");
            for(Integer x:set) System.out.print(x+"->");
            // 看看TreeMap
        }
    }
}
