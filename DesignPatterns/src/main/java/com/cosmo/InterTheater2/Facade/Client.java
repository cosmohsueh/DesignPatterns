package com.cosmo.InterTheater2.Facade;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		HRFacade hrFacade = new HRFacade();
		
		System.out.println(hrFacade.querySalary("", new Date()));
		System.out.println(hrFacade.queryWorkDays(""));
	}
}
