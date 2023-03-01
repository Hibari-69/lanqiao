import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class demo2 {
    static int[] nums=new int[101];
    public static int[] list=new int[101];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            nums[i]=sc.nextInt();
        }
        divide(nums);
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i]);
//        }

        int ans=0;
        for (int i = 0; i < list.length; i++) {
            if(list[i]!=0)ans++;
        }
        System.out.println(ans);

    }

    public static void divide(int [] a){

        //确定有多少个子序列
        int b=0;
        for (int i = 0; i < 5; i++) {       //5是nums的大小
            b=10*b+1;
        }

        //创建list1存nums 的子集和他自己;
        List list1=new ArrayList();
        //开始用二进制输出nums的子序列
        for (int i = 0; i <=Integer.parseInt(String.valueOf(b),2); i++) {

            int index=0;
            int n=i;
            while(n>0){
            if(n%2==1){
                list1.add(a[index]);
            }
                index++;
            n/=2;}
            System.out.println(list1);

            //这里开始对比list1 中的最大公约数 放入;
            iii(list1);
//            for (int i1 = 0; i1 < list1.size(); i1++) {
//                for (int j = i1; j < list1.size(); j++) {
//                    int x=gcd((int)list1.get(i1),(int)list1.get(j));
//                        list[x]++;
//                }
//        }
            list1.clear();
        }
    }
    public static int gcd(int a,int b){
        return(b==0?a : gcd(b,a%b));
    }
    public static void iii(List a){
        for (int i1 = 0; i1 < a.size(); i1++) {
            for (int j = i1; j < a.size(); j++) {
                int x=gcd((int)a.get(i1),(int)a.get(j));
                list[x]++;
            }
    }
}
}