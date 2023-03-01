

import java.util.*;

import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;

public class demo4 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //List<List<Integer>> list =new ArrayList<>();//存下标
        //System.out.println(2*2*2*2*2*2*2);
        //System.out.println(1<<7);
        int[][] items1=new int[][]{{99,1},{4,5},{3,8}};
        int[][] items2=new int[][]{{4,1},{111,2}};
        Map<Integer,Integer> map=new HashMap<>();
        int n1=items1.length;
        int n2=items2.length;
        for(int i=0;i<n1;++i){
            map.put(items1[i][0],map.getOrDefault(items1[i][0],0)+items1[i][1]);
        }
        for(int i=0;i<n2;++i){
            map.put(items2[i][0],map.getOrDefault(items2[i][0],0)+items2[i][1]);
        }
        List<List<Integer>> ans=new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry:
        map.entrySet()){
            ans.add(List.of(entry.getKey(),entry.getValue()));
        }
        System.out.println(ans);
        Collections.sort(ans,(a,b) -> a.get(1)-b.get(1));//按照ans[][1]的大小升序
        System.out.println(ans);
        Collections.sort(ans,(a,b) -> a.get(0)-b.get(0));//按照ans[][0]的大小升序
        System.out.println(ans);





    }

}
