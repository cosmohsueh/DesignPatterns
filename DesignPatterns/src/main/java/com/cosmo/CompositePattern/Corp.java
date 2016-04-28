package com.cosmo.CompositePattern;

public abstract class Corp {

	private String name = "";
	private String position = "";
	private int salary = 0;
	
	public Corp(String name, String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public String getInfo(){
		StringBuilder info = new StringBuilder();
		info.append("姓名：" + this.name)
			.append("\t職稱：" + this.position)
			.append("\t薪資：" + this.salary);
		return info.toString();
	}
}
