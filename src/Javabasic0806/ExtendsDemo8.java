/*
    继承中成员方法的关系：
       A:子类中的方法和父类中的方法声明不一样，这个太简单。
       B:子类中的方法和父类中的方法声明一样，这个该怎么玩？
           通过子类调用方法：
              a:先找子类中，看有没有这个方法，有就使用
              b:再看父类中，有没有这个方法，有就使用
              c:如果没有就报错
 */
package Javabasic0806;
class Father7{
    public void show(){
        System.out.println("show Father");
    }
}

class Son7 extends Father7{
    public void method(){
        System.out.println("method Son");
    }

    public void show(){
        System.out.println("show Son");
    }
}
public class ExtendsDemo8 {
    public static void main(String[] args){
        Son7 s=new Son7();
        s.method();
        s.show();
        //s.function();没有这个方法，报错
    }
}
