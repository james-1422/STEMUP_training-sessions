package HW.AUGUST02.progams;

import java.util.Scanner;

public class CurrencyCalculator {
    double USD = 87.89;
    double EURO = 101.01;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        CurrencyCalculator run = new CurrencyCalculator();

        do {
            System.out.println("----- OUTPUT BY JAMES J -----");
            System.out.println("----- CURRENCY CALCULATOR -----");
            System.out.println("1. Convert from RUPEES to USD");
            System.out.println("2. Convert from USD TO RUPEES");
            System.out.println("3. Convert from RUPEES TO EURO");
            System.out.println("4. Convert from EURO To RUPEES");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    run.RupeestoUSD(sc);
                    break;
                case 2:
                    run.USDtoRupees(sc);
                    break;
                case 3:
                    run.RupeestoEuro(sc);
                    break;
                case 4:
                    run.EurotoRupees(sc);
                    break;
                case 5:
                    System.out.println("THANK YOU FOR USING THIS CALCULATOR");
                    break;
                default:
                    System.out.println("YOUR ENTERED CHOICE IS INVALID!!! 🤦‍♂️");
            }
            System.out.println();
        } while (choice <= 5);
    }

    public void RupeestoUSD(Scanner sc) {
        System.out.print("Enter the amount in Indian Rupees to convert into USD: ");
        double rupees = sc.nextDouble();
        double answer = rupees / USD;
        System.out.println("The entered amount ₹" + rupees + " in US Dollars is: $" + answer);
        System.out.println("----- OUTPUT BY JAMES J -----");
    }

    public void USDtoRupees(Scanner sc) {
        System.out.print("Enter the amount in US Dollars to convert into Rupees: ");
        double usd = sc.nextDouble();
        double answer = usd * USD;
        System.out.println("The entered amount $" + usd + " in Indian Rupees is: ₹" + answer);
        System.out.println("----- OUTPUT BY JAMES J -----");
    }

    public void RupeestoEuro(Scanner sc) {
        System.out.print("Enter the amount in Indian Rupees to convert into Euro: ");
        double rupees = sc.nextDouble();
        double answer = rupees / EURO;
        System.out.println("The entered amount ₹" + rupees + " in Euro is: €" + answer);
        System.out.println("----- OUTPUT BY JAMES J -----");
    }

    public void EurotoRupees(Scanner sc) {
        System.out.print("Enter the amount in Euro to convert into Rupees: ");
        double euro = sc.nextDouble();
        double answer = euro * EURO;
        System.out.println("The entered amount €" + euro + " in Indian Rupees is: ₹" + answer);
        System.out.println("----- OUTPUT BY JAMES J -----");
    }
}
