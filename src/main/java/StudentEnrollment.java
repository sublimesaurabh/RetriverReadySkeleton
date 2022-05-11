// Made: May 3, 2022.
// By Saurabh Chapagain
// s205@umbc.edu


import java.util.Scanner;

/**
 * This is StudentEnroller class that enrolls students into courses.
 *
 * It is the child class of StudentInformation
 * @date May 3, 2022
 * @author Saurabh Chapagain
 * @version 1.0
 * @see StudentInformation
 *
 *
 */
public class StudentEnrollment extends StudentInformation {

    int numberOfCourses = 1;
    final int COURSE_NUMBER_LIMIT = 7;

    /**
     * This is the constructor of StudentEnrollment class.
     * @param courseEnrolledName
     */
    public void setCourseEnrolledName(String courseEnrolledName) {
        this.courseEnrolledName = courseEnrolledName;
    }

    /**
     * This method displays the list of courses that the student has enrolled in.
     * @return courseEnrolledName
     */
    public String getCourseEnrolledName() {
        return courseEnrolledName;
    }

    /**
     * This method displays the list of courses that the student has enrolled in.
     * @param courseNamesList
     */
    public void setCourseNamesList(String[] courseNamesList) {
        this.courseNamesList = courseNamesList;
    }

    /**
     * This method enrolls students into courses.
     *
     */
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
//
        removeCourse();
    }
     //TODO: Implement this method
    // TODO: Make this method work
    public void removeCourse() {
        Scanner in = new Scanner(System.in);
        System.out.println("You have registered for the following classes: " + courseEnrolledName);
        System.out.println("Do you want to remove any class? (y/n)");
        String remove = in.nextLine();
        System.out.print("Please Enter Which class you want to remove: ");
        String courseName = in.nextLine();
        if (courseName.equals(courseEnrolledName)) {
            courseEnrolledName = "";
            numberOfCourses--;
            courseEnrolledName = courseEnrolledName.replace(courseName,  null);
            Finance.totalBalance = Finance.totalBalance - courseCost;
        }
    }
}
