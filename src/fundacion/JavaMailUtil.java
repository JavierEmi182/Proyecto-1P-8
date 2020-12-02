/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;


import java.io.IOException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/**
 *
 * @author Javier
 */
public class JavaMailUtil {
    
 
    public static void SendMail(String receptor, String cuerpo) throws IOException {
        
        final String from = "amigoscuatropatasg8@gmail.com"; // from address. As this is using Gmail SMTP.
        final String password = "proyectoparcial"; // password for from mail address. 
 
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
 
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
           });
 
        try {
 
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receptor));
            message.setSubject("Saludos desde Fundacion Amigos de Cuatro Patas");    
    
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(cuerpo, "text/html");
     
            Multipart multipart = new MimeMultipart();
            
            multipart.addBodyPart(mimeBodyPart);
    
            MimeBodyPart despedida =new MimeBodyPart();
            despedida.setContent("Gracias por su atencion, <b> Fundacion Amigo de Cuatro Patas</b>", "text/html");
            multipart.addBodyPart(despedida);
            message.setContent(multipart);
 
            Transport.send(message);
 
            System.out.println("Mail successfully sent..");
 
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
