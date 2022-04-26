import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Message;
import javax.activation.*;
import javax.mail.internet.MimeMessage;

public class JavaMail extends StudentInformation {

    public static void send(String from,String password,String to,String subject,String msg) {
            //Get properties object
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");
            //get Session
            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(from,password);
                        }
                    });
            //compose message
            try {
                MimeMessage message = new MimeMessage(session);
                message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                message.setSubject("Your Enrollment Information");
                message.setText("Your Enrollment Information is : \nStudent Name: \" + firstName + \" \" + lastName + \"\\n\" +\n" +
                        "                    \"Student ID: \" + studentID + \"\\n\" +\n" +
                        "                    \"Student Email: \" + studentEmail + \"\\n\" +\n" +
                        "                    \"Grade Year: \" + gradeYear + \"\\n\" +\n" +
                        "                    \"Courses Enrolled: \" + courseEnrolledName + \"\\n\" +\n" +
                        "                    \"Total Balance: \" + totalBalance" + msg);
                message.setContent(msg, "text/html");
                msg.toString();
                showInfo();
                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setText(msg);
                //send message
                Transport.send(message);
                System.out.println("message sent successfully");
            } catch (MessagingException e) {throw new RuntimeException(e);}

        }
    }







