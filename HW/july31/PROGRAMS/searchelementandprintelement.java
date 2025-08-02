package HW;

import java.util.Scanner;

public class searchelementandprintelement {
        public static void main(String[] args){
            System.out.println("output by JAMES J");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows and columns: ");
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            System.out.println("Enter the elements of the array:");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter the element to search: ");
            int search = sc.nextInt();
            boolean value = false;
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == search) {
                        System.out.println("Element found at index: (row= " + i + ",column=  " + j + ")");
                        value = true;
                        break;
                    }
                }
            }

            if(value!=true){
                System.out.println("Element not found in the array.");
            }
        }

}
