package JavaBasic0802;

public class ArrayTool2 {
    private ArrayTool2(){}

    public static void printArray2(int[] arr){
        for(int x=0;x<arr.length;x++){
            if (x==arr.length-1) {
                System.out.println(arr[x]);
            }else {
                System.out.println(arr[x]+",");
            }
        }
    }
    public static int getMax(int[] arr){
        int max=arr[0];

        for(int x=1;x<arr.length;x++){
            if (arr[x]>max) {
                max=arr[x];
            }
        }

        return max;
    }

    public static int getIndex(int[] arr,int value) {
        int index = -1;

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == value) {
                index = x;
                break;
            }
        }
        return index;
    }
}
