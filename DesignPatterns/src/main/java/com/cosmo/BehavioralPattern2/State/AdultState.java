package com.cosmo.BehavioralPattern2.State;

public class AdultState extends HumanState {

	@Override
	public void work() {
		System.out.println("成年人工作是：養活自己");
		super.human.setState(Human.OLD_STATE);
	}

}
