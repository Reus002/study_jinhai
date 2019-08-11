/*
     抽象类的概述：
         动物不应该定义为具体的东西，而且动物中的吃，睡觉也不应该是具体的。
         我们把一个不是具体的功能称为抽象的功能，而一个类中如果又抽象的功能，

     抽象类的特点：
         A:抽象类和抽象方法必须用abstract关键字修饰
         B:抽象类中不一定有抽象方法，但是又抽象方法的类必须定义为抽象类
         C:抽象类不能实例化
              因为它不是具体的。
              抽象类又构造方法，但是不能实例化？构造方法的作用是什么呢？
              用于子类访问父类数据的初始化
         D:抽象的子类
            a:如果不想重写抽象方法，该子类是一个抽象类。
            b:重写所有的抽象方法，这个时候子类是一个具体的类。

         抽象类的实例化其实是靠具体的子类实现的。是多态的方式。
                Animal a=new Cat（）；
 */
package JavaBasic0810;
//abstract class Animal//抽象类的声明格式
abstract class Animal5{
    //抽象方法
    //public abstract void eat(){}//空方法体，这个会报错。抽象方法不能有主体
    public abstract void eat();

    public Animal5(){}

}

//子类是抽象类
abstract class Dog4 extends Animal5{}

//子类是具体类，重写抽象方法
 class Cat4 extends Animal5{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
public class AbstractDemo {
    public static void main(String[] args){
        //创建对象
        //Animal是抽象的；无法实例化
        //Animal5 a=new Animal5();
        //通过多态的方式
        Animal5 a=new Cat4();
        a.eat();
    }
}
