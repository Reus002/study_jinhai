package JavaBasic0730;

/*
     构造方法：
        给对象的数据进行初始化
      格式：
        A:方法名与类名相同
        B:没有返回值类型，连void都没有
        C:没有具体的返回值

 */
class Student7{
    private String name;//null
    private int age;//0
    public Student7(){
        System.out.println("这是构造方法");
    }

}
public class ConstructDemo {
    public static void main(String[] args){
        //创建对象
        Student7 s=new Student7();
        System.out.println(s);//Student7@135fbaa4
    }
}
