package com.cosmo.InterTheater2.Facade;

import java.util.Random;

public class Tax {

	public int getTax() {
		return new Random().nextInt(300);
	}
}
