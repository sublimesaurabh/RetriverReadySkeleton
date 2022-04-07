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

   public void Student() {
       Scanner userInput = new Scanner(System.in);
       System.out.println("Please enter your name: ");
       this.firstName = userInput.nextLine();
       System.out.println("Please enter your name: ");
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

