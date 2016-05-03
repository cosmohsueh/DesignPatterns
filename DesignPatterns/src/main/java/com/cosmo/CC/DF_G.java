package com.cosmo.CC;

public class DF_G extends AbstractDF {

	@Override
	protected String getOperateParam() {
		return super.G_PARAM;
	}

	@Override
	protected String echo(CommandVo vo) {
		return DiskManager.df_g();
	}

}
