package JavaBasic0729;

/*
    封装和private的应用：
        A：把成员变量有private修饰
        B：提供对应的getXxx（）和setXxx（）方法
 */
//定义学生类
class Student4{
    //1姓名
    private String name;
    //2年龄
    private int age;
    //3姓名获取值
    public String getName(){
        return name;
    }
    //4姓名赋值
    public void setName(String n){
        name=n;
    }
    //5年龄获取值
    public int getAge(){
        return age;
    }
    //6年龄赋值
    public void setAge(int a){
        age=a;
    }
}
//测试类
public class StudentTest {
    public static void main(String[] args){
        //7创建学生对象
        Student4 s=new Student4();
        //8使用成员变量
        //9错误：被私有修饰了，外界不能直接访问
        //9System.out.println(s.name+"---"+s.age);
        System.out.println(s.getName()+"---"+s.getAge());
        //10给成员变量赋值
        //s.name="linqingxia";
        //s.age=27;

        //11通过方法赋值
        s.setName("linqingxia");
        s.setAge(27);
        System.out.println(s.getName()+"---"+s.getAge());
    }
}
