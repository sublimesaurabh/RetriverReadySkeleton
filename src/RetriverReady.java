// Saurabh Chapagain
// April 7, 2022
// s205@umbc.edu

import java.util.Scanner;

public class RetriverReady {
    public static void main(String[] args) {
        StudentInformation student = new StudentInformation();
        student.Student();
        student.enroll();
        student.viewBalance();
        student.payBalance();
        student.userYear();
        student.showInfo();
        //JavaMail.sendEmail(student.getEmail(), student.getName(), student.getBalance());
        JavaMail.send("sendersemail@gmail.com","password","recipients@gmail.com", "Retriever Ready: Here is your requested information", "Thank you for using Retriever Ready!");

    }
}

