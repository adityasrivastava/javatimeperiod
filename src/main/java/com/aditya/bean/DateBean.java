package com.aditya.bean;

import java.sql.Date;

public class DateBean {
	
	public static String MONTH = "1";
	public static String YEAR = "3";
	public static String QUARTER = "2";
	
	private Date startDate;
	private Date endDate;
	private String timePeriod;
	
	public DateBean(){
		
	}

	public DateBean(Date startDate, Date endDate, String timePeriod) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.timePeriod = timePeriod;
	}

	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getTimePeriod() {
		return timePeriod;
	}
	
	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

	@Override
	public String toString() {
		return "DateBean [startDate="
				+ startDate
				+ ", endDate="
				+ endDate
				+ ", timePeriod="
				+ timePeriod
				+ "]";
	}
	
	

}
