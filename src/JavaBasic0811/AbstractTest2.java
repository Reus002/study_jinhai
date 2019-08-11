/*
     老师案例
          具体事物：基础班老师，就业班老师
          共性：姓名，年龄，讲课。

     分析：
          基础班老师
              姓名，年龄
              讲课。
          就业班老师
              姓名，年龄
              讲课。

     实现：
          老师类
              基础班老师
              就业班老师


 */
package JavaBasic0811;
//定义抽象的老师类
abstract class teacher{

    private String name;
    private int age;

    public teacher(){}
    public teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    //定义一个抽象方法
    public abstract void teach();
}

class BasicTeacher extends teacher{
    public BasicTeacher(){}

    public BasicTeacher(String name,int age){
        super(name,age);
    }

    public void teach(){
        System.out.println("基础班老师讲解JavaEE");
    }
}

class WorkerTeacher extends teacher{
    public WorkerTeacher(){}

    public WorkerTeacher(String name,int age){
        super(name,age);
    }

    public void teach(){
        System.out.println("就业班老师讲解JavaSE");
    }
}

public class AbstractTest2 {
    public static void main(String[] args){
        //具体的类测试
        //测试（多态）
        //基础班老师
        teacher t=new BasicTeacher();
        t.setName("linqingxia");
        t.setAge(27);
        System.out.println(t.getName()+"---"+t.getAge());
        t.teach();
        System.out.println("----------");

        t=new BasicTeacher("liuyi",30);
        System.out.println(t.getName()+"---"+t.getAge());
        t.teach();
        System.out.println("----------");

        //就业班老师
        t=new WorkerTeacher();
        t.setName("linqingxiq");
        t.setAge(27);
        System.out.println(t.getName()+"---"+t.getAge());
        t.teach();
        System.out.println("---------");

        t=new WorkerTeacher("liuyi",30);
        System.out.println(t.getName()+"---"+t.getAge());
        t.teach();

    }
}
