package com.cosmo.InterTheater.Bridge;

public class Client {

	public static void main(String[] args) {
		MailTemplate m = new HtmlMail("aa@com", "bb@com", "外星人", "已經跑了");
		MailServer mailServer = new Postfix(m);
		mailServer.sendMail();
	}
}
