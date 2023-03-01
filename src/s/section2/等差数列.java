package s.section2;

import java.util.Arrays;
import java.util.Scanner;

//数学老师给小明出了一道等差数列求和的题目。但是粗心的小明忘记了一 部分的数列，只记得其中N 个整数。现在给出这
//N 个整数，小明想知道包含这N 个整数的最短的等差数列有几项？
//in:
//5
//2 6 4 10 20
//out:
//10

//mamade,又是一道卡我半天的题;
//最后参考了下，
//还是可以 熟悉了下 Boolean flag 运用跳出循环; 最后那段循环判断条件输出才秀;

public class 等差数列 {
    //这是我想的，然而当 temp等于0 的时候 这个答案就寄了;
//这里特判一下就好了哇

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        //根据,各项的差值一定也是最小公倍数的倍数;
        //我们再取一下 这些差值的最小公倍数; 开始就是在这卡了;

        //初始一下 最初的公倍数;
        int a=gcd(nums[0],nums[1]);
        for (int i = 2; i < n-1; i++) {
            a=gcd(a,nums[i+1]-nums[i]);
        }
        if(a==0) System.out.println(n);
        else
        System.out.println((nums[n - 1] - nums[0]) / a + 1);
    }

    public static int gcd(int a, int b) {
        return (b == 0 ? a : gcd(b, a % b));
    }


}


//public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] nums=new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i]=sc.nextInt();
//        }
//        Arrays.sort(nums);
//        int [] ch=new int[n];
//        int [] chh=new int[n];
//        int index=0;
//        for (int i = 0; i < n-1; i++) {
//            ch[i]=nums[i+1]-nums[i];
//            if(i==0){
//                chh[index]=ch[i];
//                index++;
//            }
//            if(chh[index-1]!=ch[i]){
//                chh[index]=ch[i];
//                index++;
//            }
//        }
//        int min=Integer.MAX_VALUE;
//        int a=0;
//        while(a<index){
//            min=Math.min(min,chh[a]);
//            a++;
//        }
//
//        //这里真的处理的好秀哇orz, 带着数据看一遍才能看懂;
//        // 相邻的差一定是公差的倍数;
//        boolean flag=false;
//        for (int i = min; i >0 ; i--) {
//            for (int j = 0; j < index; j++) {
//                if(chh[j]%i!=0)break;
//                if(j==index-1){
//                    System.out.println((nums[n-1]-nums[0])/i+1);
//                    flag=true;
//                    break;
//                }
//            }
//            if(flag==true)break;
//
//        }
//        if(min==0) System.out.println(n);;
//
//    }