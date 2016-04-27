package com.cosmo.DecoratorPattern;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportSort(){
		System.out.println("我的排名是…");
	}
	
	public void report(){
		this.reportSort();
		super.report();
	}

}
