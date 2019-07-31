package JavaBasic0728;

/*
    定义一个学生类：
       成员变量：name.age
       成员方法：show（）方法
*/
class Student2{
    //1姓名
    String name;
    //2年龄
    int age;
    //3show（）方法，显示所有成员变量值
    public void show(){
        System.out.println(""+name);
        System.out.println(""+age);
    }
}
class StudentDemo2 {
    public static void main(String[] args){
        //4创建学生对象
        Student2 s=new Student2();
        s.show();
        System.out.println("-------");

    }
}
