/*
    猫狗案例讲解

    先找到具体的事物，然后发现具体的事物共性，才提取出一个父类。
    猫：
      成员变量：姓名，年龄，颜色
      构造方法：无参，带参
      成员方法：
             getXxx（）/SetXxx（）
             eat（）
    狗：
      成员变量：姓名，年龄，颜色
      构造方法：无参，带参
      成员方法：
              getXxx（）/SetXxx（）
              eat（）
              lookDoor（）
    把共性定义到一个类中，这个类的名字叫：动物
    动物类：
      成员变量：姓名，年龄,颜色
      构造方法：无参，带参
      成员方法：
              getXxx（）/SetXxx（）
              eat（）

              猫：
                 构造方法：无参，带参
                 成员方法：palyGame（）
              狗：
                 构造方法：无参，带参
                 成员方法：lookDoor（）

 */

package Javabasic0806;
class Animal{
    private String name;
    private int age;
    private String color;

    public Animal(){}
    public Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println("不要睡了，该吃饭了");
    }
}
class Cat extends Animal{
    public Cat(){}
    public Cat(String name,int age,String color){
        super(name,age,color);
    }
    public void playGame(){
        System.out.println("猫在玩游戏");
    }
}
class Dog extends Animal{
    public Dog(){}
    public Dog(String name,int age,String color){
        super(name,age,color);
    }
    public void lookDoor(){
        System.out.println("狗在看家");
    }
}
public class ExtendsTest2 {
    public static void main(String[] args){
        //测试猫
        Cat c=new Cat();
        c.setName("Tom");
        c.setAge(3);
        c.setColor("白色");
        System.out.println("猫的名字是："+c.getName()+"；年龄是："+c.getAge()+"；颜色是："+c.getColor());
        Cat c1=new Cat("昆山",5,"白色");
        System.out.println("猫的名字是："+c1.getName()+"；年龄是："+c1.getAge()+"；颜色是："+c1.getColor());
        c.eat();
        c.playGame();
        //
        Dog d=new Dog();
        d.setName("Mike");
        d.setAge(8);
        d.setColor("黑色");
        System.out.println("狗的名字是："+d.getName()+"；年龄是："+d.getAge()+"；颜色是："+d.getColor());
        Dog d1=new Dog("世纪",10,"黑色");
        System.out.println("猫的名字是："+d1.getName()+"；年龄是："+d1.getAge()+"；颜色是："+d1.getColor());
        d.eat();
        d.lookDoor();

    }
}
