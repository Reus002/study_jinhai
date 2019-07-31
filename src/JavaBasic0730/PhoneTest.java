/*
    作业：把手机类写成一个标准类，然后创建对象测试功能。

    手机类：
       成员变量：
           品牌：String brand；
           价格：int price；
           颜色：String color；
       成员方法：
           针对每一个成员变量给出对应的getXxx（）/setXxx（）方法
       最后定义测试：
           创建一个对象，先通过getXxx（）方法输出成员变量的值。这一次的结果是：null---0---null
           然后通过setXxx（）方法给成员变量赋值，再输出结果。这一次的结果是：三星---2999---土豪金
 */
class Phone {
    //品牌 价格 颜色
    private String brand;
    private int prica;
    private String color;
    //getXxx()
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public int getPrica(){
        return prica;
    }

    public void setPrica(int prica){
        this.prica=prica;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }
}

class PhoneTest{
    public static void main(String[] args){
        //创建手机对象
        Phone p=new Phone();
        //输出默认值
        System.out.println(p.getBrand()+"---"+p.getPrica()+"---"+p.getColor());
        //给成员变量赋值
        p.setBrand("三星");
        p.setPrica(2999);
        p.setColor("土豪金");
        //再次输出
        System.out.println(p.getBrand()+"---"+p.getPrica()+"---"+p.getColor());
    }
        }
