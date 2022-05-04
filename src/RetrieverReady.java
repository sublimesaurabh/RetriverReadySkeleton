// Saurabh Chapagain
// April 7, 2022
// s205@umbc.edu


public class RetrieverReady {
    public static void main(String[] args) {
        StudentInformation student = new StudentInformation();
        student.Student();
        StudentEnroller se = new StudentEnroller();
        se.enroll();
        PayBills pb = new PayBills();
        pb.viewBalance();
        pb.payBalance();
        student.userYear(student.getGradeYear());
        student.showInfo();
        JavaMail.wantEmail();
    }
}

