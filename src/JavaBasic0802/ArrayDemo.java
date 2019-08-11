package JavaBasic0802;

/*
    我想对数组进行操作

      在同一个文件下，类定义在两个文件中和定义一个文件中其实一样的。
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //定义数组
        int[] arr={28,55,37,46,19};/*
        //1需求：遍历数组
        for(int x=0;x<arr.length;x++){
            if (x==arr.length-1) {
                System.out.println(arr[x]);
            }else {
                System.out.println(arr[x]+",");
            }
        }*/

        //2如果我有多个数组都进行遍历，那么，代码的重复度就很高
        //2如何改进？用方法改进
        //3静态调用
        //3printArray(arr);

        //4非静态调用
        //4ArrayDemo ad=new ArrayDemo();
        //4ad.printArray(arr);

        //5测试类的作用：创建其它类的对象，调用其他类的功能
        //5而我们现在的操作是跟数组相关的，所以，你应该把这些操作定义到数组类中
        //5定义一个数组的操作类
        //5有了数组操作类之后的调用

        //ArrayTool at=new ArrayTool();//5创建ArrayTool工具类，非静态调用
        //at.printArray(arr);

        //6方法改进静态后，就可以直接通过类名调用
        ArrayTool.printArray(arr);//6工具类静态调用
    }
    //3静态测试
   /* public static void printArray(int[] arr){
        for(int x=0;x<arr.length;x++){
            if (x==arr.length-1) {
                System.out.println(arr[x]);
            }else {
                System.out.println(arr[x]+",");
            }
        }
    }*/

    //4假设该方法不是静态的
    /*public void printArray(int[] arr){
        for(int x=0;x<arr.length;x++){
            if (x==arr.length-1) {
                System.out.println(arr[x]);
            }else {
                System.out.println(arr[x]+",");
            }
        }
    }*/
}
