package com.cosmo.DIP;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

import junit.framework.TestCase;

public class DriverTest extends TestCase {

	Mockery context = new JUnit4Mockery();

	@Test
	public void testDriver() {
		final ICar car = context.mock(ICar.class);
		IDriver driver = new Driver(car);
		context.checking(new Expectations() {
			{
				oneOf(car).run();
			}
		});
		driver.drive();
	}
}
