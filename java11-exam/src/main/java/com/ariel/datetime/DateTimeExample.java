package com.ariel.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

	public static void main(String[] args) throws InterruptedException {

		// local date
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1998, 5, 21);

		LocalDate bb = birthday.plusDays(45);

		System.out.println("new date=" + bb);

		Period age = Period.between(birthday, today);
		System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays()
				+ " days old.");

		// local time
		LocalTime now = LocalTime.now();
		LocalTime lunch = LocalTime.of(12, 30);

		LocalTime t = now.plusHours(2).plusMinutes(30);
		System.out.println("orig=" + now);
		System.out.println("new=" + t);

		// combination
		LocalDateTime event = LocalDateTime.now();

		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("Asia/Manila"));
		ZonedDateTime dd = zoned.withZoneSameInstant(ZoneId.of("America/New_York"));

		System.out.println("zoned=" + zoned);
		System.out.println("dd=" + dd);

		LocalDateTime ee = event.minusDays(3);
		System.out.println("new dat=" + ee);

		Instant timestamp = Instant.now();

		Duration d = Duration.between(LocalTime.of(10, 0), LocalTime.of(12, 30));
		// 2 hours 30 minutes

		Period p = Period.between(LocalDate.of(2000, 1, 1), LocalDate.now());

//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		String formatted = LocalDate.now().format(fmt);

		ZoneId zone = ZoneId.of("Europe/Paris");

		Instant start = Instant.now();

		Thread.sleep(1500); // pretending to work for 1.5 seconds

		Instant end = Instant.now();

		Duration timePassed = Duration.between(start, end);
		System.out.println("Work took: " + timePassed.toMillis() + " ms");

		// Format date
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd MMM yyyy");
		String formatted = LocalDate.now().format(fmt);
		System.out.println("Formatted: " + formatted);

		// Parse date string
		String dateStr = "2025-12-25";
		LocalDate parsed = LocalDate.parse(dateStr); // default ISO-8601 format
		System.out.println("Parsed: " + parsed);

	}

	public static void formatDate() {

	}
}
