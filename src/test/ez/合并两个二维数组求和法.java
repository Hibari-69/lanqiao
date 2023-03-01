package test.ez;

public class 合并两个二维数组求和法 {
    public static void main(String[] args) {
        int[][] nums1=new int[][]{{1,2},{2,3},{4,5}};
        int[][] nums2=new int[][]{{2,3},{2,2},{4,0}};

        int[] a=new  int[1010];
        for(int[] e:nums1){
            a[e[0]]+=e[1];
        }
        for(int[] e:nums2){
            a[e[0]]+=e[1];
        }
        int n=0;
        for(int i=0;i<a.length;++i){
            if(a[i]>0)n++;
        }
        int[][] ret=new int[n][2];
        int rn=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                ret[rn][0]=i;
                ret[rn++][1]=a[i];
            }
        }
        for (int[] e :
                ret) {
            for (int x :
                    e) {
                System.out.print(x);
            }
        }



    }
}
