package com.cosmo.MementoPattern;

public class Client {

	public static void main(String[] args) {
		Boy boy = new Boy();
		Caretaker caretaker = new Caretaker();
		boy.setState("心情很棒！");
		System.out.println("---男孩現在心情狀態---");
		System.out.println(boy.getState());

		caretaker.setMemento(boy.createMemento());

		boy.changeState();
		System.out.println("---男孩追女孩後的狀態---");
		System.out.println(boy.getState());

		boy.restoreMemento(caretaker.getMemento());
		System.out.println("---恢復後狀態---");
		System.out.println(boy.getState());
	}
}
