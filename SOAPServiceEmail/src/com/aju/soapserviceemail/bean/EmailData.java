package com.aju.soapserviceemail.bean;

public class EmailData {
	private String bodyOfMail;
	private String subjectOfMail;
	private String toAddress;
	private String fromAddress;
	public String getBodyOfMail() {
		return bodyOfMail;
	}
	public void setBodyOfMail(String bodyOfMail) {
		this.bodyOfMail = bodyOfMail;
	}
	public String getSubjectOfMail() {
		return subjectOfMail;
	}
	public void setSubjectOfMail(String subjectOfMail) {
		this.subjectOfMail = subjectOfMail;
	}
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	

}
