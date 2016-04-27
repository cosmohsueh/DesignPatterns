package com.cosmo.DecoratorPattern;

public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		System.out.println("親愛的家長");
		System.out.println("......");
		System.out.println("分數：");
		System.out.println("......");
		System.out.println("簽名：");
	}

	@Override
	public void sign(String name) {
		System.out.println("家長簽名為：" + name);
	}

}
