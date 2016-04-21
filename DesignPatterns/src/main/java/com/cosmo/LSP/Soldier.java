package com.cosmo.LSP;

public class Soldier {

	private AbstractGun gun;

	public void setGun(AbstractGun gun) {
		this.gun = gun;
	}

	public void killEnemy() {
		System.out.println("士兵開始殺敵人");
		gun.shoot();
	}
}
