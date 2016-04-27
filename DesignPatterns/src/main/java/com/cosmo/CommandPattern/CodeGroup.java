package com.cosmo.CommandPattern;

public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到代碼組…");
	}

	@Override
	public void add() {
		System.out.println("客戶要求增加一項功能…");
	}

	@Override
	public void delete() {
		System.out.println("客戶要求刪除一項功能…");
	}

	@Override
	public void change() {
		System.out.println("客戶要求變更一項功能…");
	}

	@Override
	public void plan() {
		System.out.println("客戶要求代碼變更計畫…");
	}

}
