package com.cosmo.CommandPattern;

public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到美工組…");
	}

	@Override
	public void add() {
		System.out.println("客戶要求增加一個頁面…");
	}

	@Override
	public void delete() {
		System.out.println("客戶要求刪除一個頁面…");
	}

	@Override
	public void change() {
		System.out.println("客戶要求修改一個頁面…");
	}

	@Override
	public void plan() {
		System.out.println("客戶要求頁面變更計畫");
	}

}
