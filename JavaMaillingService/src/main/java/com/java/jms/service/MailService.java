package com.java.jms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.jms.dto.MailDto;
import com.java.jms.entity.MailEntity;

import jakarta.mail.Multipart;

@Service
public interface MailService {
	public MailDto saveMailToDataBase(MailDto mailDto, List<Multipart> attachments);
	public List<MailDto> getAllMailsFromDataBase();
	public List<MailDto> getAllSentMailsFromDataBaseOfASenderBySenderId(long senderId);
	public boolean isSenderExists(long senderId);
	public boolean deleteMailFromDataBase(String mailId);
}
