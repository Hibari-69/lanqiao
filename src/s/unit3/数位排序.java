package s.unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 数位排序 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());

        List<Integer> list=new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int t=i;
            int sum=0;
            while(t>0){
                sum+=t%10;
                t/=10;
            }
            list.add(sum);
        }

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        int x=list.get(m-1);
        int l=m-1-list.indexOf(x);


        List<Integer> ans=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int t=i;
            int sum=0;
            while(t>0){
                sum+=t%10;
                t/=10;
            }
            if(sum==x)ans.add(i);
        }
        System.out.println(ans);
        System.out.println(ans.get(l));


    }
}
