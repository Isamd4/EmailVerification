import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.Authenticator;
import java.util.*;
public class Test {

    public static void main(String[] args) {
        int length = 4;
        CreateRandom rand=new CreateRandom(4);
        String rands=rand.getRand();
        final String username = "myemail";
        final String password = "mypassword";
      /**  //Get the session object  
      Properties properties = System.getProperties();  
      properties.setProperty("mail.smtp.host", host);  
      Session session = Session.getDefaultInstance(properties);  **///for default email
        Properties mailprop = new Properties();
        mailprop.put("mail.smtp.host", "smtp.gmail.com");
        mailprop.put("mail.smtp.port", "587");
        mailprop.put("mail.smtp.auth", "true");
        mailprop.put("mail.smtp.starttls.enable", "true"); //TLS
        //Sending with a specific email....its bn used by mail API's
        Session session = Session.getInstance(mailprop,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("fromEmail"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("to@yahoo.com")
            );
            message.setSubject("Muhammad Isa ");
            message.setText("your otp "+rands);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
