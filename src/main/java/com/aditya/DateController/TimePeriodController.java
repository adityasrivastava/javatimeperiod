package com.aditya.DateController;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import com.aditya.DateGenerator.GenerateDateForInput;
import com.aditya.bean.DateBean;

public class TimePeriodController {
	
	/**
	 * Return a list of time periods
	 * @param obj_DateParam
	 * @return new List<String> object
	 */
	public static List<String> getTimePeriods(DateBean  obj_DateParam){
		
		return new GenerateDateForInput().setUpAndGenerateDateListOfInput(obj_DateParam);
		
	}
	
	/**
	 * Get time period and prints to console
	 * @param obj_DateParam
	 */
	
	public static void getAndPrintTimePeriods(DateBean  obj_DateParam){
		
		new GenerateDateForInput().setUpAndPrintGenerateDateOfInput(obj_DateParam);
		
	}

}
