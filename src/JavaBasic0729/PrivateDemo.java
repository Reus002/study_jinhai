package JavaBasic0729;

/*
    private:
         是一个权限修饰符
         可以修饰成员变量和成员方法
         被修饰的成员只能在本类中被访问
 */
class Demo{
    //1int num=10;
    //2用private修饰
    private int num=10;
    public void show(){
        System.out.println(num);
    }
    public void method(){
        System.out.println("method");
    }
    public void function(){
        method();
    }
}
public class PrivateDemo {
    public static void main(String[] args){
        Demo d=new Demo();
        //3不能访问私有的成员变量
        //S4ystem.out.println(d.num);
        d.show();
        //5不能访问私有的成员方法
        //d.method();
        d.function();
    }
}
