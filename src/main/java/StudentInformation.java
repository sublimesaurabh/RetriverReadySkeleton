// By Saurabh Chapagain
// s205@umbc.edu

import java.util.Scanner;

/**
 * This is StudentInformation class that collects student information
 * It is the parent class of StudentEnrollment and Finance classes
 * Commented out code is for Future IS 247 project, which will expand upon this project, by having a database and a UI (javaFX)
 *
 * @author Saurabh Chapagain
 * @version 1.0
 * @see Finance
 * @see StudentEnrollment
 *
 *
 */

public class StudentInformation {
    private static String firstName;
    private static String lastName;
    public static String courseEnrolledName = "";
    private static String studentID;
    private static String studentEmail;
    private static int gradeYear;
    static double courseCost = 1104.00;
    // Commented attributes will be used for IS247 project
    // static double courseCostFullTime = 4439.00;
    // final private int FULL_TIME_COST = 6309;

    /**
     * This is the default constructor of the class StudentInformation
     *
     */
    public StudentInformation(){
       // default constructor
    }

    /**
     * This is a parameterized constructor of theStudentInformation class
     * @param firstName intializes the first name of the student
     * @param lastName intializes the last name of the student
     * @param studentID intializes the student ID of the student
     * @param studentEmail intializes the student email of the student
     * @param gradeYear intializes the grade year of the student
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
        this.firstName = firstName.substring(0, 1).toUpperCase()+ firstName.substring(1);;

        System.out.println("Please enter your last name: ");
        this.lastName = userInput.nextLine();
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);;

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
//    /**
//     * This method sets student first name
//     */
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    /**
//     * This method sets student last name
//     */
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    /**
//     * This method sets student ID
//     */
//    public void setStudentID(String studentID) {
//        this.studentID = studentID;
//    }
    /**
     * This method sets student email
     * @param studentEmail passing value to the student email
     */
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    /**
     * This method sets student grade year
     * @param gradeYear student's grade year
     */
    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }
//    /**
//     * This method sets Course cost
//     * @param courseCost intializes the course cost
//     */
//    public void setCourseCost(double courseCost) {
//        this.courseCost = courseCost;
//    }
//    /**
//     * This method sets Course cost full time
//     * @param courseCostFullTime is the cost of the course for full time, we are setting it
//     */
//    public void setCourseCostFullTime(double courseCostFullTime) {
//        this.courseCostFullTime = courseCostFullTime;
//    }
    /**
     * This method getCourseNamesList
     * @return courseNamesList
     */
//    public String[] getCourseNamesList() {
//        return courseNamesList;
//    }


    /**
     * This method getCourseNamesList
     * @return getStudentName
     *
     */
    public String getStudentName() {
        return firstName + " " + lastName;
    }


//    /**
//     * This method returns student ID
//     * @return studentID
//     */
//    public String getStudentID() {
//        return studentID;
//    }
    /**
     * This method returns student's email
     * @return studentEmail
     */
    public static String getStudentEmail() {
        return studentEmail;
    }
    /**
     * This method returns student's grade year
     * @return gradeYear
     */
    public int getGradeYear() {
        return gradeYear;
    }

    /**
     * This method is used to classify the student into a specific grade level
     * @param gradeYear we pare passing the value of the grade year so we can print out gradeyear from number input to string
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
     * @return info
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


