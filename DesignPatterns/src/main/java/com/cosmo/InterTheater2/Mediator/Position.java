package com.cosmo.InterTheater2.Mediator;

public class Position extends AbsColleague implements IPosition {

	public Position(AbsMediator mediator) {
		super(mediator);
	}

	@Override
	public void prmote() {
		super.mediator.up(this);
	}

	@Override
	public void demote() {
		super.mediator.down(this);
	}

}
