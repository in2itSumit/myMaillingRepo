package com.spike.calender.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CalenderEventDto {
	
	
	private String eventName; 
	private String color;
	private String startingDate;
	private String endingDate;
	private String startingTime;
	private String endingTime;
	private List<String> sharedBy;
	private String description;
	private String createdBy;
}
