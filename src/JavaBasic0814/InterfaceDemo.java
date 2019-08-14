/*
     教练和运动员案例
        乒乓球运动员和篮球运动员。
        乒乓球教练和篮球教练。
        为了出国交流，跟乒乓球相关的人员都需要学习英语。
        请用所学知识：
        分析，这个案例中有那些抽象类，哪些接口类，哪些具体类。

 */
package JavaBasic0814;

import com.sun.media.jfxmedia.events.PlayerEvent;

import java.security.PublicKey;

//定义一个说英语的接口
interface SpeakEnglish{
    public abstract void speak();
}

//定义人类
abstract class Person2{
    private String name;
    private int age;

    public Person2(){}

    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //睡觉
    public void sleep(){
        System.out.println("人都是要睡觉的");
    }

    //吃饭
    public abstract void eat();
}

//定义运动员抽象类
abstract class Player extends Person2{
    public Player(){}

    public Player(String name,int age){
        super(name,age);
    }

    //学习
    public abstract void study();
}

//定义教练抽象类
abstract class Coach extends Person2{
    public Coach(){}

    public Coach(String name,int age){
        super(name,age);
    }

    //学习
    public abstract void teach();
}

//定义乒乓球运动员具体类
class PingPangPalyer extends Player implements SpeakEnglish{
    public PingPangPalyer(){}

    public PingPangPalyer(String name,int age){
        super(name,age);
    }

    //吃
    public void eat(){
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }

    //学习
    public void study(){
        System.out.println("乒乓球运动员学习如何发球和接球");
    }

    //说
    public void speak(){
        System.out.println("乒乓球运动员说英语");
    }
}

//定义篮球运动员具体类
class BasketballPalyer extends Player{
    public BasketballPalyer(){}

    public BasketballPalyer(String name,int age){
        super(name,age);
    }

    //吃
    public void eat(){
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }

    //学习
    public void study(){
        System.out.println("篮球球运动员学习如何运球和投篮");
    }
}

//定义乒乓球教练具体类
class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach(){}

    public PingPangCoach(String name,int age){
        super(name,age);
    }

    //吃
    public void eat(){
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }

    //教
    public void teach(){
        System.out.println("乒乓球教练教如何发球和接球");
    }

    //说
    public void speak(){
        System.out.println("乒乓球教练说英语");
    }
}

//定义篮球教练具体类
class BasketballCoach extends Coach {
    public BasketballCoach(){}

    public BasketballCoach(String name,int age){
        super(name,age);
    }

    //吃
    public void eat(){
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }

    //教
    public void teach(){
        System.out.println("篮球球教练教如何运球和投篮");
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        //测试运动员(乒乓球运动员和篮球运动员)
        //乒乓球运动员
        PingPangPalyer ppp=new PingPangPalyer();
        ppp.setName("王浩");
        ppp.setAge(33);
        System.out.println(ppp.getName()+"---"+ppp.getAge());
        ppp.eat();
        ppp.sleep();
        ppp.study();
        ppp.speak();
        System.out.println("----------");

        PingPangPalyer ppp2=new PingPangPalyer("王浩",33);
        System.out.println(ppp2.getName()+"---"+ppp2.getAge());
        ppp2.eat();
        ppp2.sleep();
        ppp2.study();
        ppp2.speak();
        System.out.println("----------");

        //篮球运动员
        BasketballPalyer bp=new BasketballPalyer();
        bp.setName("姚明");
        bp.setAge(34);
        System.out.println(bp.getName()+"---"+bp.getAge());
        bp.eat();
        bp.sleep();
        bp.study();
        System.out.println("---------");

        BasketballPalyer bp2=new BasketballPalyer("姚明",34);
        System.out.println(bp2.getName()+"---"+bp2.getAge());
        bp2.eat();
        bp2.sleep();
        bp2.study();
        System.out.println("---------");

        //测试教练（乒乓球教练和篮球教练）
        //乒乓球教练
        PingPangCoach ppc=new PingPangCoach();
        ppc.setName("乒乓球教练");
        ppc.setAge(50);
        System.out.println(ppc.getName()+"---"+ppc.getAge());
        ppc.eat();
        ppc.sleep();
        ppc.speak();
        ppc.teach();
        System.out.println("-----------");

        PingPangCoach ppc2=new PingPangCoach("乒乓球教练",50);
        System.out.println(ppc2.getName()+"---"+ppc2.getAge());
        ppc2.eat();
        ppc2.sleep();
        ppc2.speak();
        ppc2.teach();
        System.out.println("-----------");

        //篮球教练
        BasketballCoach bc=new BasketballCoach();
        bc.setName("篮球教练");
        bc.setAge(51);
        System.out.println(bc.getName()+"---"+bc.getAge());
        bc.eat();
        bc.sleep();
        bc.teach();
        System.out.println("--------------");

        BasketballCoach bc2=new BasketballCoach("篮球教练",51);
        System.out.println(bc2.getName()+"---"+bc2.getAge());
        bc2.eat();
        bc2.sleep();
        bc2.teach();
    }
}
