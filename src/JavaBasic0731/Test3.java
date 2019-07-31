package JavaBasic0731;

import java.util.Scanner;

/*
   需求：
       定义一个员工类，自己分析出几个成员，
       然后给出成员变量，构造方法。getXxx（）/setXxx（）方法，
       以及一个显示所有成员信息的方法。并测试。

   分析：
       员工
          成员变量：
              员工编号，姓名，年龄
          构造方法：
              无参构造方法
          成员方法：
               getXxx（）/setXxx（）
               show（）
 */
class Employee{
    //
    private String emloyeeId;
    //员工编号 姓名 年龄
    private String name;
    private int age;
    //构造方法
    public Employee(){}

    //getXxx（）/setXxx（）
    public String getEmloyeeId(){
        return emloyeeId;
    }
    public void setEmloyeeId(String emloyeeId){
        this.emloyeeId=emloyeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //显示所有成员信息的方法
    public void show(){
        System.out.println("员工编号是:"+emloyeeId+"的这个人是:"+name+"的年龄是:"+age);
}
}
public class Test3 {
   public static void main(String[] args){
       //创建对象
       Employee e=new Employee();
       e.setEmloyeeId("cafa34214");
       e.setName("linqingxia");
       e.setAge(27);
       //
       //获取数据
       System.out.println(e.getEmloyeeId()+"---"+e.getName()+"---"+e.getAge());
       System.out.println("------------");
       //我们在enployee类中定义了一个show（）方法。所以，我们改进一下
       //使用show()方法
       e.show();

   }
}
