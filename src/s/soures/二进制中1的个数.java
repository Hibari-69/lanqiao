package s.soures;

import java.util.HashMap;
import java.util.Scanner;

public class 二进制中1的个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String ans=Integer.toString(s,2);//转换为二进制;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < ans.length(); i++) {
            int c=ans.charAt(i);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        //int value=hashMap.get("0");get不到

        //捏mama得!!! 结果是因为 取key 时 ’1‘ 写成了“1” 凸(艹皿艹 );
        //果然找很久都早不到一般是超低级的错误55;
        //我真的c了,蓝桥oj都过不了这个...改为Integer.toBinaryString();就能过蓝桥Oj了;
        //完全不晓得为啥;

        System.out.println(hashMap);
        //keySet 是拿到所有的键;values 拿到所有的值;
        //char x='1';
        for(int key:hashMap.keySet()){
            System.out.println(getType(key));
            if(key=='1'){
                System.out.println(hashMap.get(key));
            }
        }
    }
    public static String getType(Object o){
        return o.getClass().toString(); //判断下数据类型;然后果然不是数据类型的错;
    }
}

//TMD 这问题用位运算好叼哦
//public int static hamingweight(int n){    //这里n 为二进制数;
//    int ans=0;
//    while(n!=0){
//        ans+=n&1;
//        n>>>=1;
//        }
//    return ans;
//        }

// Integer.bitCount(n);  //返回二进制中1的个数
// Integer.toString(n,2);   //进制转换

