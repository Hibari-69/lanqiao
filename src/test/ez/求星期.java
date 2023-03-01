package test.ez;

public class 求星期 {
    //今天星期六;
    public static void main(String[] args) {
        int ans=1;
        for (int i = 0; i < 22; i++) {
            ans*=20;
            ans%=7;
        }
        System.out.println(ans); //ans=1 今天星期天
    }
}
