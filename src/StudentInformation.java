// Made: April 6, 2022.
// By Saurabh Chapagain
// s205@umbc.edu
import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentInformation {
   private static String firstName;
   private static String lastName;
   private static String courseName;
   private static double totalBalance;
   private static String studentID;
   private String studentEmail;
   private String gradeYear;
   private static double courseCost = 1104;

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
       System.out.println("Hello, " + this.firstName + this.lastName);
       System.out.println("Please enter your UMBC email: ");
       this.studentEmail = userInput.nextLine();
       System.out.println("What grade year are you?");
       this.gradeYear = userInput.nextLine();
       System.out.println("Please enter your student ID");
       this.studentID = userInput.nextLine();
   }


   public void enroll() {
       do {
           Scanner in = new Scanner(System.in);
           System.out.println("Please Enter Which class you want to register for: (Q to quit)");
           String courseName = in.nextLine();

           if (!courseName.equals("q")) {
               courseName = courseName + "\n" + courseName;
               totalBalance = totalBalance + courseCost;
           } else {
               break;
           }
       } while (true);

      /*TODO: BUG FIX
         courseName is not printing to console
       */
       System.out.println("ENROLLED IN: " + courseName);
       //System.out.println("TUITION BALANCE: " + totalBalance);
   }
   public void viewBalance(){
       System.out.println("Your balance is: $" + totalBalance);
   }

   //pays student balance
   public void payBalance(){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your payment: $");
       int payment = input.nextInt();
      //redirects if user put in amount that exceeds balance
       if(payment > totalBalance){
           System.out.println("The amount you have entered exceeds your balance. Please try again");
           payBalance();
       } else if(payment != input.nextInt()){
           System.out.println("You have entered a invalid number. Please try again");
           payBalance();
       }
       totalBalance = totalBalance - payment;
       System.out.println("Thank you for your payment of $" + payment);
       viewBalance();
   }

   // prints relevant info to console
    //TODO: showInfo(); not printing to console
    // Feel free to fix this bug
    public static String showInfo(){
       return "Name: " + firstName + lastName +
               "\nCourses Enrolled: " + courseName +
               "\nBalance is: $" + totalBalance;
    }
}

