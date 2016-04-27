package com.cosmo.ProxyPattern;

public interface IGamePlayer {

	public void login(String user, String password);

	public void killBoss();

	public void upgrade();

	public IGamePlayer getProxy();
}
