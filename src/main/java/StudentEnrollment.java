// Made: May 3, 2022.
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
 * @see StudentInformation
 *
 *
 */
public class StudentEnrollment extends StudentInformation {

    int numberOfCourses = 1;
    final int COURSE_NUMBER_LIMIT = 7;
    String [] options = {"Yes", "No"};


//    /**
//     * This method displays the list of courses that the student has enrolled in.
//     * @return courseEnrolledName
//     */
//    public String getCourseEnrolledName() {
//        return courseEnrolledName;
//    }

    /**
     * This method enrolls students into courses.
     *
     */
    public void enroll() {
        System.out.println("Hello " + super.getStudentName() + " Get ready to enroll in courses!");
        System.out.println("YOU CAN ONLY REGISTER FOR 7 CLASSES MAXIMUM");
        while (numberOfCourses <= COURSE_NUMBER_LIMIT) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please Enter Which class you want to register for: (q to quit)");
            String courseName = in.nextLine();
            if (!courseName.equals("q")) {
                numberOfCourses++;
                courseEnrolledName = courseEnrolledName + "\n" + courseName;
                Finance.totalBalance = Finance.totalBalance + courseCost;
            } else {
                break;
            }
        }
        removeCourse();
    }

    /**
     * This method removes the courses that the student has enrolled in.
     */
    public void removeCourse() {
        Scanner in = new Scanner(System.in);
        System.out.println("You have registered for the following classes: " + courseEnrolledName);
        System.out.println("Do you want to remove any class? (y/n)");
        String remove = in.nextLine();
        if (remove.equals("y") || remove.equals("Y")) {
            System.out.print("Please Enter Which class you want to remove: ");
            String courseName = in.nextLine();
           if (courseEnrolledName.contains(courseName)) {
                numberOfCourses--;
                courseEnrolledName = courseEnrolledName.replace(courseName, "");
                Finance.totalBalance = Finance.totalBalance - courseCost;
            }
        } else if (remove.equals("n") || remove.equals("N")) {
            System.out.println("You have registered for the following classes: " + courseEnrolledName);
        }
    }
    /**
     * This method is a cheeky way of me using a string array to meet project requirements.
     */
    public void userFeedback() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you like UMBC?");
        System.out.println(options[0] + " or " + options[1]);
        System.out.println("Enter your Answer: ");
        String answer = in.nextLine();
        System.out.println("Thank you for your feedback!");
    }
}
