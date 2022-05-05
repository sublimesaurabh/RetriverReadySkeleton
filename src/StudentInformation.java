// Made: April 6, 2022.
// By Saurabh Chapagain
// s205@umbc.edu

import java.util.Scanner;

/**
 * This is StudentEnroller class that enrolls students into courses.
 *
 * It is the child class of StudentInformation
 *
 * @author Saurabh Chapagain
 * @version 1.0
 * @see PayBills StudentEnroller JavaMails
 *
 *
 */

public class StudentInformation {
    protected static String[] courseNamesList = new String[6];
    private static String firstName;
    private static String lastName;
    static String courseEnrolledName;
    private static String studentID;
    private static String studentEmail;
    private static int gradeYear;
    static double courseCost = 1104.00;
    static double courseCostFullTime = 4439.00;
    final private int FULL_TIME_COST = 6309;

   /*TODO: 4/7/22
    Course Cost needs to be expanded upon
     - Full time and Part time students are charged different
     - Limit students to only enroll in 7 courses, if they try to enroll more
     they need permission from advisor
     - In State students are charged differently, than out-of-state students
    */

    /**
     * This is the constructor of the class StudentInformation
     *
     * @param firstName
     * @param lastName
     * @param studentID
     * @param studentEmail
     * @param gradeYear
     * @param courseEnrolledName
     */
    public StudentInformation(String firstName, String lastName, String studentID, String studentEmail, int gradeYear, String courseEnrolledName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.studentEmail = studentEmail;
        this.gradeYear = gradeYear;
        this.courseEnrolledName = courseEnrolledName;
    }
    /**
     * This is the default constructor of the class StudentInformation
     *
     */
    public StudentInformation(){
       // default constructor
    }

    public StudentInformation(String firstName, String lastName, String studentID, String studentEmail, int gradeYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.studentEmail = studentEmail;
        this.gradeYear = gradeYear;
    }

    public void Student() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        this.firstName = userInput.nextLine();

        System.out.println("Please enter your last name: ");
        this.lastName = userInput.nextLine();

        System.out.println("Hello, " + this.firstName + " " + this.lastName);

        System.out.println("Please enter your UMBC email: ");
        this.studentEmail = userInput.nextLine();
        JavaMail jm = new JavaMail();
        jm.emailValidation(this.studentEmail);

        System.out.println("What grade year are you? (Press 1 for Freshman, 2 for Sophomore, 3 for Junior, 4 for Senior");
        this.gradeYear = userInput.nextInt();


//      Consuming the leftover new line
        userInput.nextLine();

        System.out.println("Please enter your student ID");
        this.studentID = userInput.nextLine();
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public void setCourseCost(double courseCost) {
        this.courseCost = courseCost;
    }

    public void setCourseCostFullTime(double courseCostFullTime) {
        this.courseCostFullTime = courseCostFullTime;
    }

    public String[] getCourseNamesList() {
        return courseNamesList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public static String getStudentEmail() {
        return studentEmail;
    }

    public int getGradeYear() {
        return gradeYear;
    }


    public static void userYear(int gradeYear) {
        switch (gradeYear) {
            case 1:
                System.out.println("You are a Freshman");
                break;
            case 2:
                System.out.println("You are a Sophomore");
                break;
            case 3:
                System.out.println("You are a Junior");
                break;
            case 4:
                System.out.println("You are a Senior");
                break;
            default:
                System.out.println("Number is invalid, please try again");
                break;
        }
    }

    //prints relevant inputs to console at the end of the program
        public static void showInfo () {
            System.out.println("Today is " + java.time.LocalDate.now());
            System.out.println("Student Name: " + firstName + " " + lastName);
            System.out.println("Student ID: " + studentID);
            System.out.println("Student Email: " + studentEmail);
            System.out.println("Grade Year: " + gradeYear);
            System.out.println("Courses Enrolled: " + courseEnrolledName);
            System.out.println("Total Balance: " + PayBills.totalBalance);
        }

        //returns info
        public String getInfo (){
            return "Student Name: " + firstName + " " + lastName + "\n" +
                    "Student ID: " + studentID + "\n" +
                    "Student Email: " + studentEmail + "\n" +
                    "Grade Year: " + gradeYear + "\n" +
                    "Courses Enrolled: " + courseEnrolledName + "\n" +
                    "Total Balance: " + PayBills.totalBalance;
        }


    }


