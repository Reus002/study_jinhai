/*
    多态练习：猫狗案例
 */
package JavaBasic0809;
class Animal4{
    public void eat(){
        System.out.println("吃饭");
    }
}
class Dog3 extends Animal4{
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void lookDoor(){
        System.out.println("狗看门");
    }
}
class Cat4 extends Animal4{
    public void playGame(){
        System.out.println("猫吃鱼");
    }
    public void eat(){
        System.out.println("猫捉迷藏");
    }
}
public class DuoTaiTest {
    public static void main(String[] args){
        //定义为狗
        Animal3 a=new Dog2();
        a.eat();
        System.out.println("----------");
        //还原成狗
        Dog2 d=(Dog2)a;
        d.eat();
        d.lookDoor();
        System.out.println("------------");
        //变成猫
        a=new Cat3();
        a.eat();
        System.out.println("------------");
        // 还原为猫
        Cat3 c=(Cat3)a;
        c.eat();
        c.playGame();

        //演示错误的内容
        //Dog2 dd=new Animal3();
        //Dog2 ddd=new Cat3();

        //Dog2 dd=(Dog2)a;//ClassCastException：类转换异常
    }
}
