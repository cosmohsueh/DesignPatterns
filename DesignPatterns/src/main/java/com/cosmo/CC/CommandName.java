package com.cosmo.CC;

public abstract class CommandName {

	private CommandName nextOperator;

	public final String handleMessage(CommandVo vo) {
		String result = "";
		if (vo.getParamList().size() == 0 || vo.getParamList().contains(this.getOperateParam())) {
			result = this.echo(vo);
		} else {
			if (this.nextOperator != null) {
				result = this.nextOperator.handleMessage(vo);
			} else {
				result = "命令無法執行";
			}
		}
		return result;
	}

	public void setNext(CommandName operator) {
		this.nextOperator = operator;
	}

	protected abstract String getOperateParam();

	protected abstract String echo(CommandVo vo);
}
