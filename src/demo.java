import com.sun.source.doctree.IndexTree;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class demo {
    static int [] x=new int[399];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNext()) {
            list .add(sc.nextInt());
            iii(list);
            System.out.println(x[0]);
        }

    }

    public static void iii(List a){
        for (int i = 0; i < a.size(); i++) {
            x[i]=(int)a.get(i);
        }
    }
}
