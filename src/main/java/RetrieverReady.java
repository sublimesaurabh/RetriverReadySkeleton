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
 * @see StudentEnrollment
 * @see Finance
 *
 *
 */
public class RetrieverReady {
    public static void main(String[] args) {
        StudentInformation student = new StudentInformation();
        student.Student();
        StudentEnrollment se = new StudentEnrollment();
        se.enroll();
        Finance pb = new Finance();
        pb.viewBalance();
        pb.payBalance();
        pb.payBalance(pb.totalPayment);
        student.userYear(student.getGradeYear());
        student.showInfo();
        se.userFeedback();
        JavaMail.wantEmail();
    }
}

