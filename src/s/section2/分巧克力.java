package s.section2;

import java.util.Scanner;
//1e5 2e5的数据,一般就是O(nlogn)或者O(n);

//这里满足二段性,就可以用二分法
// 什么是二段性？ 一半满足一半不满足  ; 这里分巧克力的二分点就在于：在答案节点,比答案小的都满足，比答案大的都不满足;
// 问我们最大能给小朋友分多大的巧克力? 如果我们可以给小朋友分x*x大小的巧克力n块;那么边长[1,x-1]的巧克力也一定能分出足够的块数;
//我们判断的逻辑一般就是写check函数的逻辑,当我们切的边长为x时,我们去判断他是是否能切出k块,能则符合否则不符合;

public class 分巧克力 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int K= sc.nextInt();
        int[][] arr=new int[N][2];
        for(int i=0;i<N;++i){
            arr[i][0]= sc.nextInt();//[0] 表示巧克力的长
            arr[i][1]= sc.nextInt();//[1] 表示巧克力的宽
        }
        int l=1;
        int r=100000;
        while(l<r){
            int mid=(l+r+1)/2;
            if(check(arr,mid,K))l=mid;  //这里就是二分模板 ;l=mid 因为在左边符合要求，mid 还是要取 就还是
            else r=mid-1;
        }
        System.out.println(l);
    }
    static boolean check(int[][] arr,int X,int K){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            //计算当前这块巧克力能切分成为多少块x*x 的
            int ans=(arr[i][0]/X)*(arr[i][1]/X);
            count+=ans;

        }
        return count>=K;
    }
}

//二分有一个特点求最值问题：最大值,最小值,看起来不好判断的,但我可以去判断某个值是否符合就好判断些;
