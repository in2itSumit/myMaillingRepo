package com.spike.calender.service;


import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spike.calender.dto.CalenderEventDto;
import com.spike.calender.dto.CalenderEventUpdateDto;
import com.spike.calender.dto.CalenderResponseDto;
import com.spike.calender.entity.CalenderEntity;
import com.spike.calender.repository.CalenderRepository;

@Component
public class CalenderServiceImpl implements CalenderService
{
	@Autowired
	private CalenderRepository calRepository;
	@Autowired
	private ModelMapper modelMpper;
	
	public String saveCalenderEvent(CalenderEventDto calenderDto)
	{
		CalenderEntity calenderEntity = new CalenderEntity();
		calenderEntity.setColor(calenderDto.getColor());
		calenderEntity.setDescription(calenderDto.getDescription());
		calenderEntity.setEndingDate(LocalDate.parse(calenderDto.getEndingDate()));
		calenderEntity.setStartingDate(LocalDate.parse(calenderDto.getStartingDate()));
		calenderEntity.setEndingTime(LocalTime.parse(calenderDto.getEndingTime()));
		calenderEntity.setStartingTime(LocalTime.parse(calenderDto.getStartingTime()));
		calenderEntity.setEventName(calenderDto.getEventName());
		calenderEntity.setSharedBy(calenderDto.getSharedBy());
		
		try 
		{
			calRepository.save(calenderEntity);
		}
		catch(Exception ex)
		{
			return "unsuccess";
		}
		return "success";
	}
	public List<CalenderResponseDto>  getCalenderEventByDate(String date)
	{
		LocalDate dateObj = LocalDate.parse(date);
		List<CalenderEntity> entityList = calRepository.findByDate(dateObj);
		
		List<CalenderResponseDto> response = new ArrayList<>();
		
		for(CalenderEntity entity : entityList)
		{
			response.add(modelMpper.map(entity, CalenderResponseDto.class));
		}
		
		return response;
	}
	public List<CalenderResponseDto>  getCalenderEventByWeek()
	{
		LocalDate today = LocalDate.now();
	    LocalDate monday = today.with(previousOrSame(MONDAY));
	    LocalDate sunday = today.with(nextOrSame(SUNDAY));
		List<CalenderEntity> entityList = calRepository.findByWeek(monday, sunday);

		List<CalenderResponseDto> response = new ArrayList<>();
		
		for(CalenderEntity entity : entityList)
		{
			response.add(modelMpper.map(entity, CalenderResponseDto.class));
		}
		
		return response;
	}
	public List<CalenderResponseDto> getCalenderEventByMonth(int year, int month)
	{
		
		//get desired year Month object
		YearMonth yearMonth = YearMonth.of( year, month );		
		
		//getting LocalDate object of 1st day of the desired year Month object
		LocalDate firstDayOfMonth = yearMonth.atDay( 1 );
		
		//getting LocalDate object of last day of the desired year Month object
		LocalDate lastDayOfMonth = yearMonth.atEndOfMonth();
		
		List<CalenderEntity> entityList = calRepository.findByMonth(firstDayOfMonth, lastDayOfMonth);

		
		List<CalenderResponseDto> response = new ArrayList<>();
		
		for(CalenderEntity entity : entityList)
		{
			response.add(modelMpper.map(entity, CalenderResponseDto.class));
		}
		
		return response;
	}
	public String deleteCalenderEventByEventId(long eventId, String updatedBy)
	{
		try
		{
			CalenderEntity entity = calRepository.findById(eventId).get();
			entity.setStatus(false);
			entity.setUpdatedAt(LocalDateTime.now());
			entity.setUpdatedBy(updatedBy);
			
			calRepository.save(entity);
		}
		catch (Exception e) 
		{
			
			return "unsuccess";
			
			// TODO: handle exception
		}
		return "success";
	}
	public String updateCalenderEventByEventId(CalenderEventUpdateDto updateDto)
	{
		try
		{
			CalenderEntity entity = calRepository.findById(updateDto.getEventId()).get();
			
			
			entity.setUpdatedAt(LocalDateTime.now());
			if(updateDto.getUpdatedBy().get().isEmpty())
				entity.setUpdatedBy(updateDto.getUpdatedBy().get());
			if(updateDto.getColor().get().isEmpty())
				entity.setColor(updateDto.getColor().get());
			if(updateDto.getDescription().get().isEmpty())
				entity.setDescription(updateDto.getDescription().get());
			if(updateDto.getEventName().get().isEmpty())
				entity.setEventName(updateDto.getEventName().get());
			
			calRepository.save(entity);
		}
		catch (Exception e) 
		{
			
			return "unsuccess";
			
			// TODO: handle exception
		}
		return "success";
	}

}
