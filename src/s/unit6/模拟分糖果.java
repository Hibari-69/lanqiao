package s.unit6;

import java.util.Arrays;

public class 模拟分糖果 {
    //10个人
    //1、每个人已经有若干个
    //2、每个人把自己的一般分给右边的人
    //3、如果有人的糖果数量为奇数了，可以补给一个
    //4、所有人的糖果数量都相等后 GAMEOVER

    public static void main(String[] args) {
        int[] a={10,2,8,22,16,4,10,6,14,20};
        while(!isGameOver(a)){
            fenpei(a);
            System.out.println(Arrays.toString(a));
            supply(a);
            System.out.println(Arrays.toString(a));
        }
        System.out.println("game over"+Arrays.toString(a));
    }
    public static void fenpei(int[] a){
        //这里最后一位 把自己的一半给第一个人 写在外面
        int halfoflast=a[9]/2;
        a[9]=a[9]/2;
        for (int i = 9; i >=1 ; i--) {
            a[i]+=a[i-1]/2;
            a[i-1]=a[i-1]/2;
        }
        a[0]+=halfoflast;

    }
    public static void supply(int[] a){
        for (int i = 0; i < a.length; i++) {
            if((a[i]&1)==1)a[i]++;
        }
    }
    public static boolean isGameOver(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=a[0])return false;
        }
        return true;
    }

}
