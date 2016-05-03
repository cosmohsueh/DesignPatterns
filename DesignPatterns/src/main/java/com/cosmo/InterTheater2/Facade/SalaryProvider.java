package com.cosmo.InterTheater2.Facade;

public class SalaryProvider {

	private BasicSalary salary = new BasicSalary();
	private Bonus bonus = new Bonus();
	private Performance perf = new Performance();
	private Tax tax = new Tax();

	public int totalSalary() {
		return salary.getBasicSalary() + bonus.getBonus() + perf.getPerformance() - tax.getTax();
	}
}
