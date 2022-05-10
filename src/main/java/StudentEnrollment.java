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
 * @see StudentInformation PaysBills
 *
 *
 */
public class StudentEnrollment extends StudentInformation {

    int numberOfCourses = 1;
    final int COURSE_NUMBER_LIMIT = 7;
    //public String courseEnrolledName;

    public void setCourseEnrolledName(String courseEnrolledName) {
        this.courseEnrolledName = courseEnrolledName;
    }

    public String getCourseEnrolledName() {
        return courseEnrolledName;
    }

    public void setCourseNamesList(String[] courseNamesList) {
        this.courseNamesList = courseNamesList;
    }

    public void enroll() {
        /*    TODO: Limit students to enroll in 7 courses, if they try to enroll in more than 7 courses, they will be prompted to get advisor approval
               Also, let user remove course from their list of courses
         */
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
        //TODO: Implement this.
//        System.out.println("You have registered for the following classes: " + courseEnrolledName);
//        System.out.println("Do you want to remove any class? (y/n)");
//        Scanner in = new Scanner(System.in);
//        String remove = in.nextLine();
//        if (remove.equals("y")) {
//            removeCourse();
//        }
    }
     //TODO: Implement this method
    // TODO: Make this method work
    public void removeCourse() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Which class you want to remove: ");
        String courseName = in.nextLine();
        if (courseName.equals(courseEnrolledName)) {
            Finance.totalBalance = Finance.totalBalance - courseCost;
            courseEnrolledName = courseEnrolledName.replace(courseName,  null);
            numberOfCourses--;
        }
    }
}
