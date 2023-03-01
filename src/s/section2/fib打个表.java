package s.section2;

public class fib打个表 {

    //fib 64项超过int fib 93项超过long(大概)

    public static void main(String[] args) {
        long[] fib=new long[61];
        fib[0]=1;
        fib[1]=1;
        for (int i = 3; i < fib.length; i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }
        for (int i = 0; i < fib.length; i++) {
            System.out.printf("fib第%02d项：",i);
            if(fib[i]%3==0) System.out.printf("\t被3整除");
            if(fib[i]%4==0) System.out.printf("\t被4整除");
            if(fib[i]%12==0) System.out.printf("\t被12整除");
            System.out.println();

        }

        // 观察得：每相隔4个数 能被3整除;
        //每相隔6个数 能被4整除;
        //每相隔12个数 能被12整除;

    }
}
