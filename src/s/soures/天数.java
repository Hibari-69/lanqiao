package s.soures;
//小蓝特别喜欢 2，(+1)今年是公元 2020 年，他特别高兴，因为每天日历上都可以看到 2
//
//如果日历中只显示年月日，请问从公元 1900 年 1 月 1 日到公元 9999 年 12 月 31 日，一共有多少天日历上包含 2.即有多少天中年月日的数位中包含
//数字 2

//日历模拟器;
//许多内置日历模拟器会有小毛病;
public class 天数 {
    static int[] w={0,31,28,31,30,31,30,31,31,30,31,30,31};

    static int y=1900,m=1,d=1;
    public static void main(String[] args) {
        int ans=0;
        //

        //
        while(y != 9999||m !=12||d != 31){
            //判断是否为闰年
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


        }
        //到最后一天循环已经结束了,就手动check一下他最后一天有2就
        System.out.println(ans+1);

    }

    static public Boolean check() {
        //这里不要直接操作y,因为y是全局变量
        int x1=y;
        while(x1>0){
            if(x1%10==2)return true;
            x1/=10;
        }
        int x2=m;
        while(x2>0){
            if(x2%10==2)return true;
            x2/=10;
        }
        int x3=d;
        while(x3>0){
            if(x3%10==2)return true;
            x3/=10;
        }
        return false;

    }
}
