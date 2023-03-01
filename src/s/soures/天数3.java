package s.soures;
//星期几
//1949 年的国庆节（ 10 月 1 日）是星期六。
//今年（2012）的国庆节是星期一。
//那么，从建国到现在，有几次国庆节正好是星期日呢？
//不要求写出具体是哪些年，只要一个数目


public class 天数3 {
    static int[] w={0,31,28,31,30,31,30,31,31,30,31,30,31};

    static int y=1949,m=10,d=1,t=6;
    public static void main(String[] args) {
        int ans=0;
        //

        //
        while(y != 2012||m !=12||d != 31){
            if(y%400==0||y%100!=0&&y%4==0)
                w[2]=29;else w[2]=28;
            if(check())ans++;
            t++;    //0->6
            t%=7;
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
       return m==10&&d==1&&t==0;
    }
}
