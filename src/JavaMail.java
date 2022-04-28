//Saurabh Chapagain
//Date: April, 26 2022.
//Description: This is a java program that sends an email to the user.
//DO NOT MODIFY THIS FILE

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Message;
import javax.activation.*;
import javax.mail.internet.MimeMessage;

public class JavaMail {

    public void emailValidation(){
        StudentInformation si = new StudentInformation();
        if(!si.getStudentEmail().contains("@")){
            Scanner email = new Scanner(System.in);
            System.out.println("Invalid email address");
            System.out.println("Please enter a valid email address");
            StudentInformation sc = new StudentInformation();
            si.setStudentEmail(email.nextLine());
        }
        else{
            System.out.println("Valid Email entered!");
        }
    }

    //method to ask user if they want to email or not
    public static void wantEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to receive an email? (y/n)");
        String answer = scanner.nextLine();
        if(answer.equals("y")){
            sendEmail();
            System.out.println("Email sent successfully");
        }
        else{
            System.out.println("You have chosen not to receive an email.");
        }
    }

    //method to send email
    public static void sendEmail() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        //gets student email
        String to = StudentInformation.getStudentEmail();
        final String from = "retrieverready@gmail.com";
        password();

        Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(from, password());
                        }
                    });

            //constructing message to send to user
            try {
                MimeMessage message = new MimeMessage(session);
                message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                message.setSubject("Your Enrollment Information");
                message.setText(StudentInformation.showInfo());
                //sending message
                Transport.send(message);
                System.out.println("message sent successfully");
            } catch (MessagingException e) {
                throw new RuntimeException(e);}
        }

        //password for email, protected so that it cannot be used by other classes
        @Contract(pure = true)
        protected static @NotNull String password(){
        return "#'retriever.xready#";
        }

        }








