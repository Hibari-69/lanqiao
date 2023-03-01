package s.s1;

import java.util.Scanner;

public class chickid {
    public static void main(String[] args) {
        String idcard="";
        int[] w={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};//每位对应的权重
        String[] last={"1","0","x","9","8","7","6","5","4","3","2"};//除11取余的下标对应数
        Scanner sc=new Scanner(System.in);
        System.out.println("输入18位身份证号码");
        idcard=sc.nextLine();
        String id17=idcard.substring(0,17);
        int sum=0;
        for (int i = 0; i < id17.length(); i++) {
            int n= Integer.parseInt(id17.substring(i,i+1));
            sum+=n*w[i];
        }
        System.out.printf("sum=%d,sum%%11=%d",sum,sum%11);
        if(idcard.substring(17,18).equals(last[sum%11]))
            System.out.println("yes");
        else System.out.println("no");

    }
}
