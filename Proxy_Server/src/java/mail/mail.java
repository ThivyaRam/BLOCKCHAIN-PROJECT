package mail;

import java.util.Properties;
import javax.activation.CommandMap;
import javax.activation.MailcapCommandMap;
import javax.mail.*;
import javax.mail.internet.*;

public class mail {

    public void sendFromGMail(String from, String pass, String to, String subject, String messageContent) {   
        final String username = from;
        final String password = pass;

        // Set up email properties
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.starttls.enable", "true");

        // Create session with authentication
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

try {
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress(username));
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
    message.setSubject(subject);
    message.setContent(messageContent, "text/html");

    // Define MIME types
    MailcapCommandMap mc = (MailcapCommandMap) CommandMap.getDefaultCommandMap();
    mc.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
    mc.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
    mc.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
    mc.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
    mc.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
    CommandMap.setDefaultCommandMap(mc);

    System.out.println("Attempting to send email...");
    Transport.send(message);
    System.out.println("Email sent successfully.");

} catch (MessagingException e) {
    e.printStackTrace();
    System.out.println("Failed to send email.");
}
    }
}
