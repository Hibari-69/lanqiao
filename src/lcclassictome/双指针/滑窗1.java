package lcclassictome.双指针;

import java.util.Scanner;

// lc 1234
// AAA 想学\\
public class 滑窗1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        var s=S.toCharArray();  //就是用数组去存
        var cnt=new int['X'];   //??
        for(var c:s)++cnt[c];
        int n=S.length(),m=n/4;
        if(cnt['Q']==m&&cnt['W']==m&&cnt['E']==m&&cnt['R']==m)
            //return 0;//已经符合要求辣
            System.out.println(0);
        int ans=n,left=0;
        for(int right=0;right<n;++right){//枚举子窜右端点
            --cnt[s[right]];//??
            while(cnt['Q']<=m&&cnt['W']<=m&&cnt['E']<=m&&cnt['R']<=m){
                ans=Math.min(ans,right-left+1);
                ++cnt[s[left++]];//??
            }
        }//return ans;
        System.out.println(ans);
    }
}
