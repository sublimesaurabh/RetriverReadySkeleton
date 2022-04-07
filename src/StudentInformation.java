// Made: April 6, 2022.
// By Saurabh Chapagain
// s205@umbc.edu
import java.util.Scanner;

public class StudentInformation {
   private String firstName;
   private String lastName;
   private String courseName;
   private double totalBalance;
   private static String studentID;
   private String studentEmail;
   private String gradeYear;
   private int courseCost = 1104;

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
   }


   public void enroll() {
       do {
           Scanner in = new Scanner(System.in);

           System.out.println("Please Enter Which class you want to register for: (Q to quit)");
           String courseName = in.nextLine();

           if (!courseName.equals("q")) {
               courseName = courseName + "\n" + courseName;
               totalBalance = totalBalance + courseCost;
           }
           else { break; }
       } while (true);

      /*TODO: BUG FIX
         courseName is not printing to console
       */
       System.out.println("ENROLLED IN: " + courseName);
       System.out.println("TUITION BALANCE: " + totalBalance);
   }
}

