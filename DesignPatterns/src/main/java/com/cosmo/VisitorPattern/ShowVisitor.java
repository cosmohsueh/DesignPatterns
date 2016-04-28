package com.cosmo.VisitorPattern;

public class ShowVisitor implements IShowVisitor {

	private StringBuilder info = new StringBuilder();
	
	@Override
	public void report() {
		System.out.println(this.info.toString());
	}
	
	@Override
	public void visit(CommonEmployee commonEmployee) {
		this.info.append(this.getBaseInfo(commonEmployee))
			.append("\t工作：" + commonEmployee.getJob())
			.append("\n");
	}

	@Override
	public void visit(Manager manager) {
		this.info.append(this.getBaseInfo(manager))
			.append("\t業績：" + manager.getPerformance())
			.append("\n");
	}

	private String getBaseInfo(Employee employee) {
		StringBuilder info = new StringBuilder();
		info.append("姓名：" + employee.getName())
			.append("\t性別：" + (employee.getSex() == Employee.MALE ? "男" : "女"))
			.append("\t薪資：" + employee.getSalary());
		return info.toString();
	}

}
