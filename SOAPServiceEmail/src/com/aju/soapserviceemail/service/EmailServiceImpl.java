package com.aju.soapserviceemail.service;

import javax.jws.WebService;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;

import com.aju.soapserviceemail.bean.EmailData;
import com.aju.soapserviceemail.bean.EmailStatus;
import com.aju.soapserviceemail.util.SendEmail;

@WebService(endpointInterface = "com.aju.soapserviceemail.service") 
public class EmailServiceImpl implements EmailService {
	private static final Logger logger = Logger.getLogger(EmailServiceImpl.class.getClass());

	@Override
	public EmailStatus getEmailOperation(EmailData emailData) {
		
		SendEmail sendEmail = new SendEmail();
		EmailStatus emailStatus = new EmailStatus();
		try {
			String str = sendEmail.sendEmail(emailData);
			emailStatus.setStatus(str);
			logger.error(str);
			
		} catch (Exception e) {
			logger.error("getEmailOperation() in EmailServiceImpl", e);
		}
		return emailStatus;
	}

}
