package JavaBasic0802;/*
     我想对数组进行操作
 */
import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {28, 55, 37, 46, 19};
        //遍历
        ArrayTool2.printArray2(arr);

        //获取最值
        int max= ArrayTool2.getMax(arr);
        System.out.println("max:"+max);

        //获取55的索引值
        int index= ArrayTool2.getIndex(arr,55);
        System.out.println("index:"+index);

    }
}
