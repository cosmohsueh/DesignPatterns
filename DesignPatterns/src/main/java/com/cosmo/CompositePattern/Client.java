package com.cosmo.CompositePattern;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		Branch ceo = compositeCorpTree();
		System.out.println(ceo.getInfo());
		System.out.println(getTreeInfo(ceo));
	}
	
	static
	private void getAllSubordinateInfo(ArrayList subordinateList){
		int length = subordinateList.size();
		for(int i = 0; i < length; i++){
			Object o = subordinateList.get(i);
			if(o instanceof ILeaf){
				ILeaf employee = (ILeaf) o;
				System.out.println(employee.getInfo());
			} else {
				IBranch branch = (IBranch) o;
				System.out.println(branch.getInfo());
				getAllSubordinateInfo(branch.getSubordinate());
			}
		}
	}
	
	static
	private Branch compositeCorpTree(){
		Branch root = new Branch("王子", "總經理", 100000);
		
		Branch developDep = new Branch("劉子", "研發部經理", 10000);
		Branch salesDep = new Branch("馬子", "銷售部經理", 2000);
		Branch financeDep = new Branch("趙子", "財務部經理", 30000);
		Branch firstDevGroup = new Branch("楊三", "開發一部組長", 5000);
		Branch secondDevGroup = new Branch("吳大", "開發二部組長", 6000);
		
		Leaf a = new Leaf("a", "開發人員", 2000);
		Leaf b = new Leaf("b", "開發人員", 2000);
		Leaf c = new Leaf("c", "開發人員", 2000);
		Leaf d = new Leaf("d", "開發人員", 2000);
		Leaf e = new Leaf("e", "開發人員", 2000);
		Leaf f = new Leaf("f", "開發人員", 2000);
		Leaf g = new Leaf("g", "開發人員", 2000);
		Leaf h = new Leaf("h", "銷售人員", 5000);
		Leaf i = new Leaf("i", "銷售人員", 4000);
		Leaf j = new Leaf("j", "財務人員", 5000);
		Leaf k = new Leaf("k", "ceo秘書", 8000);
		Leaf zhengLaoLiu = new Leaf("鄭六", "研發部副總", 20000);
		
		root.add(developDep);
		root.add(salesDep);
		root.add(financeDep);
		root.add(k);
		
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		developDep.add(zhengLaoLiu);
		
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		
		secondDevGroup.add(d);
		secondDevGroup.add(e);
		secondDevGroup.add(f);
		
		salesDep.add(h);
		salesDep.add(i);
		
		financeDep.add(j);
		
		return root;
	}
	
	static
	private String getTreeInfo(Branch root){
		ArrayList<Corp> subordinateList = root.getSubordinate();
		StringBuilder info = new StringBuilder();
		for(Corp s: subordinateList){
			if(s instanceof Leaf){
				info.append(s.getInfo() + "\n");
			} else {
				info.append(s.getInfo() + "\n")
					.append(getTreeInfo((Branch)s));
			}
		}
		return info.toString();
	}
}
