import java.util.Scanner;

public class Smallestelement {
    public int minele(int[] arr , int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the  elements of array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Smallestelement sol=new Smallestelement();
        int ans=sol.minele(arr , n);
        System.out.println("the largest element in the given array is: " + ans);
    }
}
