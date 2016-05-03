package com.cosmo.InterTheater2.Mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		IPosition position = new Position(mediator);
		ISalary salary = new Salary(mediator);
		ITax tax = new Tax(mediator);

		position.prmote();
	}
}
