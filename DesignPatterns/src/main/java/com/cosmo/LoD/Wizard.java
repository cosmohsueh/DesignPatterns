package com.cosmo.LoD;

import java.util.Random;

public class Wizard {

	private Random random = new Random(System.currentTimeMillis());

	private int first() {
		System.out.println("執行第一個方法…");
		return random.nextInt(100);
	}

	private int second() {
		System.out.println("執行第二個方法…");
		return random.nextInt(100);
	}

	private int third() {
		System.out.println("執行第三個方法…");
		return random.nextInt(100);
	}
	
	public void installWizard(){
		int first = this.first();
		if (first > 50) {
			int second = this.second();
			if (second > 50) {
				int third = this.third();
				if (third > 50) {
					this.first();
				}
			}
		}
	}
}
