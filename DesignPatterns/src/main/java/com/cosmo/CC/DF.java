package com.cosmo.CC;

public class DF extends AbstractDF {

	@Override
	protected String getOperateParam() {
		return super.DEFAULT_PARAM;
	}

	@Override
	protected String echo(CommandVo vo) {
		return DiskManager.df();
	}

}
