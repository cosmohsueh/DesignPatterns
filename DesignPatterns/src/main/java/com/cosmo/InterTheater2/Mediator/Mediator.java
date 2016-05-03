package com.cosmo.InterTheater2.Mediator;

public class Mediator extends AbsMediator {

	@Override
	public void up(ISalary salary) {
		upSalary();
		upTax();
	}

	@Override
	public void up(IPosition position) {
		upPosition();
		upSalary();
		upTax();
	}

	@Override
	public void up(ITax tax) {
		upTax();
		downSalary();
	}

	@Override
	public void down(ISalary salary) {
		downSalary();
		downTax();
	}

	@Override
	public void down(IPosition position) {
		downPosition();
		downSalary();
		downTax();
	}

	@Override
	public void down(ITax tax) {
		downTax();
		upSalary();
	}

	private void upSalary() {
		System.out.println("工資增加");
	}

	private void upTax() {
		System.out.println("稅收增加");
	}

	private void upPosition() {
		System.out.println("職位增加");
	}

	private void downSalary() {
		System.out.println("工資減少");
	}

	private void downTax() {
		System.out.println("稅收減少");
	}

	private void downPosition() {
		System.out.println("職位降低");
	}

}
