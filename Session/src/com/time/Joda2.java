package com.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Joda2 {
	public static void main(String[] args) {
	LocalDateTime DT=LocalDateTime.of(2016, 04, 27, 8, 20);
	LocalDateTime DT1=DT.plusDays(5);
	LocalDateTime DT2=DT.plusMonths(4);
	System.out.println("LocalDateTime: "+DT);
	System.out.println("After Adding Days: "+DT1);
	System.out.println("After Adding Months: "+DT2);
	System.out.println("DatetimeFormat: "+DT2.format(DateTimeFormatter.ISO_DATE_TIME));
}
}
