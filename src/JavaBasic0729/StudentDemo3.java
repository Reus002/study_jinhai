package JavaBasic0729;

/*
    定义一个学生类：
       成员变量：name.age
       成员方法：show（）方法

     我们在使用这个案例的过程中，发现了一个问题：
        通过对象给成员变量赋值，可以赋值一些非法的数据。
        这是不合理的。
        应该是这样子的：在赋值之前，先对数据进行判断。
        判断到底在哪里做比较合适呢？
        StudentDemo类是一个测试类，测试类一般只创建对象，调用方法。
        所以，这个判断应该定义在Student类中。
        而我们在成员变量的位置可不可以进行数据判断呢？
        是不可以的，因为做数据校验，必须要依靠一些逻辑语句。
        逻辑语句是应该定义在方法中的，所以，我们最终决定在Student类中提供一个方法来对数据进行校验
      按照我们前面的分析，我们给出了一个方法进行校验。
      但是呢，他偏偏就没有起到作用。
      我就应该要求必须使用我的方法，而不能直接调用成员变量赋值
      怎么去强制要求不能直接使用成员变量呢？
         针对这种情况，java就提供了一个关键字private
       private：私有的。可以修饰成员变量和成员方法。
          注意：被private修饰的成员只能在本类中访问。
       其实我讲到现在讲解的是一个封装的思想
       封装：是指隐藏对象的属性和实现仔细，仅对外提供公共访问方式

*/
class Student3 {
    //1姓名
    String name;
    //2年龄
    private int age;

    //7写一个方法对数据进行校验
    /*
       返回值类型：void
       参数列表：int a
    */
    public void setAge(int a) {
        if (a < 0 || age > 120) {
            System.out.println("你给的年龄有问题");
        } else {
            age = a;
        }
    }
    //3show（）方法，显示所有成员变量值
    public void show(){
        System.out.println(""+name);
        System.out.println(""+age);
    }
}
class StudentDemo3 {
    public static void main(String[] args){
        //4创建学生对象
        Student3 s=new Student3();
        s.show();
        System.out.println("-------");
        //5给成员变量赋值
        s.name="linqingxia";
        s.setAge(121);
        // s.age=27;
        s.show();
        System.out.println("---------");

        //6给age赋值
        //s.age=-27;//这是不合理的
        //通过方法给值
        //s.setAge(-27);
        s.show();
        System.out.println("------");

    }
}
