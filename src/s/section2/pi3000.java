package s.section2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class pi3000 {
    public static void main(String[] args) {
        pi(1000);

    }
    public static void pi(int n){
        BigDecimal qian= BigDecimal.ZERO;//前半部分
        BigDecimal hou= BigDecimal.ZERO;//后半部分
        BigDecimal ans=BigDecimal.ZERO;//最后放入ans
        int scale=2000;
        for (int i = 0; i < n; i++) {
            BigDecimal de5=new BigDecimal("1").divide(new BigDecimal(2*i+1+"")
                    .multiply(new BigDecimal("5").pow(2*i+1)),scale, RoundingMode.DOWN);
            BigDecimal de239=new BigDecimal("1").divide(new BigDecimal(2*i+1+"")
                    .multiply(new BigDecimal("239").pow(2*i+1)),scale,RoundingMode.DOWN);
            BigDecimal fh=new BigDecimal(((i&1)==1?1:-1)+"");
            qian=qian.add(de5.multiply(fh));
            hou=hou.add(de239.multiply(fh));

        }
        ans=new BigDecimal("16").multiply(qian).subtract(new BigDecimal("4").multiply(hou));
        System.out.println(ans.toString());
    }
}
