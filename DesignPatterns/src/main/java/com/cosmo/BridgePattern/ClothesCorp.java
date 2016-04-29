package com.cosmo.BridgePattern;

public class ClothesCorp extends Corp {

	
	public ClothesCorp(Product product) {
		super(product);
	}

	public void makeMoney(){
		super.makeMoney();
		System.out.println("服裝公司賺小錢…");
	}

}
