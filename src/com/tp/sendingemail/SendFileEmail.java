//package com.tp.sendingemail;
//
//import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.activation.*;
//
//public class SendFileEmail {
//
//	public static void main(String[] args) {
//		
//		String to = "abcd@gmail.com";
//		String from = "web@gmail.com";
//		String host = "localhost";
//		Properties properties = System.getProperties();
//		
//		// properties.setProperty("mail.user", "myuser");
//		// properties.setProperty("mail.password", "mypwd");
//		
//		properties.setProperty("mail.smtp.host", host);
//		
//		Session session = Session.getDefaultInstance(properties);
//		
//		try {
//			MimeMessage message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(from));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			message.setSubject("This is the Subject Line!");
//			
//			BodyPart messageBodyPart = new MimeBodyPart();
//			messageBodyPart.setText("This is message body.");
//			
//			Multipart multipart = new MimeMultipart();
//			
//			multipart.addBodyPart(messageBodyPart);
//			
//			// Attachment part
//			messageBodyPart = new MimeBodyPart();
//			String filename = "file.txt";
//			DataSource source = new FileDataSource(filename);
//			messageBodyPart.setDataHandler(new DataHandler(source));
//			messageBodyPart.setFileName(filename);
//			multipart.addBodyPart(messageBodyPart);
//			
//			message.setContent(multipart);
//			
//			// Send message
//			Transport.send(message);
//			System.out.println("Sent message successfully...");
//		} catch (MessagingException mex) {
//			mex.printStackTrace();
//		}
//		
//	}
//}
