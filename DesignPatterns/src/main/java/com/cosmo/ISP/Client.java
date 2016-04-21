package com.cosmo.ISP;

public class Client {

	public static void main(String[] args) {
		IPettyGirl yanYan = new PettyGirl("媽媽");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}
}
