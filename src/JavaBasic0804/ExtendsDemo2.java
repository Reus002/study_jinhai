/*
   java中继承的特点：
         A:java只支持单继承，不支持多继承。
              有些语言是支持多继承，格式：extends类1、类2、、、、
         B:java支持多层继承（继承体系）

 */
package JavaBasic0804;
/*class Father{}
class Son extends Father{}//正确的
class Mother{}
class Son extends Father,Mother{}//错误的
*/
class GrandFather{
    public void show(){
        System.out.println("我是爷爷");
    }
}
class Son extends Father{}

class Father extends GrandFather{
    public void method(){
        System.out.println("我是老子");
    }
}

public class ExtendsDemo2 {
    public static void main(String[] args){
        Son s=new Son();
        s.method();//使用父亲的
        s.show();//使用爷爷的
    }
}
