package com.covid.service;

import java.util.ArrayList;

import com.covid.Coviddata.CovidRaw;
import com.covid.Dao.CovidDao;

public class Covidservice {

	public int addCovidDataService(int iso_code,String continent,String location,int date,int total_cases,int new_cases,int total_deaths,int new_deaths)
	{
		CovidDao pDAO = new CovidDao(); 
		CovidRaw raw = new CovidRaw(); 
		
		raw.setIso_code(iso_code);
		raw.setContinent(continent);
		raw.setLocation(location);
		raw.setDate(date);
		raw.setTotal_cases(total_cases);
		raw.setNew_cases(new_cases);
		raw.setTotal_deaths(total_deaths);
		raw.setNew_deaths(new_deaths);
		
		int updateResult = 0;
		 try
		 {
			 updateResult = pDAO.addData(raw);
			 return updateResult; 
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
	}
	
	public ArrayList getCaseDetailsByIdLocation(String Location)
	{
		 CovidDao pDAO1 = new CovidDao(); 
		 CovidRaw raw1 = new CovidRaw();
		 
	 
		  ArrayList result = new ArrayList();
		 
		  try
		  {

			result = pDAO1.getCaseDetailsByLocation(Location);
			  return result;
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			 
		  }
		return result;
		
	}

}
