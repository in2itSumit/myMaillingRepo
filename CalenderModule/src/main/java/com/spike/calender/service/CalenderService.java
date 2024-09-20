package com.spike.calender.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spike.calender.dto.CalenderEventDto;
import com.spike.calender.dto.CalenderEventUpdateDto;
import com.spike.calender.dto.CalenderResponseDto;

@Service
public interface CalenderService {
	public String saveCalenderEvent(CalenderEventDto calenderDto);
	public List<CalenderResponseDto>  getCalenderEventByDate(String date);
	public List<CalenderResponseDto>  getCalenderEventByWeek();
	public List<CalenderResponseDto> getCalenderEventByMonth(int year, int month);
	public String deleteCalenderEventByEventId(long eventId, String updatedBy);
	public String updateCalenderEventByEventId(CalenderEventUpdateDto updateDto);
	
}
