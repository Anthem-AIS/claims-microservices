package com.anthem.ais.pmb.claims.microservices.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PMBDateUtil {

	public static Timestamp getCurrentTimeStamp() {
		Date currentDate = new Date();
		Timestamp currentTimestamp = new Timestamp(currentDate.getTime());
		return currentTimestamp;
	}
	
	public static Date getCurrentDate() {
		Date currentDate = new Date();
		return currentDate;
	}
	
	public static Date getCurrentDateWithOutTime() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static Timestamp getTimeStampFrmDate(Date date) {
		Timestamp timestamp = new Timestamp(date.getTime());
		return timestamp;
	}

	/**
	 * Gets current Date form current TimeStamp
	 * 
	 * @return
	 */
	public static Date getCurrDateFrmTmStmp(Timestamp currentTimestamp) {
		Date currentDate = new Date(currentTimestamp.getTime());
		return currentDate;
	}

	/**
	 * Gets Date from String by parsing
	 * 
	 * @return
	 */
	public static Date getDatefromString(String dateString, String format) {
		
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = formatter.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return date;

	}

	/**
	 * Gets Date from String by parsing
	 * 
	 * @return
	 */
	public static Timestamp getTimestampfromString(String dateString,
			String format) {
		
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Timestamp timestamp = null;
		try {
			Date date = formatter.parse(dateString);
			timestamp = new Timestamp(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return timestamp;

	}
	public static Timestamp transformfromString(String dateString,
			String oldFormat,String newFormat) {
		
		SimpleDateFormat formatter = new SimpleDateFormat(oldFormat);
		Timestamp timestamp = null;
		try {
			Date date = formatter.parse(dateString);
			timestamp = new Timestamp(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return timestamp;

	}

	
}
