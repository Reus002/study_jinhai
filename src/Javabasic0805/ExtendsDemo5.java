/*
    问题是：
        我不仅仅要输出局部范围的num，还要输出本类成员范围内的num。怎么办呢？
        我还想要输出父类成员范围的num。怎么办呢？
            如果有一个东西和this相似，但是可以直接访问父类的数据就好了。
            恭喜你，这个关键字是存在的：super。

    this和super的区别？
        分别是什么？
            this：代表本类对应的引用。
            super：代表父类存储空间的标识（可以理解为父类的引用，可以操作父类的成员）

        怎么用呢？
            A:调用成员变量
               this：成员变量 调用本类的成员变量
               super：成员变量 调用父类的成员变量
            B:调用构造方法
               this(...)：调用本类的构造方法
               super(...)：调用父类的构造方法
            C:调用成员方法
               this：成员方法 调用本类的成员方法
               super：成员方法 调用父类的成员方法
 */
package Javabasic0805;
class Father4{
    public int num=10;
}
class Son4 extends Father4 {
    public int num=20;
    public void show(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}

public class ExtendsDemo5 {
    public static void main(String[] args) {
        //创建对象
        Son4 s = new Son4();
        s.show();
    }
}