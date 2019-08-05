package JavaBasic0804;
class Student12{
    static {//执行一次
        System.out.println("Student static");
    }

    {
        System.out.println("Student 构造代码块");
    }

    public Student12(){
        System.out.println("Student 构造方法");
    }
}

public class StudentDemo6 {
    static {
        System.out.println("qwertyuiop");
    }

    public static void main(String[] args){
        System.out.println("asdfghjkl");

        Student12 s=new Student12();
        Student12 s1=new Student12();
    }
}
