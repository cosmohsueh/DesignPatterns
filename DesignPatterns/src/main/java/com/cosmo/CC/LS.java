package com.cosmo.CC;

public class LS extends AbstractLS {

	@Override
	protected String getOperateParam() {
		return super.DEFAULT_PARAM;
	}

	@Override
	protected String echo(CommandVo vo) {
		return FileManager.ls(vo.getCommandName());
	}

}
