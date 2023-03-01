package test.ez;
//check if Numbers Are Ascending in a Sentence;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class lc2042 {
    public boolean areNumbersAscending(String s) {
        int pre = 0, pos = 0;
        while (pos < s.length()) {
            if (Character.isDigit(s.charAt(pos))) {
                int cur = 0;
                while (pos < s.length() && Character.isDigit(s.charAt(pos))) {//&&(短路与) 若第一个条件为假，则结果为假，
                    // 不再去判断第二个操作数
                    cur = cur * 10 + s.charAt(pos) - '0';
                    pos++;
                }
                if (cur <= pre) {
                    return false;
                }
                pre = cur;
            } else {
                pos++;
            }
        }
        return true;
    }

    }



    /*
    行不通...
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.trim();
        String x=s.replaceAll(" ","");
        ArrayList<Integer> x1=new ArrayList<>();
        for (int i = 0; i <x.length() ; i++) {
            if(x.charAt(i)>=48&&x.charAt(i)<=57){
                x1.add((int)x.charAt(i));
            }
        }
        ArrayList<Integer> x2=new ArrayList<>();
        x2=x1;
        x1.sort(Comparator.naturalOrder());
        if(x2==x1){
            System.out.println("true");
            System.out.println(x1);
            System.out.println(x2);     //233,这里根本就没加进去
        }else System.out.println("false");


    }

    */


