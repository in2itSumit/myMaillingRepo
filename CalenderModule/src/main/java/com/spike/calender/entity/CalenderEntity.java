package com.spike.calender.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalenderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eventId;
	@NotNull
	private String eventName;
	@NotNull
	private String color;
	@NotNull
	private LocalDate startingDate;
	@NotNull
	private LocalDate endingDate;
	@NotNull
	private LocalTime startingTime;
	@NotNull
	private LocalTime endingTime;
	@NotNull
	private List<String> sharedBy;
	@NotNull
	private String description;
	@NotNull
	private LocalDateTime updatedAt;
	@NotNull
	private LocalDateTime createdAt;
	@NotNull
	private String createdBy;
	@NotNull
	private String updatedBy;
	@NotNull
	private boolean status;
}
