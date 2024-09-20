package com.spike.calender.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spike.calender.entity.CalenderEntity;

@Repository
public interface CalenderRepository extends JpaRepository<CalenderEntity, Long>{
	
//	@Query(value =  "select * from calender_entity where starting_date=:date and ending_date=:date", nativeQuery = true)
	@Query(value = "SELECT * FROM calender_entity WHERE :date BETWEEN starting_date AND ending_date", nativeQuery = true)
	public List<CalenderEntity> findByDate(LocalDate date);
//	@Query(value = "SELECT * FROM calender_entity WHERE starting_date OR ending_date BETWEEN :monday and :sunday", nativeQuery = true)
	@Query(value = "SELECT * FROM calender_entity WHERE (starting_date BETWEEN :monday AND :sunday) OR (ending_date BETWEEN :monday AND :sunday)", nativeQuery = true)
	public List<CalenderEntity> findByWeek(LocalDate monday, LocalDate sunday);
	@Query(value = "SELECT * FROM calender_entity WHERE (starting_date BETWEEN :firstDayOfMonth AND :lastDayOfMonth) OR (ending_date BETWEEN :firstDayOfMonth AND :lastDayOfMonth)", nativeQuery = true)
	public List<CalenderEntity> findByMonth(LocalDate firstDayOfMonth, LocalDate lastDayOfMonth);

}
