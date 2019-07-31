///*
//    形式参数的问题：
//       基本类型：形式参数的改变不影响实际参数
//       引用类型：形式参数的改变直接影响实际参数
// */
//package JavaBasic0728;
////1形式参数是基本类型
//class Demo{
//    public int sum(int a,int b){
//        return a+b;
//    }
//}
////3形式参数是引用类型
//class Student{
//    public void show(){
//        System.out.println("我爱学习");
//    }
//}
//class StudentDemo{
//    //6如果你看到了一个方法的形式参数是一个类类型（引用类型），这里其实需要的是该类的对象。
//    public void method(Student s){//9调用的时候，把main的方法中的s地址传递到了这里Student s=new Student（）
//        s.show();
//    }
//}
//public class ArgsTest {
//    public static void main(String[] args){
//        //2形式参数是基本类型的调用
//        Demo d=new Demo();
//        int result=d.sum(10,20);
//        System.out.println("result:"+result);
//        System.out.println("--------------");
//
//
//        //4形式参数是引用类型的调用
//        //5需求：我要调用StudentDemo类中的method（）方法
//        StudentDemo sd=new StudentDemo();
//        //7创建学生对象
//        Student s=new Student();
//        sd.method(s);//8把s的地址给到了这里
//    }
//}
