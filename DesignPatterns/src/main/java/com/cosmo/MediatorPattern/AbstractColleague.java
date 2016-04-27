package com.cosmo.MediatorPattern;

public abstract class AbstractColleague {

	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator mediator){
		this.mediator = mediator;
	}
}
