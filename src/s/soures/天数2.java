package s.soures;
//完全日期 2001-2021 有多少个;
//例如2021.6.5 数字之和为16 16为完全平方数 则称之为完全日期

public class 天数2 {
    static int[] w={0,31,28,31,30,31,30,31,31,30,31,30,31};

    static int y=2001,m=1,d=1;
    public static void main(String[] args) {
        int ans=0;
        //

        //
        while(y != 2021||m !=12||d != 31){
            if(y%400==0||y%100!=0&&y%4==0)
                w[2]=29;else w[2]=28;
            if(check())ans++;
            d++;
            if(d>w[m]){
                d=1;
                m++;
            }
            if(m>12){
                m=1;
                y++;
            }
        }if(check())ans++;
        System.out.println(ans);


    }
    static boolean check(){
        int x1=y,x2=m,x3=d;
        int ans=0;
        while(x1>0){
            ans+=x1%10;
            x1/=10;
        }
        while(x2>0){
            ans+=x2%10;
            x2/=10;
        }
        while(x3>0){
            ans+=x3%10;
            x3/=10;
        }
        int v=(int)Math.sqrt(ans);
        return v*v==ans;
    }

}
