/*
     形式参数：
          基本类型（太简单，不是我今天要讲解的）
          引用类型
              类、
              抽象类：需要的是该抽象的类子类对象
              接口、
 */
package JavaBasic0814;
abstract class Person{
    public abstract void study();
}

class PersonDemo{
    public void method(Person p){//p;p=new Student2();Person p=new Student2();//多态
        p.study();
    }
}

//定义一个具体的学生类
class Student2 extends Person{
    public void study(){
        System.out.println("Good Good Study,Day Day Up");
    }
}

public class PersonTest {
    public static void main(String[] args){
        //目前是没有办法使用的
        //因为抽象类没有对应的具体类
        //那么，我们就应该先定义一个具体类
        //需求：我要使用PersonDemo类中的method（）方法
        PersonDemo pd=new PersonDemo();
        Person p=new Student2();
        pd.method(p);
    }
}
