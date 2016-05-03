package com.cosmo.InterTheater2.Facade;

import java.util.Random;

public class Attendance {

	public int getWorkDays() {
		return new Random().nextInt(30);
	}

}
