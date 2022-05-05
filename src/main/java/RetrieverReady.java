// Saurabh Chapagain
// April 7, 2022
// s205@umbc.edu

/**
 * This is RetrieverReady class/ Main Class
 *
 * we make objects of the other classes and call the methods
 *
 * @author Saurabh Chapagain
 * @version 1.0
 * @see StudentInformation
 * @see JavaMail
 * @see StudentEnroller
 * @see PayBills
 *
 *
 */
public class RetrieverReady {
    public static void main(String[] args) {
        StudentInformation student = new StudentInformation();
        student.Student();
        StudentEnroller se = new StudentEnroller();
        se.enroll();
        student.getCourseNamesList();
        PayBills pb = new PayBills();
        pb.viewBalance();
        pb.payBalance();
        student.userYear(student.getGradeYear());
        student.showInfo();
        JavaMail.wantEmail();
    }
}

