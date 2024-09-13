package com.java.jms.entity;

import java.util.List;
import java.util.UUID;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.mongodb.core.mapping.Document;

import com.java.jms.auditable.MailAuditable;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "MailEntity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailEntity extends MailAuditable{
	@Id
	private UUID id;
	@NotEmpty
	private String senderMail;
	@NotEmpty
	private List<String> receiverMail;
	@NotEmpty
	private String subject;
	@NotEmpty
	private String content;
	private List<String> attachmentsName;
	private List<String> attachmentsPath;
}
