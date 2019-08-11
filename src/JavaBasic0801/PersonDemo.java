package JavaBasic0801;

/*
    定义一个人类

    姓名和年龄都是变化的，这个我能接收，因为每个人的姓名和年龄是不同的。
    但是，我们现在选取的几个人都是中国人，他们国籍是一样的。
    一样的国籍，我每次创建对象，在堆内存都要开辟注意的空间。
    我就觉得有点浪费了。怎么办呢？针对多个对象有共同的注意的成员变量值的时候；
    java就提供了一个关键字来修饰：static
 */
    class Person{
    //姓名 年龄 国籍
    String name;
    int age;
    //String country;
    static String country;

    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(String name,int age,String country){
       this.name=name;
       this.age=age;
       this.country=country;
    }
    public void show(){
        System.out.println("姓名:"+name+",年龄："+age+",国籍："+country);
    }
}
public class PersonDemo {
    public static void main(String[] args){
        //
        Person p1=new Person("linqingxia",27,"zhongguo");
        p1.show();
        //
        //Person p2=new Person("liyi",20,"zhongguo");
        //p2.show();
        Person p2=new Person("liyi",20);
        p2.show();
        //
        //Person p3=new Person("xida",18,"zhongguo");
        //p3.show();
        Person p3=new Person("xida",18);
        p3.show();
        p3.country="meiguo";
        p3.show();

        p1.show();
        p2.show();
    }
}
