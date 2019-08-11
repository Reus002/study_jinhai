package JavaBasic0802;

public class ArrayTool {
    //5非静态测试
    /*public void printArray(int[] arr){
        for(int x=0;x<arr.length;x++){
            if (x==arr.length-1) {
                System.out.println(arr[x]);
            }else {
                System.out.println(arr[x]+",");
            }
        }
    }*/
    //6把构造方法私有，外界就不能创建对象了
    private ArrayTool(){}
        public static void printArray(int[] arr){
        for(int x=0;x<arr.length;x++){
            if (x==arr.length-1) {
                System.out.println(arr[x]);
            }else {
                System.out.println(arr[x]+",");
            }
        }
    }
}
