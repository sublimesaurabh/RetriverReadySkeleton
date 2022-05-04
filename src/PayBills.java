// Made: May 3, 2022.
// By Saurabh Chapagain
// s205@umbc.edu

import java.util.Scanner;

//child class
public class PayBills extends StudentInformation{
    protected static double totalBalance;

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
        double payment = input.nextDouble();

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
