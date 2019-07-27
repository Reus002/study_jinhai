package JavaBasic0727;

public class wee {
    public static void main(String args[]) {
        int sum=0,i;
        for( i=1;i<10;i++) {
            if (i % 2 == 0)
                continue;
            sum = sum + i;
        }
        System.out.println("sum="+sum);
        for(int j=2;j<=100;j++){
            for(i=2;i<=j/2;i++){
                if(j%i==0)
                    break;
            }
            if(i>j/2)
                System.out.println(""+j+"是素数");
        }

    }
}