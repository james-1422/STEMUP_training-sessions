package TwoDarray;

import java.util.*;

public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of array");
        int n=sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("enter the first array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        System.out.println("the sum array is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
