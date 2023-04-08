package s.unit6;

public class 模拟堆积雨水 {
    public static void main(String[] args) {
        int[] height=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int n=height.length;
        int ans=0;
        int l=0;//U型碗口的左边
        for(int i=0;i<n;i++){
            if(height[i]>=1){//左边的碗口高度应该是>=1才有意义
                l=i++;//当前位置作为左端
                int temp=0;//整个中间变量，因为只遍历一次可能得不到答案，如果存在右边都比左边小的情况就还要再回去，降低标准
                while(i<n&&height[i]<height[l]){
                    temp+=height[l]-height[i];//装水的部分是比左边低的那一部分
                    i++;

                }

                if(i<n){
                    ans+=temp;
                    i--;//for后面会有一个i++,抵消i++，U右边墙可以作为下一个U型碗的左侧
                }else {//右边都比左边低
                    i=l-1;//再次回到左边界的左边 再来一次
                    height[l]--;//降低左边的标准去匹配右边的，然后
                }


            }
        }
        System.out.println(ans);


    }

}
