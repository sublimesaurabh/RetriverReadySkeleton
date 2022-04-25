// Made: April 6, 2022.
// By Saurabh Chapagain
// s205@umbc.edu
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class StudentInformation {
    protected static String [] courseNamesList = new String[7];
    private static String firstName;
    private static String lastName;
    private static String courseEnrolledName;
    private static double totalBalance;
    private static String studentID;
    private static String studentEmail;
    private static int gradeYear;
    private static double courseCost = 1104.00;
    private static double courseCostFullTime = 4439.00;

    private double fullTimeCost = 6309;

   /*TODO: 4/7/22
    Course Cost needs to be expanded upon
     - Full time and Part time students are charged different
     - Limit students to only enroll in 7 courses, if they try to enroll more
     they need permission from advisor
     - In State students are charged differently, than out-of-state students
    */

   public void Student() {
       Scanner userInput = new Scanner(System.in);
       System.out.println("Please enter your first name: ");
       this.firstName = userInput.nextLine();

       System.out.println("Please enter your last name: ");
       this.lastName = userInput.nextLine();

       System.out.println("Hello, " + this.firstName + " " + this.lastName);

       System.out.println("Please enter your UMBC email: ");
       this.studentEmail = userInput.nextLine();

       System.out.println("What grade year are you? (Press 1 for Freshman, 2 for Sophomore, 3 for Junior, 4 for Senior");
       this.gradeYear = userInput.nextInt();

       // Consuming the leftover new line
       // using the nextLine() method
       userInput.nextLine();

       System.out.println("Please enter your student ID");
       this.studentID = userInput.nextLine();
   }


   public void enroll() {
        do{
           Scanner in = new Scanner(System.in);
           System.out.print("Please Enter Which class you want to register for: (q to quit)");
           String courseName = in.nextLine();
           if (!courseName.equals("q")) {
               courseEnrolledName = courseEnrolledName + "\n" + courseName;
               totalBalance = totalBalance + courseCost;
           } else {
               break;
           }
       } while (true);
        //System.out.println("You are enrolled in the following: " + courseEnrolledName);
   }

//   public void viewCourses() {
//       System.out.println("You are enrolled in the following: " + courseEnrolledName);
//   }
   //shows balance
   public void viewBalance(){
       System.out.println("Your balance is: $" + totalBalance);
   }

   //pays student balance
   public void payBalance() {
       try {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your payment: $");
           int payment = input.nextInt();
           //redirects if user put in amount that exceeds balance
           if (payment > totalBalance) {
               System.out.println("The amount you have entered exceeds your balance. Please try again");
               payBalance();
           } //
           totalBalance = totalBalance - payment;
           System.out.println("Thank you for your payment of $" + payment);
           viewBalance();
       } catch (Exception wrongInput) {
           viewBalance();
       }
   }

   //prints relevant inputs to console at the end of the program
    public static void showInfo() {
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Email: " + studentEmail);
        System.out.println("Grade Year: " + gradeYear);
        System.out.println("Courses Enrolled: " + courseEnrolledName);
        System.out.println("Total Balance: " + totalBalance);
    }
}

