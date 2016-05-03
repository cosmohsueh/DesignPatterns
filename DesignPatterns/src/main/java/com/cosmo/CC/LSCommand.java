package com.cosmo.CC;

public class LSCommand extends Command {

	@Override
	public String execute(CommandVo vo) {
		CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
		return firstNode.handleMessage(vo);
	}

}
