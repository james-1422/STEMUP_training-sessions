package HW;

import java.util.Scanner;

public class sumoftwomatrix {
        public static void main(String[] args){
            System.out.println("output by JAMES J");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows and colums: ");
            int n = sc.nextInt();
            int[][] matrix1 = new int[n][n];
            int[][] matrix2 = new int[n][n];
            int[][] result = new int[n][n];
            System.out.println("Enter elements of first matrix:");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix:");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    matrix2[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Sum of the two matrices is:");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


