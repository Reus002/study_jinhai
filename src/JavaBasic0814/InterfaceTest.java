/*
     老师和学生案例，加入抽烟的额外功能

     具体：
         老师：姓名，年龄，吃饭，睡觉
         学生：姓名，年龄，吃饭，睡觉

         由于有共性功能，我们提取一个父类：人类。

         人类：
              姓名，年龄
              吃饭（）；
              睡觉（）{}

         抽烟的额外功能不是人或者老师，或者学生以开始就应该具备的，所以，我们把它定义为接口

         抽烟接口。

         部分老师抽烟：实现抽烟接口
         部分学生抽烟：实现抽烟接口

     实现：从抽象到具体

     使用：具体
 */
package JavaBasic0814;
//定义抽烟接口
interface Smoking{
    //抽烟的抽象方法
    public abstract void  smoke();
}

//定义抽象类
abstract class Person{
    //姓名，年龄
    private String name;
    private int age;

    public Person(){}
    public Person(String name,int age){
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

    //吃饭（）；
    public abstract void eat();

    //睡觉（）{}
    public void sleep(){
        System.out.println("睡睡觉了");
    }
}

//具体老师类
class Teacher extends Person{
    public Teacher(){}

    public Teacher(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("吃白菜");
    }
}

//具体学生类
class Student extends Person{
    public Student(){}

    public Student(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("吃肉");
    }
}

//抽烟的老师类
class SmokingTeacher extends Teacher implements Smoking{
    public SmokingTeacher(){}

    public SmokingTeacher(String name,int age){
        super(name,age);
    }

    public void smoke(){
        System.out.println("抽烟的老师");
    }
}

//抽烟的学生类
class SmokingStudent extends Student implements Smoking{
    public SmokingStudent(){}

    public SmokingStudent(String name,int age){
        super(name,age);
    }

    public void smoke(){
        System.out.println("抽烟的学生");
    }
}


public class InterfaceTest{
    public static void main(String[] args) {
        //
        SmokingStudent ss = new SmokingStudent();
        ss.setName("linqingxia");
        ss.setAge(27);
        System.out.println(ss.getName()+"---"+ss.getAge());
        ss.eat();
        ss.sleep();
        ss.smoke();
        System.out.println("------------------");

        SmokingStudent ss2=new SmokingStudent("liuyi",30);
        System.out.println(ss2.getName()+"---"+ss2.getAge());
        ss2.eat();
        ss2.sleep();
        ss2.smoke();
        System.out.println("------------------");

        SmokingTeacher st=new SmokingTeacher();
        st.setName("youyu");
        st.setAge(45);
        System.out.println(st.getName()+"---"+st.getAge());
        st.eat();
        st.sleep();
        st.smoke();
        System.out.println("------------------");

        SmokingTeacher st2=new SmokingTeacher("huzi",50);
        System.out.println(st2.getName()+"---"+st2.getAge());
        st2.eat();
        st2.sleep();
        st2.smoke();
    }
}
