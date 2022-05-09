// Made: May 3, 2022.
// By Saurabh Chapagain
// s205@umbc.edu

import java.util.Scanner;

/**
 * This is java mail class that sends an email to the user
 *
 * We use Regex for email validation, and smtp for sending the email.
 *
 * @author Saurabh Chapagain
 * @version 1.0
 * @see RetrieverReady
 *
 *
 */

public class PayBills extends StudentInformation{
    protected static double totalBalance;
    protected static double totalPayment;

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public double getCourseCost() {
        return courseCost;
    }

    public double getCourseCostFullTime() {
        return courseCostFullTime;
    }

    //shows balance
    public void viewBalance () {
        System.out.println("Your balance is: $" + totalBalance);
    }

    //pays student balance
    public void payBalance () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your payment: $");
        totalPayment = input.nextDouble();
    }
    public void payBalance (double payment) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your payment: $");
//        payment = input.nextDouble();
        if (payment > totalBalance) {
            System.out.println("The amount you have entered exceeds your balance. Please try again");
            System.out.println("Enter your payment: $");
            payment = input.nextDouble();
            totalBalance = totalBalance - payment;
            System.out.println("Thank you for your payment of $" + payment);
        } else if (payment <= totalBalance) {
            totalBalance = totalBalance - payment;
            System.out.println("Thank you for your payment of $" + payment);
        }
    }
}
