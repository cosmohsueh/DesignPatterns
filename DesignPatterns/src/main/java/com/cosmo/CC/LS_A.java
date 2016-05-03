package com.cosmo.CC;

public class LS_A extends AbstractLS {

	@Override
	protected String getOperateParam() {
		return super.A_PARAM;
	}

	@Override
	protected String echo(CommandVo vo) {
		return FileManager.ls_a(vo.getCommandName());
	}

}
