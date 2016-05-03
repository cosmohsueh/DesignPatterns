package com.cosmo.CC;

public class DFCommand extends Command {

	@Override
	public String execute(CommandVo vo) {
		return super.buildChain(AbstractDF.class).get(0).handleMessage(vo);
	}

}
