package HW;

import java.util.Scanner;

public class spiralmatrix {
        public static void main(String[] args){
            System.out.println("output by JAMES J");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows and columns: ");
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            System.out.println("Enter the elements of the array: ");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Spiral order of the matrix:");
            int left=0,right=n-1;
            int top=0,low=n-1;
            while(top<=low && left<=right) {
                for (int i = left; i < right; i++) {
                    System.out.print(arr[top][i]+" ");
                }
                top++;
                for(int i = top; i <= low; i++){
                    System.out.print(arr[i][right] + " ");
                }
                right--;
                if(top <= low) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(arr[low][i] + " ");
                    }
                    low--;
                }
                if(left <= right) {
                    for (int i = low; i >= top; i--) {
                        System.out.print(arr[i][left] + " ");
                    }
                    left++;
                }

            }

        }
}
