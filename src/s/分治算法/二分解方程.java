package s.分治算法;

//二分是一种思想，还可以三分四分、、、、

public class 二分解方程 {
    //p=3a^2+3a+1;  p是素数 a?
    //是不是二分答案哦

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long p=19;
        System.out.println(check(p));
    }

    public static int check(long p){

        int l=1,r=(int) Math.sqrt(p/3)+1;
        while(l<r){
            int mid=l+r>>1;
            long temp=(3L*mid)*mid+3L*mid+1;
            if(temp==p)return mid;
            if(temp<p)r=mid;
            else l=mid+1;
        }
        return 0;
    }
}

