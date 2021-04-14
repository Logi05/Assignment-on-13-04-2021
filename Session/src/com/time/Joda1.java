package com.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Joda1 {	
	public static void main(String[] args) {
		LocalDate D1=LocalDate.now();
		LocalDate D2=LocalDate.of(1999, 05, 05);
		LocalDate D3=LocalDate.parse("1999-06-19",DateTimeFormatter.ISO_DATE);
		System.out.println("Current Date: "+D1);
		System.out.println("Date of given: "+D2);
		System.out.println("Date formatter: "+D3);		
	}
}
