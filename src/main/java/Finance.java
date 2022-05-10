// Made: May 3, 2022.
// By Saurabh Chapagain
// s205@umbc.edu

import java.util.Scanner;

/**
 * This is the Finance class that allows Student to pay their bills.
 *
 * It is the child class of the StudentInformation class.
 *
 * @author Saurabh Chapagain
 * @version 1.0
 * @see RetrieverReady
 *
 *
 */

public class Finance extends StudentInformation{

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

    /**
     * This is the viewBalance method which allows the user to view their balance.
     */
    public void viewBalance () {
        System.out.println("Your balance is: $" + totalBalance);
    }

    /**
     * This is the payBalance method which allows the user to pay their bills.
     */
    public void payBalance () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your payment: $");
        totalPayment = input.nextDouble();
    }
    /**
     * This is the payBalance method with parameters which allows the user to pay their bills.
     * If the amount is greater than the balance, it will print an error message and ask the user to pay again.
     *
     * @param payment
     */
    public void payBalance (double payment) {
        Scanner input = new Scanner(System.in);

        if (Math.max(payment, totalBalance) == payment && payment != totalBalance) {
            System.out.println("The amount you have entered exceeds your balance. Please try again");
            System.out.println("Enter your payment: $");
            payment = input.nextDouble();
            totalBalance = totalBalance - payment;
            System.out.println("Thank you for your payment of $" + payment);
        } else if (Math.max(payment, totalBalance) == totalBalance || payment == totalBalance) {
            totalBalance = totalBalance - payment;
            System.out.println("Thank you for your payment of $" + payment);
        }
    }
}
