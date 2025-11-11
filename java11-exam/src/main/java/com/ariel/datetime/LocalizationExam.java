package com.ariel.datetime;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalizationExam {

	public static void main(String[] args) {
		Locale us = Locale.US;
		Locale japan = Locale.JAPAN;
		Locale fr = Locale.FRANCE;

		Locale ph = new Locale("fil", "PH"); // Filipino (Philippines)
		Locale german = new Locale("de", "DE");

		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf.format(1500.75));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(nf2.format(1500.75));

		NumberFormat pf = NumberFormat.getPercentInstance(Locale.GERMANY);
		System.out.println(pf.format(0.25));

		LocalDate today = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.FRANCE);

		System.out.println(today.format(fmt));

		Locale.setDefault(Locale.US);

		NumberFormat.getCurrencyInstance(); // no argument
	}
}
