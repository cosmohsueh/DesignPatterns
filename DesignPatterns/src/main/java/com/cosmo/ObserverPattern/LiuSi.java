package com.cosmo.ObserverPattern;

public class LiuSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("劉斯：觀察到韓非子動作，開始向老闆稟告…");
		this.reportToQiShiHuand(context);
		System.out.println("劉斯：稟告完畢…");
	}

	private void reportToQiShiHuand(String reportContext) {
		System.out.println("劉斯：韓非子有動作了----->" + reportContext);
	}

}
