package com.cosmo.CC;

public class LS_L extends AbstractLS {

	@Override
	protected String getOperateParam() {
		return super.L_PARAM;
	}

	@Override
	protected String echo(CommandVo vo) {
		return FileManager.ls_l(vo.getCommandName());
	}

}
