package com.cosmo.InterTheater.Strategy;

public class Client {

	public static void main(String[] args) {
		MailTemplate m = new HtmlMail("aa@com", "bb@com", "外星人", "被打敗了");
		MailServer mailServer = new MailServer(m);
		mailServer.sendMail();
	}
}
