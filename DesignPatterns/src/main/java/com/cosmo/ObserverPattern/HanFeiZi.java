package com.cosmo.ObserverPattern;

import java.util.ArrayList;

public class HanFeiZi implements Observable, IHanFeiZi {

	private ArrayList<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void addObservable(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void delObservable(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObservables(String context) {
		for (Observer observer : observerList) {
			observer.update(context);
		}
	}

	@Override
	public void haveBreakfast() {
		System.out.println("韓非子：開始吃飯了…");
		this.notifyObservables("韓非子在吃飯");
	}

	@Override
	public void haveFun() {
		System.out.println("韓非子：開始娛樂了…");
		this.notifyObservables("韓非子在娛樂");
	}

}
