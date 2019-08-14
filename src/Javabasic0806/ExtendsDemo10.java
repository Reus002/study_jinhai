/*
    方法重写的注意事项：
        A:父类中私有方法不能被重写
             因为父类私有方法子类根本无法继承
        B:子类重写父类方法时，访问权限不能更低
             最好一致
        C:父类静态方法。子类也必须通过静态方法进行重写
           其实这个算不上方法重写，但是现象确实如此，至于为什么算不上方法重写，多态中会讲。

 */
package Javabasic0806;
class Father8{
   //private void show(){}
    public void show(){
        System.out.println("show Father");
    }
    public static void method(){
        System.out.println("method Father");
    }
}

class Son8 extends Father8{
    /*void show(){
        System.out.println("show Son");
    }*/
     public void show(){
         System.out.println("show Son");
     }
     //public void method(){}
     public static void method(){}
}
public class ExtendsDemo10 {
}
