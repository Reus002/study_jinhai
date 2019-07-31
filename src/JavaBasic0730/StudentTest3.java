package JavaBasic0730;

/*

 */
//定义学生类
class Student6{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class StudentTest3 {
    public static void main(String[] args){
        //创建一个对象
        Student6 s=new Student6();
        s.setName("linqingxia");
        s.setAge(27);
        System.out.println(s.getName()+"---"+s.getAge());
        //创建第二个对象
        Student6 s1=new Student6();
        s1.setName("liyi");
        s1.setAge(30);
        System.out.println(s1.getName()+"---"+s1.getAge());
    }
}
