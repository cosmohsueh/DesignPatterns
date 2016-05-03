package com.cosmo.BehavioralPattern2.State;

public class ChildState extends HumanState {

	@Override
	public void work() {
		System.out.println("兒童工作是：玩耍");
		super.human.setState(Human.ADULT_STATE);
	}

}
