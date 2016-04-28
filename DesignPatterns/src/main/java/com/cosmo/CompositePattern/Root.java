package com.cosmo.CompositePattern;

import java.util.ArrayList;

public class Root implements IRoot {

	private ArrayList subordinateList = new ArrayList<>();
	private String name = "";
	private String position = "";
	private int salary = 0;

	public Root(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String getInfo() {
		StringBuilder info = new StringBuilder();
		info.append("名稱：" + this.name)
			.append("\t職位：" + this.position)
			.append("\t薪水：" + this.salary);
		return info.toString();
	}

	@Override
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}

	@Override
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}

	@Override
	public ArrayList getSubordinateInfo() {
		return this.subordinateList;
	}

}
