package com.aditya.DateGenerator;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.aditya.bean.DateBean;

public class GenerateDateForInput {
	
	private List<String> timePeriodsList = null;
	
	/**
	 * Generates a timeperiod out to console
	 * @param obj_DateParam - startDate, endDate, Timeperiod DateBean Object
	 */
	
	public void setUpAndPrintGenerateDateOfInput(DateBean obj_DateParam) {
		
		LocalDate start = obj_DateParam.getStartDate().toLocalDate();
		LocalDate end = obj_DateParam.getEndDate().toLocalDate();

		for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
			
		    switch(obj_DateParam.getTimePeriod()){
		    	case "1": // Months
		    		System.out.println("Month of Year: "+date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH)+" Year: "+date.getYear()+" Date: "+date);
		    		break;
		    	case "2": // Days of month
			    	System.out.println("Day of Week: "+date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH)+" Date: "+date.getDayOfMonth()+","+date.getMonth()+" Date: "+date);
			    	break;
		    	case "3": // Years
		    		System.out.println("Year: "+date.getYear()+" Date: "+date);
		    		break;
		    	default:
		    		System.out.println("Oops: Something wrong. Try Again!");	
		    }
	 
		}

		System.out.println(obj_DateParam.toString());
		
	}

	
	/**
	 * Generates a list of timeperiod and returns to the calling fxn
	 * 
	 * @param obj_DateParam - startDate, endDate, Timeperiod DateBean Object
	 * @return timePeriodsList - List generic type string returned
	 */
	public List<String> setUpAndGenerateDateListOfInput(DateBean obj_DateParam) {
		
		timePeriodsList = new ArrayList<String>();
		
		LocalDate start = obj_DateParam.getStartDate().toLocalDate();
		LocalDate end = obj_DateParam.getEndDate().toLocalDate();

		for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
		    switch(obj_DateParam.getTimePeriod()){
		    	
		    	case "1": // Months
		    		timePeriodsList.add("Month of Year: "+date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH)+" Year: "+date.getYear()+" Date: "+date);
		    		break;
		    	case "2": // Days of month
			    	timePeriodsList.add("Day of Week: "+date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH)+" Date: "+date.getDayOfMonth()+","+date.getMonth()+" Date: "+date);
			    	break;
		    	case "3": // Years
		    		timePeriodsList.add("Year: "+date.getYear()+" Date: "+date);
		    		break;
		    	default:
		    		System.out.println("Oops: Something wrong. Try Again!");	
		    }
	 
		}
		
		return timePeriodsList;
	}

}
