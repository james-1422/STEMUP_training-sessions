import java.util.Arrays;
import java.util.Scanner;

public class Reversiearray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //reverse
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
