/*
   多态的好处：
        A:提高了代码的维护性（继承保证）
        B:提高了代码的扩展性（由多态保证）

    猫狗案例
 */
package JavaBasic0808;
class Animal2{
     public void eat(){
         System.out.println("eat");
     }
     public  void sleep(){
         System.out.println("sleep");
     }
 }
 class Dog2 extends Animal2{
     public void eat(){
         System.out.println("狗吃肉");
     }
     public void sleep(){
         System.out.println("狗站着睡");
     }
 }
 class Cat2 extends Animal2{
     public void eat(){
         System.out.println("猫吃鱼");
     }
     public void sleep(){
         System.out.println("猫趴着睡");
     }
 }

 class Pig extends Animal2{
    public void eat() {
        System.out.println("猪吃白菜");
    }
    public void sleep(){
        System.out.println("猪侧着睡");
    }
 }

 //6针对动物操作的工具类
 class AnimalTool{
    private AnimalTool(){}
    //6调用猫的功能
     /*
     public static void useCat(Cat2 c){
         c.eat();
         c.sleep();
     }
     //6调用狗的功能
     public static void useDog(Dog2 d){
         d.eat();
         d.sleep();
     }
     //8调用猪的功能
     public static void usePig(Pig p){
         p.eat();
         p.sleep();
     }
      */
     //10
     public static void useAnimal(Animal2 a){
         a.eat();
         a.sleep();
     }
 }

public class DuoTaiDemo3 {
     public static void main(String[] aegs){
         //1我喜欢猫，就养了一只
         Cat2 c=new Cat2();
         c.eat();
         c.sleep();

         //1我很喜欢猫，所以，又养了一只
         Cat2 c2=new Cat2();
         c2.eat();
         c2.sleep();

         //1我特别喜欢猫，又养了一只
         Cat2 c3=new Cat2();
         c3.eat();
         c3.sleep();
         //...
         System.out.println("----------");
         //2问题来了，我养了很多猫，每次创建对象是可以接受的
         //2但是呢？调用方法，你不觉得很相似吗？仅仅是对象名不一样。
         //2我们准备用方法改进
         //3调用方式改进版本
         //5useCat(c);
         //5useCat(c2);
         //5useCat(c3);

         //6AnimalTool.useCat(c);
         //6AnimalTool.useCat(c2);
         //6AnimalTool.useCat(c3);
         AnimalTool.useAnimal(c);
         AnimalTool.useAnimal(c2);
         AnimalTool.useAnimal(c3);
         System.out.println("------------");

         //我喜欢狗
         Dog2 d=new Dog2();
         Dog2 d2=new Dog2();
         Dog2 d3=new Dog2();
         //6AnimalTool.useDog(d);
         //6AnimalTool.useDog(d2);
         //6AnimalTool.useDog(d3);
         AnimalTool.useAnimal(d);
         AnimalTool.useAnimal(d2);
         AnimalTool.useAnimal(d3);

         System.out.println("------------");

         //7我喜欢宠物猪
         //7定义一个猪类，它要继承自动物。提供两个方法，并且还得在工具类中添加该类方法调用
         Pig p=new Pig();
         Pig p2=new Pig();
         Pig p3=new Pig();
         //8AnimalTool.usePig(p);
         //8AnimalTool.usePig(p2);
         //8AnimalTool.usePig(p3);
         AnimalTool.useAnimal(p);
         AnimalTool.useAnimal(p2);
         AnimalTool.useAnimal(p3);
         System.out.println("--------------");

         //9我喜欢宠物狼，老虎，豹子......
         //9定义对应的类，继承自动物，提供对应的方法重写，并在工具类中添加方法调用
         //9前面几个必须写，我是没有意见的
         //10但是，工具类每次都改，麻烦不？
         //10太简单了：把所有的动物都写上。问题是名字是什么呢？到底哪些需要被加入
         //10改用另一种解决方案、
     }
     /*
     //4调用猫的功能
    public static void useCat(Cat2 c){
         c.eat();
         c.sleep();
    }
    //4调用狗的功能
    public static void useDog(Dog2 d){
         d.eat();
         d.sleep();
    }*/
}
