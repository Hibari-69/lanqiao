package test.mid;

import java.util.HashMap;

//若满足：nums[i]+rev(nums[j])=nums[j]+rev(nums[i])
//相当于：f(i)==nums[i]-rev(nums[i])  以上表达式等价与f(i)=f(j);
//这样只需要遍历一次数组就行了！！
//就是说看起来像双指针;若要满足的要求是这样的话,就可以试着把变量往一边引;这样就可以简化！！
public class lc1814 {
    public static void main(String[] args) {
        final int MOD=(int)1e9+7;
        int[] nums={42,11,1,97};
        int ans=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:nums){
            int temp=i,j=0;
            while(temp>0){
                j=j*10+temp%10;
                temp/=10;
            }
            ans=(ans+hs.getOrDefault(i-j,0))%MOD;
            hs.put(i-j,hs.getOrDefault(i-j,0)+1);
        }
        System.out.println(ans);
    }
}
