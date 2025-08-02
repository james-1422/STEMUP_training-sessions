package TwoDarray;

import java.util.Scanner;

public class initize2Darray {
    public static void main(String[] args){
        int[][] matrix=new int[2][3];
        System.out.println("enter the matrix: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
