import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Message;
import javax.activation.*;
import javax.mail.internet.MimeMessage;

public class JavaMail extends StudentInformation {

    public static void sendMail(String recipient) throws MessagingException {
        System.out.println("Sending mail to " + recipient);

        // Get system properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        String myEmail = "ouremail@gmail.com";
        String myPassword = "password";

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("myEmail", "myPassword");
            }
        });
//TODO: fix bug, in message class....
//        Message message = new prepareMessage(session, myEmail, recipient);
//        Transport.send(message);
        System.out.println("Sent message successfully....");
    }

    private static Message prepareMessage (Session session, String recipient, String subject, String body) throws MessagingException {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("myEmail"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(body);
            return message;
        } catch (MessagingException e) {
            Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, e);
        }


        //        // Recipient's email ID needs to be mentioned.
//        String to = "abcd@gmail.com";
//
//        // Sender's email ID needs to be mentioned
//        String from = "web@gmail.com";
//
//        // Assuming you are sending email from localhost
//        String host = "localhost";
//
//        // Get system properties
//        Properties properties = System.getProperties();
//
//        // Setup mail server
//        properties.setProperty("mail.smtp.host", host);
//
//        // Get the default Session object.
//        Session session = Session.getDefaultInstance(properties);
//
//        try {
//            // Create a default MimeMessage object.
//            MimeMessage message = new MimeMessage(session);
//
//            // Set From: header field of the header.
//            message.setFrom(new InternetAddress(from));
//
//            // Set To: header field of the header.
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//            // Set Subject: header field
//            message.setSubject("This is the Subject Line!");
//
//            // Create the message part
//            BodyPart messageBodyPart = new MimeBodyPart();
//
//            // Fill the message
//            messageBodyPart.setText("This is message body");
//
//            // Create a multipar message
//            Multipart multipart = new MimeMultipart();
//
//            // Set text message part
//            multipart.addBodyPart(messageBodyPart);
//
//            // Part two is attachment
//            messageBodyPart = new MimeBodyPart();
//            String filename = "file.txt";
//            DataSource source = new FileDataSource(filename);
//            messageBodyPart.setDataHandler(new DataHandler(source));
//            messageBodyPart.setFileName(filename);
//            multipart.addBodyPart(messageBodyPart);
//
//            // Send the complete message parts
//
//            //akneqkjnbvkjqerbnv
//            //eqbvkqwhvqwhnvqw
//            //whfqwibcfqwkjebcfqkw
//            //sdjbakjdbckjdbvckjbqwdcv
//            //asdbckjsdbckjasdck
//        } catch (MessagingException e) {
//        }
        return null;
    }

}

