package com.cosmo.LoD;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Girls> listGirls = new ArrayList<Girls>();
		for (int i = 0; i < 20; i++) {
			listGirls.add(new Girls());
		}
		Teacher teacher = new Teacher();
		teacher.commond(new GroupLeader(listGirls));
		
		InstallSoftware invoker = new InstallSoftware();
		invoker.InstallWizard(new Wizard());
	}
}
