/*
    继承的注意事项：
          A:子类只能继承父类的所有的非私有成员（成员方法和成员变量）
          B:子类不能继承父类的构造方法，但是可以通过super（马上讲）关键字去访问父类构造方法
          C:不要为了部分功能而去继承
             class A{
                public void show(){}
                public void show2(){}
             }

             class B{
                public void show2(){}
                public void show3(){}
             }

             我们发现B类中出现了和A类一样的show2（）方法，所以，我们就用继承类体现
             class B extends A{
                public void show3（）{}
              }
              这样其实不好，因为这样你不但有了show2（），还多了show（）。
              有可能show（）不是你想要的。

        那么，我们什么时候考虑使用继承呢？
            继承其实体现的是一种关系：“is a”。
            person
                 Student、
                 Teacher、
            水果
                苹果、
                香蕉、
                橘子、
 */
package JavaBasic0804;
class Father2{
    private int num=10;
    public int num2=20;

    //私有方法，子类不能继承
    private void method(){
        System.out.println(num);
        System.out.println(num2);
    }

    public void show(){
        System.out.println(num);
        System.out.println(num2);
    }
}
class Son2 extends Father2{
    public void function(){
        //num可以在Father中访问private
        //System.out.println(num);//子类不能继承父类的私有成员变量
        System.out.println(num2);

    }
}
public class ExtendsDemo3 {
     public static void main(String[] args){
         //创建对象
         Son2 s=new Son2();
         s.show();
         //s.method();//报错、子类不能继承父类的私有成员方法
         s.function();
     }
}
