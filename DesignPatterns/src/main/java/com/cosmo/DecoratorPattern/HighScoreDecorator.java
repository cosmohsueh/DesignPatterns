package com.cosmo.DecoratorPattern;

public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	private void reportHighScore() {
		System.out.println("這次考試最高分是…");
	}

	public void report() {
		this.reportHighScore();
		super.report();
	}

}
