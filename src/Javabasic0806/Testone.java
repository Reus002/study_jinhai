/*
  方法重写与方法重载的区别？方法重载能改变返回值类型吗？
    方法重写：子类中出现了和父类中方法声明一模一样的方法声明的现象
    方法重载：本类中出现的方法名相同，参数列表不同的方法。
          方法重载能改变返回值类型，因为它和返回值类型无关。

          this关键字与super关键字分别代表什么？以及他们各自的使用场景和作用？
          this：代表当前类的对象引用
          super：代表父类存储空间的标识
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
package Javabasic0806;

public class Testone {
}
