// By Saurabh Chapagain
// s205@umbc.edu

import java.util.Scanner;

/**
 * This is StudentInformation class that collects student information
 *
 * It is the parent class of StudentEnroller anmd PaysBills classes
 *
 * @author Saurabh Chapagain
 * @version 1.0
 * @see Finance StudentEnroller JavaMails
 *
 *
 */

public class StudentInformation {
    protected static String[] courseNamesList = new String[6];
    private static String firstName;
    private static String lastName;
    public static String courseEnrolledName = "";
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
        super();
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

    /**
     * This is a parameterized constructor of theStudentInformation class
     * @param firstName
     * @param lastName
     * @param studentID
     * @param studentEmail
     * @param gradeYear
     */
    public StudentInformation(String firstName, String lastName, String studentID, String studentEmail, int gradeYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.studentEmail = studentEmail;
        this.gradeYear = gradeYear;
    }

    /**
     * This method is used to collect information about the student
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
        JavaMail jm = new JavaMail();
        jm.emailValidation(this.studentEmail);

        System.out.println("What grade year are you? (Press 1 for Freshman, 2 for Sophomore, 3 for Junior, 4 for Senior");
        this.gradeYear = userInput.nextInt();

//      Consuming the leftover new line
        userInput.nextLine();

        System.out.println("Please enter your student ID");
        this.studentID = userInput.nextLine();
    }
    /**
     * This method returns information about the student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * This method returns information about the student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * This method returns information about the student
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    /**
     * This method returns information about the student
     */
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    /**
     * This method returns information about the student
     */
    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }
    /**
     * This method returns information about the student
     */
    public void setCourseCost(double courseCost) {
        this.courseCost = courseCost;
    }
    /**
     * This method returns information about the student
     */
    public void setCourseCostFullTime(double courseCostFullTime) {
        this.courseCostFullTime = courseCostFullTime;
    }
    /**
     * This method returns information about the student
     */
    public String[] getCourseNamesList() {
        return courseNamesList;
    }
    /**
     * This method returns first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * This method returns user's last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * This method returns student ID
     */
    public String getStudentID() {
        return studentID;
    }
    /**
     * This method returns student's email
     */
    public static String getStudentEmail() {
        return studentEmail;
    }
    /**
     * This method returns student's grade year
     */
    public int getGradeYear() {
        return gradeYear;
    }

    /**
     * This method is used to classify the student into a specific grade level
     * @param gradeYear
     */
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

    /**
     * This method shows the student's information
     */
    protected static void showInfo () {
            System.out.println("Today is " + java.time.LocalDate.now());
            System.out.println("Student Name: " + firstName + " " + lastName);
            System.out.println("Student ID: " + studentID);
            System.out.println("Student Email: " + studentEmail);
            System.out.println("Grade Year: " + gradeYear);
            System.out.println("Courses Enrolled: " + courseEnrolledName);
            System.out.println("Total Balance: " + Finance.totalBalance);
        }

    /**
     * This method returns information about the student
     */
    protected String getInfo(){
            return "Student Name: " + firstName + " " + lastName + "\n" +
                    "Student ID: " + studentID + "\n" +
                    "Student Email: " + studentEmail + "\n" +
                    "Grade Year: " + getGradeYear() + "\n" +
                    "Courses Enrolled: " + "\n" + courseEnrolledName + "\n" +
                    "Total Balance: " + Finance.totalBalance;
        }
    }


