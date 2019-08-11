/*
     假如我们在开发一个系统是需要对员工类进行设计，员工包含3个属性：姓名，工号以及工资。
     经理也是员工，除了含有员工的属性外，另外还有一个奖金属性。
     请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。

     分析：
         普通员工类
            成员变量：姓名，工号以及工资。
            成员方法：工作
         经理类
            成员变量：姓名，工号以及工资，奖金属性
            成员方法：工作

     实现：
        员工类：
        普通员工类：
        经理类：
 */
package JavaBasic0811;
//定义员工类
 abstract class Employee2{
     //姓名，工号，工资
    private String name;
    private String id;
    private int salary;

    public Employee2(){}

    public Employee2(String name,String id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    //抽象方法
    public abstract void work();
}

//普通员工类
class Programmer extends Employee2{
     public Programmer(){}

     public Programmer(String name,String id,int salary){
         super(name,id,salary);
     }

     public void work(){
         System.out.println("按照需求写代码");
     }
}

class Manger extends Employee2{
     private int money;//奖金

    public Manger(){}

    public Manger(String name,String id,int salary,int money){
        super(name,id,salary);
        this.money=money;
    }

    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money=money;
    }

    public void work(){
        System.out.println("跟客户谈需求");
    }
}

public class AbstractTest {
     public static void main(String[] args){
         //测试普通员工类
         Employee2 em=new Programmer();
         em.setSalary(8000);
         em.setName("linqingxia");
         em.setId("hufhe241242");
         System.out.println(em.getName()+"---"+em.getId()+"---"+em.getSalary());
         em.work();
         System.out.println("----------");

         em=new Programmer("linqingxia","ssduhs2e4",10000);
         System.out.println(em.getName()+"---"+em.getId()+"---"+em.getSalary());
         em.work();
         System.out.println("-----------");

         /*em=new Manger();
         em.setName("liuyi");
         em.setId("wr32");
         em.setSalary(12000);
         */
         //由于子类特有的内容，所以我们用子类类测试
         Manger m=new Manger();
         m.setName("liuyi");
         m.setId("we123");
         m.setSalary(12000);
         m.setMoney(5000);
         System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary()+"---"+m.getMoney());
         m.work();
         System.out.println("-------------");

         //通过构造方法赋值
         m=new Manger("liuyi","wewqr212",8000,6000);
         System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary()+"---"+m.getMoney());
         m.work();
     }
}
