package com.aju.soapserviceemail.service;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.aju.soapserviceemail.bean.EmailData;
import com.aju.soapserviceemail.bean.EmailStatus;

@WebService
@SOAPBinding(style = Style.RPC)

public interface EmailService {
	
	@WebMethod
	EmailStatus getEmailOperation(@WebParam(name = "EmailService") EmailData emailData);

}
