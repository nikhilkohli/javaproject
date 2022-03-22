package com.covid.ui;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.parsing.Location;
import com.covid.service.Covidservice;

public class Covidui {
	
	public static void main(String[] args) {
		
		int iso_code=0;	
		String continent=" ";
		String location=" ";
		int date=0;
		int total_cases=0;
		int new_cases=0;	
		int total_deaths=0;
		int new_deaths=0;
		
		System.out.println("1.Add Covid Data");
		System.out.println("2.Search Data by Location");

		
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Scanner s=new Scanner(System.in);

			System.out.println("Enter iso code");
			iso_code= s.nextInt();
			System.out.println("Enter Continent");
			continent= s.next();
			System.out.println("Enter Location");
			location= s.next();
			System.out.println("Enter date");
			date= s.nextInt();
			System.out.println("Enter Total Cases");
			total_cases= s.nextInt();
			System.out.println("Enter new Cases");
			new_cases= s.nextInt();
			System.out.println("Enter Total Deaths");
			total_deaths= s.nextInt();
			System.out.println("Enter New Deaths");
			new_deaths= s.nextInt();
			
			Covidservice service = new Covidservice();
			int updateCount = service.addCovidDataService(iso_code, continent, location, date, total_cases, new_cases, total_deaths, new_deaths);
			
			System.out.println("inserted "+updateCount+" record   Success");
			
			break;
			
		case 2:
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Location");
			location = sc1.next();
			Covidservice coService = new Covidservice();
		    ArrayList result = coService.getCaseDetailsByIdLocation(location);
		    System.out.println(result);
			break;
		}
		
		
		
		
		
		
		
	}
	
	
	

}
