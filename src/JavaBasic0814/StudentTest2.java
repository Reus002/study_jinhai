/*
     返回值类型
         基本类型：（基本类型太简单，我不准备讲解）
         引用类型：
             类：返回的是该类的对象。
             抽象类、
             接口、
 */
package JavaBasic0814;
class Student3{
    public void study(){
        System.out.println("Good Good Study,Day Day Up");
    }
}

class StudentDemo2{
    public Student3 getStudent() {
        //Student3 s = new Student3();
        //Student3 ss=s;

        //Student3 s=new Student3();
        //return s;
        return new Student3();//匿名
    }
}
public class StudentTest2 {
    public static void main(String[] args){
        //需求：我要使用Student3类中的study（）方法
        //但是，这一次我的要求是，不要直接创建Student3的对象
        //让你使用StudentDemo2帮你创建对象
        StudentDemo2 sd=new StudentDemo2();
        //new Student3();Student3 s=new Student3();
        Student3 s=sd.getStudent();
        s.study();
    }
}
