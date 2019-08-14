/*
     面试题：final修饰局部变量的问题
 */
package Javabasic0807;
class student{
    int age=50;
}
public class FinalTest {
    public static void main(String[] args){
        //
        int x=10;
        x=100;
        System.out.println(x);
        final int y=20;
        //无法为最终变量y分配值
        //y=200;
        System.out.println(y);
        System.out.println("----------");

        //局部变量是引用数据类型
        student s=new student();
        System.out.println(s.age);
        s.age=100;
        System.out.println(s.age);
        System.out.println("-----------------");

        final student ss= new student();
        System.out.println(ss.age);
        ss.age=100;
        System.out.println(ss.age);

        //重新分配内存空间
        //无法为最终变量ss分配值
        //ss=new student();
    }
}
