/*
    不同地方饮食文化不同的案例
 */
package JavaBasic0809;
class Person2{
    public void eat(){
        System.out.println("吃饭");
    }
}

class SouthPerson extends Person2{
    public void eat(){
        System.out.println("炒菜，吃米饭");
    }

    public void jinShang(){
        System.out.println("jinshang");
    }
}

class NoethPerson extends Person2{
    public void eat(){
        System.out.println("炖菜，吃馒头");
    }
    public void yanJiu(){
        System.out.println("研究");
    }
}
public class DuoTaiTest2 {
    public static void main(String[] args){
        //测试
        //南方人
        Person2 p=new SouthPerson();
        p.eat();
        System.out.println("----------");
        SouthPerson sp=(SouthPerson)p;
        sp.eat();
        sp.jinShang();
        System.out.println("-----------");

        // 北方人
        p=new NoethPerson();
        p.eat();
        System.out.println("------------");
        NoethPerson np=(NoethPerson)p;
        np.eat();
        np.yanJiu();
    }
}
