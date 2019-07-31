package JavaBasic0730;

/*
     类的组成：成员变量，成员方法
     今天我们又加入了一个新的成员：构造方法
     以后再提供类的组成
        成员变量
        构造方法
        成员方法
           根据返回值：
             void的类型
             非void的类型
           形式参数：
             空参方法
             非空参方法
 */
class Student9{
    public void show(){
        System.out.println("show");
    }

    public String getSting(){
        return "HelloWorld";
    }

    public void method(String name){
        System.out.println(name);
    }

    public String function(String a,String b){
        return a+b;
    }

}
public class StudentDemo4  {
    public static void main(String[] args){
        //创建对象
        Student9 s=new Student9();

        //调用无参无返回值方法
        s.show();
        //调用无参有返回值方法
        String result=s.getSting();
        System.out.println(result);
        //调用带参无返回值方法
        s.method("linqingxia");
        //调用带参有返回值方法
        String result2=s.function("Hello","World");
        System.out.println(result2);
    }
}
