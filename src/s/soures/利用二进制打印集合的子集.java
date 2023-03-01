package s.soures;

public class 利用二进制打印集合的子集 {
    public static void main(String[] args) {
        int [] a={1,2,3,4};
        for(int i=0;i<=15;i++){  // i<15 打出来不包含{1,2,3,4}
            System.out.print("{");  //那么问题来力,15是怎么来的呢? 晓得滴哦 ; 可能是因为15 的二进制 1111 ; 0-15 就列举了所有1 的不同了;
            int n=i;
            int index=0;
            while(n>0){
                if(n%2==1){     //遇1 就打
                    if(n>2)
                    System.out.print(a[index]+" ");
                    else System.out.print(a[index]);
                }
                index++;    //遇0 跳过
                n/=2;
            }System.out.println("}");
        }

    }
}
