package com.aditya.project;

import java.sql.Date;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.aditya.DateController.TimePeriodController;
import com.aditya.bean.DateBean;


/**
 * Unit test for simple App.
 */

@RunWith(value = Parameterized.class)
public class AppTest
{
	
	private String startDate;
	private String endDate;
	private String timePeriod;
	
	public AppTest(String startDate, String endDate, String timePeriod){
		this.startDate = startDate;
		this.endDate = endDate;
		this.timePeriod = timePeriod;
	}
	
	@Parameters(name="{index}")
	public static Iterable<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"2016-01-01","2016-02-01",DateBean.MONTH},
				{"2016-01-01","2016-02-01",DateBean.QUARTER},
				{"2016-01-01","2016-02-01",DateBean.YEAR},
		});
	}
  
	@Test
	public void runTimePeriodTestWithList(){
		
    	// Initialize time period 
    	List<String> timePeriods = TimePeriodController.getTimePeriods(new DateBean(
					Date.valueOf(startDate), Date.valueOf(endDate), timePeriod
				));
    	
    	Iterator<String> timePeriodsIter = timePeriods.iterator();
    	
    	while(timePeriodsIter.hasNext()){
    		System.out.println(timePeriodsIter.next());
    	}
		
	}
	
	@Test
	public void runTimePeriodTestWithOutList(){
		
    	TimePeriodController.getAndPrintTimePeriods(new DateBean(
					Date.valueOf("2016-01-04"), Date.valueOf("2016-01-20"), DateBean.MONTH
				));
		
	}
	
}
