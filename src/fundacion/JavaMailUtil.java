/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundacion;


import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Javier
 */
public class JavaMailUtil {
    
    public static void SendMail(String recepient, String cuerpo) throws MessagingException{
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.port","587");
        
        String myAccountEmail= "amigoscuatropatasg8@gmail.com";
        String password= "proyectoparcial";
        
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail,password);
            }
        });
        Message message = prepareMessage(session,myAccountEmail,recepient, cuerpo);
        
        Transport.send(message);
        System.out.println("El mensaje se envio con exito");
    }
    private static Message prepareMessage(Session session,String myAccountEmail, String recepient, String cuerpo){
            Message message = new MimeMessage(session);
            try {
                message.setFrom(new InternetAddress(myAccountEmail));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
                message.setSubject("Saludos desde Fundacion Amigos de Cuatro Patas");
                message.setText(cuerpo);
                return message;
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(JavaMailUtil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            return null;
    }
    
}
