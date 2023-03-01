package test.lc_dp_wanna;

public class lc1139 {

        public static void main(String[] args) {
            int[][] grid=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
            int m=grid.length;
            int n=grid[0].length;
            int[][][] dp=new int[m+1][n+1][2];
            for (int i = 1; i <=m; i++) {
                for(int j=1;j<=n;j++){
                    if(grid[i-1][j-1]==0){
                        continue;
                    }
                    dp[i][j][0]=dp[i][j-1][0]+1;
                    dp[i][j][1]=dp[i-1][j][1]+1;
                }

            }
            int maxSide =0;//记录正方形最大的长度;
            for (int i = 1; i <=m; i++) {
                for (int j = 1; j <=n; j++) {
                    //沿着当前坐标往上找出最短距离，暂时看作正方形的边长
                    int curSide=Math.min(dp[i][j][0],dp[i][j][1]);
                    //如果找到的边长比maxSide小，那么就跳过;
                    if(curSide<maxSide)continue;
                    //cruSide可与认为是正方形的下边
                    for(;curSide>maxSide;curSide--){
                        if(dp[i][j-curSide+1][1]>=curSide&&dp[i-curSide+1][j][0]>=curSide){
                            maxSide=curSide;
                            break;
                        }
                    }

                }

            }
            System.out.println(maxSide*maxSide);

        }


}
