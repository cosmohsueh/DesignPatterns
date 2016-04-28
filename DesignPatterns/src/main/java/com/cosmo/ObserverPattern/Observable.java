package com.cosmo.ObserverPattern;

public interface Observable {

	public void addObservable(Observer observer);

	public void delObservable(Observer observer);

	public void notifyObservables(String context);
}
