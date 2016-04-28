package com.cosmo.VisitorPattern;

public class Visitor implements IVisitor {

	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}

	private String getBaseInfo(Employee employee) {
		StringBuilder info = new StringBuilder();
		info.append("姓名：" + employee.getName())
			.append("\t性別：" + (employee.getSex() == Employee.MALE ? "男" : "女"))
			.append("\t薪資：" + employee.getSalary());
		return info.toString();
	}

	private String getManagerInfo(Manager manager) {
		StringBuilder info = new StringBuilder();
		info.append(this.getBaseInfo(manager)).append("\t業績：" + manager.getPerformance());
		return info.toString();
	}

	private String getCommonEmployee(CommonEmployee commonEmployee) {
		StringBuilder info = new StringBuilder();
		info.append(this.getBaseInfo(commonEmployee)).append("\t工作：" + commonEmployee.getJob());
		return info.toString();
	}
	
}
