/*
    多态的弊端：
        不能使用子类的特有功能。
*/
package JavaBasic0808;
class Fu4{
    public void show(){
        System.out.println("show Fu");
    }
}

class Zi4 extends Fu4{
    public void show(){
        System.out.println("show Zi");
    }
    public void method(){
        System.out.println("method Zi");
    }
}

public class DuoTaiDemo2 {
    public static void main(System[] args){
        //测试
        Fu4 f=new Fu4();
        f.show();
        //f.method();
    }
}
