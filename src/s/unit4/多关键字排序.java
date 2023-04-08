package s.unit4;

import java.util.ArrayList;//注意是这个包啊，存在同名的类 在不同的包里面 他们的功能是不太一样的的;但是这里好像看不啥出来;
import java.util.Collections;
import java.util.List;

public class 多关键字排序 {
    public static void main(String[] args) {
        //ObjectArrays Arrays.sort
        ArrayList<Student> list=new ArrayList<>();

        List<Student> list1=new ArrayList<>();
        list.add(new Student("张三",100,68));
        list.add(new Student("李四",14,55));
        list.add(new Student("王五",19,78));
        list.add(new Student("二狗",36,52));
        list1.add(new Student("王五",100,100));
        list1.add(new Student("李四",45,55));
        list1.add(new Student("王五",32,68));
        list1.add(new Student("二狗",36,52));

        Collections.sort(list); //这个就会按照下面写的Compara规则进行排序;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//这里就是默认调用了重写后的toString函数;
        }

        System.out.println();
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }


    }
}
class Student implements Comparable<Student>{

    String stuname;
    int java;
    int mysql;
    int score;
    public Student(){};
    public Student(String stuname,int java,int mysql){
        this.stuname=stuname;
        this.java=java;
        this.mysql=mysql;
        this.score=java+mysql;
    }

    //改写toString函数，toString 函数原本是从Object这个类继承下来的;
    // 那么我们现在就是在子类的函数 要去重写父类的函数 这叫做Override 重写了父类的函数;
    //重载也叫覆盖;函数同名不同参;

    //打印对象的时候，默认去调用同String();
    public String toString(){

        return "stuname:"+this.stuname+"\t java"+this.java+"\tmysql:"+this.mysql+"\tscore:"+this.score;
    }
    //接口实现student方法 告诉他具体的排序规则 >0的答案 我比你大 0 我们相等 <0的答案 我比你小
    @Override
    public int compareTo(Student other) {
        if(this.score==other.score)return other.java-this.java;
        else return other.score-this.score;


        //排序规则 1 我比你大 0 我们相等 -1 我比你小
//        if(this.score>other.score)return -1;
//        else if (this.score<other.score)return 1;
//        else{//我的score 和你的一样大 比较Java
//            if(this.java>other.java)return -1;
//            else if (this.java<other.java) return 1;
//            else return 0;
//        }


    }

}