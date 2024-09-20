package com.mail.JavaMail.entity;


import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MailBox {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String ccUserId;
	private String toUserId;
	private String fromUserId;
	
	@ManyToOne
	@JoinColumn(name = "EmailHistory_id")
	private EmailHistory emailHistory;

}
