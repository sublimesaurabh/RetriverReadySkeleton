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


    public static void sendEmail() {
            //Get properties object
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");

            String to = StudentInformation.getStudentEmail();
            final String from = "retrieverready@gmail.com";
            password();

            //get Session
            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(from, password());
                        }
                    });

            //construct message
            try {
                MimeMessage message = new MimeMessage(session);
                message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                message.setSubject("Your Enrollment Information");
                message.setText(StudentInformation.showInfo());
                //send message
                Transport.send(message);
                System.out.println("message sent successfully");
            } catch (MessagingException e) {
                throw new RuntimeException(e);}
        }

        @Contract(pure = true)
        protected static @NotNull String password(){
        return "#'retriever.xready#";
        }

        }








