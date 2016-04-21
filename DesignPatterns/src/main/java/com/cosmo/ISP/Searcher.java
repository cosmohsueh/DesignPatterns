package com.cosmo.ISP;

public class Searcher extends AbstractSearcher{

	public Searcher(IPettyGirl pettyGirl) {
		super(pettyGirl);
	}

	@Override
	public void show() {
		System.out.println("---美女的訊息如下---");
		super.pettyGirl.goodLooking();
		super.pettyGirl.niceFigure();
		super.pettyGirl.greatTemperament();
	}

}
