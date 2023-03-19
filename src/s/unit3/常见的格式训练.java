package s.unit3;

public class 常见的格式训练 {
    public static void main(String[] args) {
        //jiujiubiao(1);
        caru(99);
    }

    public static void jiujiubiao(int x){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d  ",j,i,i*j);
            }
            System.out.println();
        }
    }

    public static void caru(int a){
        String qian="";
        String hou="";
        for (int i = 1; i*i <= a; i++) {
            if(a%i==0){
                if(i*i==a)qian+=i+" ";
                else {
                    qian+=i+" ";
                    hou=(a/i)+" "+hou;
                }
            }

        }
        System.out.println(qian+hou);
    }

}
