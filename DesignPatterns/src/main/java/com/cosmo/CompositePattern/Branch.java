package com.cosmo.CompositePattern;

import java.util.ArrayList;

public class Branch extends Corp {

	private ArrayList<Corp> subordinateList = new ArrayList<Corp>();

	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}

	public void add(Corp corp) {
		this.subordinateList.add(corp);
	}

	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}

}
