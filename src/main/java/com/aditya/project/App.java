package com.aditya.project;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import com.aditya.DateController.TimePeriodController;
import com.aditya.bean.DateBean;

public class App 
{
	
    public static void main( String[] args )
    {
 
    	// Initialize time period 
    	List<String> timePeriods = TimePeriodController.getTimePeriods(new DateBean(
					Date.valueOf("2016-01-04"), Date.valueOf("2016-09-20"), DateBean.QUARTER
				));
    	
    	Iterator<String> timePeriodsIter = timePeriods.iterator();
    	
    	while(timePeriodsIter.hasNext()){
    		System.out.println(timePeriodsIter.next());
    	}
    	
    	
    }
}
