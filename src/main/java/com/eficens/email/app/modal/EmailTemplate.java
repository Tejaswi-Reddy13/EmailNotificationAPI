package com.eficens.email.app.modal;

public class EmailTemplate {
	
private String fromAddress;
private String toAddress;
private String subject;
private String emailBody;
private boolean isAttachmentRequired;
private String filePath;

public String getFilePath() {
	return filePath;
}
public void setFilePath(String filePath) {
	this.filePath = filePath;
}
public String getFromAddress() {
	return fromAddress;
}
public void setFromAddress(String fromAddress) {
	this.fromAddress = fromAddress;
}
public String getToAddress() {
	return toAddress;
}
public void setToAddress(String toAddress) {
	this.toAddress = toAddress;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getEmailBody() {
	return emailBody;
}
public void setEmailBody(String emailBody) {
	this.emailBody = emailBody;
}
public boolean isAttachmentRequired() {
	return isAttachmentRequired;
}
public void setAttachmentRequired(boolean isAttachmentRequired) {
	this.isAttachmentRequired = isAttachmentRequired;
}
}
