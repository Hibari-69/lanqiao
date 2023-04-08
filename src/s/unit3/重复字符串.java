package s.unit3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 重复字符串 {
    static int[] cnt=new int[26];

    //这个注意力放在每一个元素上就好想了
    //1,1+k,1+2k        a b c a b c c c a 怎么变才能使用最小的次数
    //2,2+k,2+2k        选择修改次数出现最多的字符,就能修改最少鸭
    //3,3+k,3+2k 都得一样
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        char[] s=br.readLine().toCharArray();
        int n=s.length;
        if(n%k!=0){
            System.out.println(-1);
            return;
        }
        //枚举开头 返回n%k组 的每一行 以k为等差值的等差数列  长度减去max 的值
        int t=n/k;
        int ans=0;
        for (int i = 0; i < t; i++) {
            Arrays.fill(cnt,0);
            for (int j = i; j < n; j+=t) {
                cnt[s[j]-'a']++;
            }
            int max=0;
            for (int j = 0; j < 26; j++) {
                max=Math.max(max,cnt[j]);
            }

            ans+=k-max;

        }

        System.out.println(ans);

    }
}
