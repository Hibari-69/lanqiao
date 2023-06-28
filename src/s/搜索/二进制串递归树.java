package s.搜索;

public class 二进制串递归树 {

    //打印递归树  (就是个DFS)

    static int cnt=0;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //四位的二进制 0000-1111

        change(0,"");
    }

    public static void change(int depth,String bin){
        cnt++;
        System.out.printf("%schange(%d,%s)\n",Lpad(depth),depth,bin);
        if(depth==4){
            return;
        }
        change(depth+1,bin+"0");
        change(depth+1,bin+"1");
    }
    //n 越大前面的空格就越多 就是为了输出好看点
    public static String Lpad(int n){
        String ans="";
        for(int i=1;i<=n;i++)ans=ans+"        ";
        return ans;
    }

}

