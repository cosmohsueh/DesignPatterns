package com.cosmo.InterTheater3.Adapter;

public class Standin implements IStar {

	private IActor actor;

	public Standin(IActor actor) {
		this.actor = actor;
	}

	@Override
	public void act(String context) {
		actor.playact(context);
	}

}
