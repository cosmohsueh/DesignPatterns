package com.cosmo.ProxyPattern;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;

	public GamePlayerProxy(String name) {
		gamePlayer = new GamePlayer(name);
	}

	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

}
