package com.cosmo.CC;

import java.util.ArrayList;
import java.util.HashSet;

public class CommandVo {

	public final static String DIVIDE_FLAG = " ";
	public final static String PREFIX = "-";
	private String commandName = "";

	private ArrayList<String> paramList = new ArrayList<String>();
	private ArrayList<String> dataList = new ArrayList<String>();

	public CommandVo(String commandStr) {
		if (commandStr != null && !commandStr.isEmpty()) {
			String[] complexStr = commandStr.split(CommandVo.DIVIDE_FLAG);
			this.commandName = complexStr[0];
			for (int i = 1; i < complexStr.length; i++) {
				String str = complexStr[i];
				if (str.indexOf(CommandVo.PREFIX) == 0) {
					this.paramList.add(str.replace(CommandVo.PREFIX, "").trim());
				} else {
					this.dataList.add(str.trim());
				}
			}
		} else {
			System.out.println("命令解析失敗！！");
		}
	}

	public String getCommandName() {
		return this.commandName;
	}

	public ArrayList<String> getParamList() {
		if (this.paramList.size() == 0) {
			this.paramList.add("");
		}
		return new ArrayList<String>(new HashSet<String>(this.paramList));
	}

	public ArrayList<String> getDataList() {
		return this.dataList;
	}
}
