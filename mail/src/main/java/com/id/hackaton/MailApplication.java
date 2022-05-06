package com.id.hackaton;

import com.sun.nio.sctp.NotificationHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

@SpringBootApplication
public class MailApplication {

	public static void main(String[] args) throws MessagingException {
		SpringApplication.run(MailApplication.class, args);
	}

	public static void sendmail(String receiver, String subject) throws AddressException, MessagingException, IOException {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("JefkeWillems123@gmail.com", "Jefke123!");
			}
		});
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("JefkeWillems123@gmail.com", false));

		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
		msg.setSubject(subject);
		msg.setContent("Child did something", "text/html");
		msg.setSentDate(new Date());

		MimeBodyPart messageBodyPart = new MimeBodyPart();
		switch (subject) {
			case "Food":
				messageBodyPart.setContent("Your child ate, congratulations!", "text/html");
				break;
			case "Nap":
				messageBodyPart.setContent("Your child took a nap, well done!", "text/html");
				break;
			case "Play":
				messageBodyPart.setContent("Your child is playing around, hurray!", "text/html");
				break;
			case "Health":
				messageBodyPart.setContent("Your child is healthy, probably anyway.", "text/html");
				break;
			default:
				System.out.printf("Unknown type \n");
				break;
		}

		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);

		msg.setContent(multipart);
		Transport.send(msg);
	}

	public static void sendmailNap(String receiver, String startTime, String endTime) throws AddressException, MessagingException, IOException {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		System.out.printf("Entered email code");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("JefkeWillems123@gmail.com", "Jefke123!");
			}
		});
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("JefkeWillems123@gmail.com", false));

		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
		msg.setSubject("Naptime");
		msg.setContent("Child did something", "text/html");
		msg.setSentDate(new Date());

		MimeBodyPart messageBodyPart = new MimeBodyPart();

		messageBodyPart.setContent("Your child slept from " + startTime + " till " + endTime + ".", "text/html");

		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);

		msg.setContent(multipart);
		Transport.send(msg);
	}
}
