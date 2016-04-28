package com.cosmo.ObserverPattern;

public class Client {

	public static void main(String[] args) throws Exception {
		Observer liSi = new LiSi();
		Observer wanSi = new WangSi();
		Observer liuSi = new LiuSi();
		
		HanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.addObservable(liSi);
		hanFeiZi.addObservable(wanSi);
		hanFeiZi.addObservable(liuSi);
		
		hanFeiZi.haveBreakfast();
	}
}
