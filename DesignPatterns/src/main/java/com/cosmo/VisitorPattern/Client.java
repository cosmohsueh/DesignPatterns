package com.cosmo.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		IShowVisitor showVisitor = new ShowVisitor();
		ITotalVisitor totalVisitor = new TotalVisitor();
		for (Employee e : mockEmployee()) {
			e.accept(showVisitor);
			e.accept(totalVisitor);
		}
		showVisitor.report();
		totalVisitor.totalSalary();
	}

	private static List<Employee> mockEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setName("張三");
		zhangSan.setJob("RD");
		zhangSan.setSex(Employee.MALE);
		zhangSan.setSalary(1800);
		empList.add(zhangSan);

		CommonEmployee liSi = new CommonEmployee();
		liSi.setName("李四");
		liSi.setJob("UI");
		liSi.setSalary(Employee.FEMALE);
		liSi.setSalary(1900);
		empList.add(liSi);

		Manager wangWu = new Manager();
		wangWu.setName("王五");
		wangWu.setPerformance("拍馬屁");
		wangWu.setSex(Employee.MALE);
		wangWu.setSalary(18750);
		empList.add(wangWu);
		return empList;
	}
}
