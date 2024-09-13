package com.java.jms.auditable;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class MailAuditable {
	 
	@CreatedDate
	 @Column(nullable = false, updatable = false)
	 private LocalDateTime createdAt;
	 
	 @CreatedBy
	 @Column(updatable = false)
	 private String createdBy;
	 
	 @LastModifiedDate
	 private LocalDateTime updatedAt;

	 @LastModifiedBy
	 private String updatedBy;
}
