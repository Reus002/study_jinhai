/*
    学生案例和老师案例讲解

    学生：
      成员变量：姓名，年龄
      构造方法：无参，带参
      成员方法：getXxx（）/SetXxx（）
    老师：
      成员变量：姓名，年龄
      构造方法：无参，带参
      成员方法：getXxx（）/SetXxx（）
 */
package Javabasic0806;
class Student9{
    private String name;
    private int age;
    public Student9(){}
    public Student9(String name,int age){
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
}
//使用继承前
/*
class Teacher9{
    private String name;
    private int age;
    public Teacher9(){}
    public Teacher9(String name,int age){
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
}*/
//使用继承后
class Teacher9 extends Student9{
    public Teacher9(){}
    public Teacher9(String name,int age){
        super(name,age);
    }
}

public class ExtendsTest {
    public static void main(String[] args){
        //创建学生类对象
        //方式一
        Student9 s=new Student9();
        s.setName("linqingxia");
        s.setAge(27);
        System.out.println(s.getName()+"---"+s.getAge());
        //方式二
        Student9 s1=new Student9("linqingxia",27);
        System.out.println(s1.getName()+"---"+s1.getAge());
        System.out.println("----------");
        //创建老师类对象
        Teacher9 t=new Teacher9();
        t.setName("liuyi");
        t.setAge(30);
        System.out.println(t.getName()+"---"+t.getAge());
        //
        Teacher9 t1=new Teacher9("liuyi",30);
        System.out.println(t1.getName()+"---"+t1.getAge());

    }
}
