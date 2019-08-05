/*
    类的组成：
        成员变量；
        构造方法：
        成员方法：

    而我们又讲解了继承，所以，我们就应该来考虑一下，类的组成部分的各自关系

    继承成员变量的关系：
        A：子类中的成员变量和父类中的成员变量名称不一样，这个太简单。
        B：子类中的成员变量和父类中的成员变量名称一样，这个怎么玩呢？
             在子类方法中访问一个变量的查找顺序：
                 a:在子类方法的局部范围找，有就使用
                 b:在子类的成员范围找，有就使用
                 c:在父类的成员范围找，有就使用
                 d:如果还找不到，就报错


 */
package JavaBasic0804;
class Father3{
    public int num=10;//再然后
}
class Son3 extends Father3{
    public int num2=20;
    public int num=30;//再
    public void show(){
        int num=40;//先
        System.out.println(num);//就近原则
        System.out.println(num2);
    }
}

public class ExtendsDemo4 {
    public static void main(String[] args){
        //创建对象
        Son3 s=new Son3();
        s.show();
    }
}
