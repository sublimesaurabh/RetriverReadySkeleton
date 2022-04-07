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

       //System.out.println("Please Enter Which class you want to register for: (for example IS147)");
       //String userClass = userInput.nextLine();

       //System.out.println("Alright, " + firstName + "you want to register for " + userClass);
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

