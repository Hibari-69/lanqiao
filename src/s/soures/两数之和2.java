package s;

import java.util.HashMap;
import java.util.Scanner;

public class 两数之和2 {

    static int N=110;
    static int[] a=new int[N];

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        //key-value结构 （泛型指定类型映射键值对）
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            //哈希表中key是不能重复的  所以这里如果数组中数字重复了 就是输出最后一个下标
            map.put(a[i],i);
        }
        int target=sc.nextInt();

        for (int i = 0; i < n; i++) {
            int A=a[i];
            //containsKey函数：如果存在则返回true

            //哈希表的所有操作可以看成O(1)
            if(map.containsKey(target-A)){
                System.out.println(i+" "+map.get(target-A));
                return;
            }

        }
    }
}
