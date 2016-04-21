package com.cosmo.LoD;

import java.util.List;

public class GroupLeader {

	private List<Girls> listGirls;

	public GroupLeader(List<Girls> listGirls) {
		this.listGirls = listGirls;
	}

	public void countGirls() {
		System.out.println("女生數量是: " + this.listGirls.size());
	}
}
