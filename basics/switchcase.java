package basics;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();
        switch (str) {
            case "Monday":
                System.out.println("welcome to 1st day of week");
                break;
            case "Tuesday":
                System.out.println("welcome to 2nd day of week");
                break;
            case "Wednesday":
                System.out.println("welcome to 3rd day of week");
                break;
            case "Thursday":
                System.out.println("welcome to 4th day of week");
                break;
            case "Friday":
                System.out.println("welcome to 5th day of week");
                break;
            case "Saturday":
                System.out.println("welcome to 6th day of week");
                break;
            case "Sunday":
                System.out.println("welcome to last day of week");
                break;
        }
    }
}
