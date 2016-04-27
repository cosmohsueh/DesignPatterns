package com.cosmo.CommandPattern;

public class Client {

	public static void main(String[] args) {
		Invoker xiaoSan = new Invoker();
//		Command command = new AddRequirementCommand();
		Command command = new DeletePageCommand();
		xiaoSan.setCommand(command);
		xiaoSan.action();
	}
}
