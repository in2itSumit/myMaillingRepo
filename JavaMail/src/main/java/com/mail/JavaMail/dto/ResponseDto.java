package com.mail.JavaMail.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ResponseDto 
{

	private long id;
    private String from;
    private String to;
    private String subject;
    private String message;

    private LocalDateTime createdAt;
    private boolean deletedFromSender;
    private boolean deletedFromReciever;
    
    private List<String> attachmentNames;
    private List<String> attachmentPaths;
}
