package JavaBasic0730;

/*
     一个标准的代码最终版

      学生类
        成员变量：
          name，age
        构造方法：
          无参，带两个参
        成员方法
          getXxx（）/setXxx（）
      给成员变量赋值
        A:setXxx（）方法
        B:构造方法
      输出成员变量值的方式：
        A:通过getXxx（）分别获取然后拼接
        B:通过调用show（）方法搞定
 */
class Student10{
    //姓名 年龄
    private String name;
    private int age;
    //构造方法
    public Student10(){}//无参
    public Student10(String name,int age){//两个参数
        System.out.println("这是带多个参数的构造方法");
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
    //输出所有的成员变量值
    public void show(){
        System.out.println(name+"---"+age);
    }
}
public class StudentTest4 {
    public static void main(String[] args){
        //方式1给成员变量赋值
        //无参构+setXxx()
        Student10 s1=new Student10();
        s1.setName("linqingxia");
        s1.setAge(27);
        //输出值
        System.out.println(s1.getName()+"---"+s1.getAge());
        s1.show();
        System.out.println("----------");

        //方式2给成员变量赋值
        Student10 s2=new Student10("liyi",30);
        System.out.println(s2.getName()+"---"+s2.getAge());
    }
}
