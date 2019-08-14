/*
     final修饰变量的初始化时机
        A:被final修饰的变量只能赋值一次。
        B:在构造方法完毕前。（非静态的常量）
 */
package Javabasic0807;
 class Demof{
     //int num=10;
     //final int num2=20;
     /*
     {
        num= 10；
     }
      */
     int num;
     final int num2;

     public Demof(){
         num=100;
         //无法为最终变量num2分配值
         num2=200;
     }
 }
public class FinalTest2 {
     public static void main(String[] args){
         Demof d=new Demof();
         System.out.println(d.num);
         System.out.println(d.num2);
     }
}
