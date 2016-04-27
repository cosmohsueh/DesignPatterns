package com.cosmo.ProxyPattern;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		IGamePlayer gamePlayer = new GamePlayer("不知");
		IGamePlayer proxy = gamePlayer.getProxy();
		System.out.println("開始時間是：" + new Date());
		proxy.login("123", "456");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("結束時間是：" + new Date());
	}
}
