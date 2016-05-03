package com.cosmo.CC;

public class Invoker {

	public String execute(String commandStr) {
		String result = "";
		CommandVo vo = new CommandVo(commandStr);
		if (CommandEnum.getNames().contains(vo.getCommandName())) {
			String className = CommandEnum.valueOf(vo.getCommandName()).getValue();
			Command command;
			try {
				command = (Command) Class.forName(className).newInstance();
				result = command.execute(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			result = "無法執行命令";
		}
		return result;
	}
}
