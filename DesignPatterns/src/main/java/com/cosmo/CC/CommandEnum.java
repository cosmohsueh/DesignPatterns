package com.cosmo.CC;

import java.util.ArrayList;
import java.util.List;

public enum CommandEnum {

	ls("com.cosmo.CC.LSCommand"),
	df("com.cosmo.CC.DFCommand");
	
	private String value = "";

	private CommandEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static List<String> getNames() {
		CommandEnum[] commandEnum = CommandEnum.values();
		List<String> names = new ArrayList<String>();
		for (CommandEnum c : commandEnum) {
			names.add(c.name());
		}
		return names;
	}
}
