package com.eficens.email.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eficens.email.app.modal.EmailTemplate;
import com.eficens.email.app.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
	@Autowired
	EmailService emailService;
	
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestBody EmailTemplate emailTemplate) {
		return emailService.sendEmail(emailTemplate);
	}
	@PostMapping("/sendEmailWithAttachment")
	public String sendEmailWithAttachment(@RequestBody EmailTemplate emailTemplate) {
		return emailService.sendMailWithAttachment(emailTemplate);
	}	

}
