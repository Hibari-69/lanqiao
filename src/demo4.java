

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;
//
//public class demo4 {
//
//    public static void main(String[] args)throws IOException {
//        //Scanner sc=new Scanner(System.in);
//        //List<List<Integer>> res =new ArrayList<>();//存下标
//        //System.out.println(2*2*2*2*2*2*2);
//        //System.out.println(1<<7);
//        //var bin = new StringBuilder("0.");
////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////        String[] x=br.readLine().split(" ");
////        String s=Integer.toString(222,2);
////        String[] a=s.split(" ");
//
////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////        int k=Integer.parseInt(br.readLine());
////        String s=br.readLine();
////        int n=s.length();
////        if(n%k!=0){
////            System.out.println(-1);
////            return;
////        }
//
//
//
//
//
//
//    }
//
//
//
//}
import java.util.*;

public class demo4 {
    static int[] cnt = new int[26];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int n = s.length;
        if (n % k != 0) {
            System.out.println(-1);
            return;
        }
        //每一组有t个元素
        int t = n / k;
        int ans = 0;
        //枚举开头
        for (int i = 0; i < t; i++) {
            Arrays.fill(cnt, 0);
            for (int j = i; j < n; j += t) {
                cnt[s[j] - 'a']++;
            }
            //最多的字符出现了多少次
            int max = 0;
            for (int j = 0; j < 26; j++) {
                max = Math.max(max, cnt[j]);
            }
            ans += k - max;
        }
        System.out.println(ans);
    }
}
