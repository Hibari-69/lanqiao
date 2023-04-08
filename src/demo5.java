import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

import java.util.*;

public class demo5 {
    public static void main(String[] args)throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine());
//        int m=Integer.parseInt(br.readLine());
        String s="123456789";
        int l=0,r=s.length();
        while(l<r){
            int mid=l+r+1>>1;
            if(s.charAt(mid)<'5')l=mid;
            else r=mid-1;
            System.out.println(mid);
            System.out.println();
        }
        System.out.println(l);









    }
}
