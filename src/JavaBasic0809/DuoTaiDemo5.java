package JavaBasic0809;
class Animal3{
    public void eat(){

    }
}
class Dog2 extends Animal3{
    public void eat(){

    }
    public void lookDoor(){

    }
}
class Cat3 extends Animal3{
    public void playGame(){

    }
    public void eat(){

    }
}
public class DuoTaiDemo5 {
    public static void main(String[] args){
        //内存种的是狗
        Animal3 a=new Dog2();
        Dog2 d=(Dog2)a;

        //内存中是猫
        a=new Cat3();
        Cat3 c=(Cat3)a;

        //内存中是猫
        Dog2 dd=(Dog2)a;//类转换异常：ClassCastException:
    }
}
