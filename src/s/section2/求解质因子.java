package s.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 求解质因子 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        List<Long> list=new ArrayList<>();
        for (Long i = Long.valueOf(2); i <= n/i; i++) {
            if(n%i==0)list.add(i);
            while(n%i==0){
                n/=i;
            }

        }
        if(n>1)list.add(n);
        for(Long x:list){
            System.out.print(x+" ");
        }
    }
}
