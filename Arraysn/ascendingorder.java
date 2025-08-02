package Arraysn;
import java.util.Arrays;
import java.util.Scanner;

public class ascendingorder {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        System.out.println("enter the array" );
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array"+ Arrays.toString(arr));
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("the sorted array"+ Arrays.toString(arr));
    }
}
