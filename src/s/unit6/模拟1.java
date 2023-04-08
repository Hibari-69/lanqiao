package s.unit6;

//比赛遇到模拟要慎重;有的别太死扣了;无奈！！

public class 模拟1 {
    //测谎仪：          口供：有三个是对的  凶手是谁?
    //A:不是我
    //B:是C
    //C:是D
    //D:是C胡说
    public static void main(String[] args) {
        int cnt=0;//统计有几个人说的是真话
        for (int Killer = 'A'; Killer <='D'; Killer++) {    //ASCII 'A' 65 'a' 97
            cnt=0;//bug
            if(Killer!='A')cnt++;
            if(Killer=='C')cnt++;
            if(Killer=='D')cnt++;
            if(Killer!='D')cnt++;
            if(cnt==3) System.out.println((char)Killer);
        }
    }
}
