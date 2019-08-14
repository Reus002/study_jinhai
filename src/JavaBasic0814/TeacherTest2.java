/*
     返回值类型
         基本类型：（基本类型太简单，我不准备讲解）
         引用类型：
             类、
             抽象类、
             接口：返回的是该接口的实现类的对象
 */
package JavaBasic0814;
//定义一个爱好的接口
interface Love2{
    public abstract void love();
}

class LoveDemo2{
    public Love2 getLove(){
        //Love2 l=new Teacher2();
        //return l;

        return new Teacher2();
    }
}

//定义具体类实现接口
class Teacher2 implements Love2{
    public void love(){
        System.out.println("老师爱学生，爱java");
    }
}
public class TeacherTest2{
    public static void main(String[] args){
        //如何测试呢？
        LoveDemo2 ld=new LoveDemo2();
        //new Teacher2();Love2 l=new Teacher2();//多态
        Love2 l=ld.getLove();
        l.love();
    }
}
