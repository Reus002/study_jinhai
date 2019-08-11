/*
     猫狗案例：
         具体事物：猫、狗
         共性：姓名、年龄、吃饭

     分析：从具体到抽象
         猫：
             成员变量：姓名、年龄
             构造方法：无参、到参
             成员方法：吃饭（猫吃鱼）
         狗：
             成员变量：姓名、年龄
             构造方法：无参、到参
             成员方法：吃饭（狗吃肉）

         因为有共性的内容，所以就提取了一个父类：动物。
         但是又由于吃饭的内容不一样，所以吃饭的方法是抽象类的，
         而方法是抽象的类，类就必须定义为抽象类。

         抽象动物类：
             成员变量：姓名、年龄
             构造方法：无参、到参
             成员方法：吃饭（）；

         实现：从抽象到具体
         动物类：
             成员变量：姓名、年龄
             构造方法：无参、到参
             成员方法：吃饭（）；

         狗类：
             继承自动物类
             重写吃饭（）；

         猫类：
             继承自动物类
             重写吃饭（）；

 */
package JavaBasic0810;

import java.util.Date;

//定义抽象的动物类
abstract class Animal7{
    //
    private String name;
    private int age;

    public Animal7(){}

    public Animal7(String name,int age){
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
    public abstract void eat();
}

//定义具体的狗类
class Dog6 extends Animal7{
    public Dog6(){}

    public Dog6(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("狗吃肉");
    }
}

//定义一个具体的猫类
class Cat6 extends Animal7{
    public Cat6(){}

    public Cat6(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
}
//测试类
public class AbstractTest {
    public static void main(String[] args){
        //测试狗类
        //具体类用法
        //方式1：
        Dog6 d=new Dog6();
        d.setAge(3);
        d.setName("wangcai");
        System.out.println(d.getName()+"---"+d.getAge());
        d.eat();
        //方式二：
        Dog6 d1=new Dog6("wangcai",3);
        System.out.println(d.getName()+"---"+d.getAge());
        d1.eat();
        System.out.println("-------------");

        Animal7 a=new Dog6();
        a.setName("wangcai");
        a.setAge(3);
        System.out.println(a.getName()+"---"+a.getAge());
        a.eat();

        Animal7 a2=new Dog6("wangcai",3);
        System.out.println(a2.getName()+"---"+a2.getAge());
        a2.eat();
        System.out.println("-------------");

        //测试猫类
        Cat6 c=new Cat6();
        c.setName("miqi");
        c.setAge(5);
        System.out.println(c.getName()+"---"+c.getAge());
        c.eat();

        Cat6 c2=new Cat6("miqi",5);
        System.out.println(c2.getName()+"---"+c2.getAge());
        c2.eat();
        System.out.println("------------");

        Animal7 a3=new Cat6();
        a3.setName("miqi");
        a3.setAge(5);
        System.out.println(a3.getName()+"---"+a3.getAge());
        a3.eat();

        Animal7 a4=new Cat6("miqi",5);
        System.out.println(a4.getName()+"---"+a4.getAge());

    }
}
