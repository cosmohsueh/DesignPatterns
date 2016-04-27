package com.cosmo.ChainOfResponsibilityPattern;

public class Women implements IWomen {

	private int type = 0;
	private String request = "";

	public Women(int type, String request) {
		this.type = type;
		switch (this.type) {
		case 1:
			this.request = "女兒的請求是：" + request;
			break;
		case 2:
			this.request = "妻子的請求是：" + request;
			break;
		case 3:
			this.request = "母親的情求是：" + request;
			break;
		default:
			break;
		}
	}

	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public String getRequest() {
		return this.request;
	}

}
