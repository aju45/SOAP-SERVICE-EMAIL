package com.aju.soapserviceemail.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import com.aju.soapserviceemail.bean.EmailData;
import com.aju.soapserviceemail.service.EmailServiceImpl;



public class SendEmail {
	private static final Logger logger = Logger.getLogger(EmailServiceImpl.class.getClass());
	public String sendEmail(EmailData emailData) throws Exception {
	logger.info("inside sendEmail() in SendEmail"); 
		Properties props = new Properties();
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.socketFactory.port", "465");
	props.put("mail.smtp.socketFactory.class",
			"javax.net.ssl.SSLSocketFactory");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.port", "465");
	

	Session session = Session.getDefaultInstance(props,
		new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication(emailData.getFromAddress(),"/* your password of gmail */");
			}
		});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(emailData.getFromAddress()));
		message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(emailData.getToAddress()));
		message.setSubject(emailData.getSubjectOfMail());
		message.setText(emailData.getBodyOfMail());

		Transport.send(message);
		
		return "sucess";

	} catch (MessagingException e) {
		logger.error("Exception in  sendEmail() in SendEmail" , e);
		
		return "error";
		
	}
	}

}
