/*
    继承的代码体现

    由于继承中方法有一个现象；方法重写。
    所以，父类的功能，就会被子类给覆盖掉。
    有些时候，我们不想让子类去覆盖掉父类的功能，只能让他使用。
    这个时候，针对这种情况。java就提供了一个关键字：final

    final：最终的意思。常见的是它可以修饰类，方法，变量。
 */
package Javabasic0807;
class fu {
    public  void show(){//final
        System.out.println("这里是绝密资源，任何人都不能修改");
    }
}
class zi extends fu{
    //zi中的show（）无法覆盖fu中的show（）
    public void show(){
        System.out.println("这是一堆垃圾");
    }
}
public class ziDemo {
    public static void main(String[] args){
        zi z=new zi();
        z.show();
    }
}
