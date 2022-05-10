//Saurabh Chapagain
//Date: April, 26 2022.
//Description: This is a java program that sends an email to the user.
//DO NOT MODIFY THIS FILE


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * This is java mail class that sends an email to the user
 *
 * Maven POM.xml file is used for dependency management.
 * We use JavaMail API to send the email.
 * We also use activation jar for activation of the email.
 *
 * @author Saurabh Chapagain
 * @version 1.0
 * @see <a href="https://www.javatpoint.com/java-mail">JavaMail</a> , RetrieverReady
 *
 *
 */

public class JavaMail {

    /**
     * This is the email validation method that checks if the email is valid or not
     * I used a regular expression (regex) to check if the email is valid or not
     *
     * @param email
     */

    public void emailValidation(String email){
        //regular expression to check if email is valid
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pattern = Pattern.compile(regex);

        StudentInformation si = new StudentInformation();
        Scanner newEmail = new Scanner(System.in);

        if(!si.getStudentEmail().contains("@") || si.getStudentEmail() == null || si.getStudentEmail().isEmpty()){
            System.out.println("Invalid email address");
            System.out.println("Please enter a valid email address: ");
            si.setStudentEmail(newEmail.nextLine());
        }
        else if(pattern.matcher(si.getStudentEmail()).matches()){
            System.out.println("Valid Email entered!");
        }
        else{
            System.out.println("Invalid Email entered!");
            System.out.println("Please enter a valid email address");
            si.setStudentEmail(newEmail.nextLine());
        }
    }

    /**
     * This method is used to ask if the user wants an email or not
     */

    //method to ask user if they want to email or not
    public static void wantEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to receive an email? (y/n)");
        String answer = scanner.nextLine();
        if(answer.equals("y") || answer.equals("Y")){
            sendEmail();
            System.out.println("Email sent successfully");
        }
        else if (answer.equals("n") || answer.equals("N")){
            System.out.println("You have chosen not to receive an email.");
        } else {
            System.out.println("Invalid input, try again please.");
            wantEmail();
        }
    }

    /**
     * This method is used to send the email to the user using Simple Mail Transfer Protocol
     *
     */

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
                StudentInformation si = new StudentInformation();
                message.setText(si.getInfo());
                //sending message
                Transport.send(message);
               // System.out.println("message sent successfully");
            } catch (MessagingException e) {
                throw new RuntimeException(e);}
        }

   /**
     * This method is used to return the password of the account i am using to send the email
    *
    *
    * @return password
    */
        protected static String password(){
        return "#'retriever.xready#";
        }

        }








