package patterns.programs;

import java.util.Scanner;

public class pattern7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the length");
            int n = sc.nextInt();
            int a=1;
            for (int i = 1; i <=n; i++) {
                for (int j = 0; j<i; j++) {
                    System.out.print(a+" ");
                    a++;
                }
                System.out.println();
            }
        }
    }


