// Made: May 3, 2022.
// By Saurabh Chapagain
// s205@umbc.edu


import java.util.Scanner;

//child class
public class StudentEnroller extends StudentInformation {

    int numberOfCourses = 1;
    int courseNumberLimit = 7;
    static String courseEnrolledName;

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
        while (numberOfCourses <= courseNumberLimit) {
            Scanner in = new Scanner(System.in);
            System.out.print("Please Enter Which class you want to register for: (q to quit)");
            String courseName = in.nextLine();
            if (!courseName.equals("q")) {
                numberOfCourses++;
                courseEnrolledName = courseEnrolledName + "\n" + courseName;
                PayBills.totalBalance = PayBills.totalBalance + courseCost;
                courseNamesList[numberOfCourses] = courseName;
            } else {
                break;
            }
        }
    }

    //TODO: Implement this method
    public void removeCourse() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Which class you want to remove: ");
        String courseName = in.nextLine();
        if (courseName.equals(courseNamesList[numberOfCourses])) {
            PayBills.totalBalance = PayBills.totalBalance - courseCost;
            numberOfCourses--;
        }
    }
}
