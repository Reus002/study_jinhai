/*
    多态的弊端：
        不能使用子类的特有功能。

    我就想使用子类的特有功能？行不行？
        行。

    怎么用？
        A:创建子类对象调用方法即可。（可以，但是很多时候不合理。而且，太占内存了）
        B:把父类的引用强制转换为子类的引用。（向下转型）

    对象间的转型问题：
        向上转型：
           Fu f=new Zi（）；
        向下转型：
           Zi z=（Zi）f；//要求该f必须是能够转换为Zi的。
*/
package JavaBasic0809;
class Fu5{
    public void show(){
        System.out.println("show Fu");
    }
}

class Zi5 extends Fu5{
    public void show(){
        System.out.println("show Zi");
    }
    public void method(){
        System.out.println("method Zi");
    }
}

public class DuoTaiDemo4 {
    public static void main(String[] args){
        //测试
        Fu5 f=new Zi5();
        f.show();
        //f.method();

        //创建子类对象
        //Zi5 z=new Zi5();
        //z.show();
        //z.method();

        //你能够把子的对象赋值给父亲，那么我能不能把父的引用赋值给子的引用呢？
        //如果可以，但是如下
        Zi5 z=(Zi5)f;
        z.show();
        z.method();
    }
}
