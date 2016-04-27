package com.cosmo.CommandPattern;

public class RequirementGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到需求組…");
	}

	@Override
	public void add() {
		System.out.println("客戶要求增加一項需求…");
	}

	@Override
	public void delete() {
		System.out.println("客戶要求刪除一項需求…");
	}

	@Override
	public void change() {
		System.out.println("客戶要求修改一項需求…");
	}

	@Override
	public void plan() {
		System.out.println("客戶要求需求變更計畫…");
	}

}
