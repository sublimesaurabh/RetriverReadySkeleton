// Made: April 6, 2022.
// By Saurabh Chapagain
// s205@umbc.edu

import java.util.Scanner;

public class StudentInformation {
    protected static String[] courseNamesList = new String[9];
    private static String firstName;
    private static String lastName;
    private static String courseEnrolledName;
    private static String studentID;
    private static String studentEmail;
    private static int gradeYear;
    static double courseCost = 1104.00;
    static double courseCostFullTime = 4439.00;
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
        JavaMail jm = new JavaMail();
        jm.emailValidation();

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

    public void setFullTimeCost(double fullTimeCost) {
        this.fullTimeCost = fullTimeCost;
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

//        public void enroll () {
////            do {
////                Scanner in = new Scanner(System.in);
////                System.out.print("Please Enter Which class you want to register for: (q to quit)");
////                String courseName = in.nextLine();
////                //limitCourses();
////                if (!courseName.equals("q")) {
////                    numberOfCourses++;
////                    courseEnrolledName = courseEnrolledName + "\n" + courseName;
////                    totalBalance = totalBalance + courseCost;
////                } else {
////                    break;
////                }
////            } while (numberOfCourses <= courseNumberLimit);
//        /*    TODO: Limit students to enroll in 7 courses, if they try to enroll in more than 7 courses, they will be prompted to get advisor approval
//               Also, let user remove course from their list of courses
//         */
//            while (numberOfCourses <= courseNumberLimit) {
//                Scanner in = new Scanner(System.in);
//                System.out.print("Please Enter Which class you want to register for: (q to quit)");
//                String courseName = in.nextLine();
//                if (!courseName.equals("q")) {
//                    numberOfCourses++;
//                    courseEnrolledName = courseEnrolledName + "\n" + courseName;
//                    totalBalance = totalBalance + courseCost;
//                    courseNamesList[numberOfCourses] = courseName;
//                } else {
//                    break;
//                }
//            }
//        }



//        public void limitCourses() {
//            if (numberOfCourses <= courseNumberLimit) {
//                System.out.println("You have reached the limit of courses you can enroll in.");
//                System.out.println("-------------------------------------------------------");
//                System.out.println("You can only enroll in 7 courses, Please type 'q' to quit");
//            }
//        }

//        //shows balance
//        public void viewBalance () {
//            System.out.println("Your balance is: $" + totalBalance);
//        }
//
//        //pays student balance
//        public void payBalance () {
//
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter your payment: $");
//            double payment = input.nextDouble();
//
//            if (payment > totalBalance) {
//                System.out.println("The amount you have entered exceeds your balance. Please try again");
//                System.out.println("Enter your payment: $");
//                payment = input.nextDouble();
//                totalBalance = totalBalance - payment;
//                System.out.println("Thank you for your payment of $" + payment);
//            } else if (payment <= totalBalance) {
//                totalBalance = totalBalance - payment;
//                System.out.println("Thank you for your payment of $" + payment);
//            }
//        }

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

        public String getInfo (){
            return "Student Name: " + firstName + " " + lastName + "\n" +
                    "Student ID: " + studentID + "\n" +
                    "Student Email: " + studentEmail + "\n" +
                    "Grade Year: " + gradeYear + "\n" +
                    "Courses Enrolled: " + courseEnrolledName + "\n" +
                    "Total Balance: " + PayBills.totalBalance;
        }


    }


