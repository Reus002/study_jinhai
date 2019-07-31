package JavaBasic0731;
/*
    定义一个类Demo，其中定义一个求两个数据和的方法。
    定义一个测试类Test，进行测试。

    变量什么时候定义为成员变量：
       如果这个比变量是用来描述这个类的信息的，那么，该变量就应该定义为成员变量。

    变量到底定义在哪里好呢？
       变量的范围是越小越好。因为能及时地被回收。

 */
//方式一
/*class Demo{
    public int sum(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
}*/
//方式一满足了我们的要求，但是不好。
//因为参与操作的数据现在是固定的。

//方式二
/*class Demo{
    public int sum(int a,int b){
        return a+b;
    }
}*///方式二可以满足我们的要求，但是我们学习过来面向对象的思想。
//我就再想，a，b可不可以定义为成员变量呢？
//如果可以，我们再改进一版。

//方式三
class Demo1{
    int a;
    int b;
    public int sum(){
        return a+b;
    }//虽然这种方式可以，并且好像是符合了面向对象的思想。
    //但是不好，因为我们曾经说过：类是一组相关的属性和行为的集合。
    //并且类是通过事物转换过来的
    //而类中成员变量就是事物的属性
    //属性是用来描述事物的
    //同理，成员变量其实是用来描述类的。
}
public class Test {
    public static void main(String[] args){
        //创建对象
        //方式一测试
        /*Demo1 d=new Demo1();
        System.out.println(d.sum());*/
        //方式二测试
        /*Demo1 d=new Demo1();
        int a=10;
        int b=20;
        System.out.println(d .sum(a,b));*/
        //方式三测试
        Demo1 d=new Demo1();
        d.a=10;
        d.b=20;
        System.out.println(d.sum());
    }
}
