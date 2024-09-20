package com.spike.calender;

import java.util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalenderModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalenderModuleApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapperBean()
	{
		return new ModelMapper();
	}
	
	@Bean
	public Locale localeBean()
	{
		return Locale.US;
	}

}
