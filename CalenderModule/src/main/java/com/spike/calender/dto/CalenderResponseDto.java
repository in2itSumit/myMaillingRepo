package com.spike.calender.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalenderResponseDto {

	private long calenderId;

	private String eventName;

	private String color;

	private LocalDate startingDate;

	private LocalDate endingDate;

	private LocalTime startingTime;

	private LocalTime endingTime;

	private List<String> sharedBy;

	private String description;
	
	private LocalDateTime updatedAt;
	private LocalDateTime createdAt;
	private String createdBy;
	private String updatedBy;
}
