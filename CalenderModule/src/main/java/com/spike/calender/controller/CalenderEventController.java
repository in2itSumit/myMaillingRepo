package com.spike.calender.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spike.calender.dto.CalenderEventDto;
import com.spike.calender.dto.CalenderEventUpdateDto;
import com.spike.calender.dto.CalenderResponseDto;
import com.spike.calender.service.CalenderService;

@RestController
@RequestMapping("spike/calender")
public class CalenderEventController {

	@Autowired
	Locale locale;
	
	@Autowired
	private CalenderService calService;
	
	@PostMapping("create-event")
	public String createCalenderEvent(@RequestBody CalenderEventDto calenderDto)
	{
		System.out.println(calenderDto);
		return calService.saveCalenderEvent(calenderDto);
	}
	
	@GetMapping("get-event-by-date/{date}")
	public List<CalenderResponseDto> getCalenderEventByDate(@PathVariable("date") String date)
	{
    
		return calService.getCalenderEventByDate(date);
	}
	
	@GetMapping("get-event-by-week")
	public List<CalenderResponseDto> getCalenderEventByWeek()
	{
		
		return calService.getCalenderEventByWeek();
	}
	@GetMapping("get-event-by-month/{year}/{month}")
	public List<CalenderResponseDto> getCalenderEventByMonth(@PathVariable("year") int year, @PathVariable("month") int month)
	{
		
		return calService.getCalenderEventByMonth(year, month);
	}
	@GetMapping("update-event-by-enventId")
	public  String updateCalenderEventByEventId(@RequestBody CalenderEventUpdateDto updateDto)
	{
		
		return calService.updateCalenderEventByEventId(updateDto);
	}
	@DeleteMapping("delete-event-by-eventId/{date}/{updatedBy}")
	public String deleteCalenderEventByEventId(@PathVariable("date") long eventId, @PathVariable("updatedBy") String updatedBy)
	{
		
		return calService.deleteCalenderEventByEventId(eventId, updatedBy);
	}
	
	
}
