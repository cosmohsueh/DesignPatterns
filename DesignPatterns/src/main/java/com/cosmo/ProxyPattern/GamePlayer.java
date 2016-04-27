package com.cosmo.ProxyPattern;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	private IGamePlayer proxy = null;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		if (this.isProxy()) {
			System.out.println("登入名為：" + user + "的用戶" + this.name + "登入成功！");
		} else {
			System.out.println("請使用代理");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "在打怪！");
		} else {
			System.out.println("請使用代理");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "升級了！");
		} else {
			System.out.println("請使用代理");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		proxy = new GamePlayerProxy(this.name);
		return this.proxy;
	}

	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
