package s.soures;

public class 打印圆形 {
    public static void main(String[] args) {
        int r=6;
        //solidcircle(r);
        //hollowcircle(r);
        heart(r);
    }
    public static void solidcircle(int r){
        for(int y=-r;y<=r;y+=2){//这里因为*在控制台有行高;两行两行的打要好看些
            for(int x=-r;x<=r;x++){
                if(x*x+y*y<=r*r) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void hollowcircle(int r){
        for(int y=r;y>=-r;y-=2){
            int x=(int) Math.round(Math.sqrt(r*r-y*y));
            for(int i=-r;i<r-x;i++) System.out.print(" ");
            System.out.print("*");
            for (int i = 0; i < 2*x; i++) System.out.print(" ");
            System.out.println("*");
        }
    }
    public static void heart(int r){//函数没问题,就是好nm奇怪,xy的值的问题不对就打不出来
        for(float y=(float) r;y>(float) -r;y-=0.1){
            for(float x=(float) -r;x<(float) r;x+=0.03){
                float x1=x*x+y*y-1;
                if(x1*x1*x1-x*x*y*y*y<0.0){
                    System.out.print("*");
                }else
                System.out.print(" ");
            }System.out.println();
        }

    }
}
