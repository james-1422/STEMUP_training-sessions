import java.util.Arrays;
import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("original array"+ Arrays.toString(arr));
        boolean found=false;
        for (int i=0;i<n;i++){

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }
            if(found!=true){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
