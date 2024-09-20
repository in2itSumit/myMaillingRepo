package com.spike.calender.dto;

import java.util.Optional;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalenderEventUpdateDto {

	private long eventId;
	private Optional<String> eventName;
	private Optional<String> color;
	private Optional<String> description;
	private Optional<String> updatedBy;
}
