// Saurabh Chapagain
// April 7, 2022
// s205@umbc.edu


public class RetrieverReady {
    public static void main(String[] args) {
        StudentInformation student = new StudentInformation();
        student.Student();
        student.enroll();
        student.viewBalance();
        student.payBalance();
        student.userYear(student.getGradeYear());
        student.showInfo();
        JavaMail.wantEmail();
    }
}

