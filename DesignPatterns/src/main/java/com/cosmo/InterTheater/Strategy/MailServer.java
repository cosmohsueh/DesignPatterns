package com.cosmo.InterTheater.Strategy;

public class MailServer {

	private MailTemplate m;

	public MailServer(MailTemplate m) {
		this.m = m;
	}

	public void sendMail() {
		System.out.println("---發送郵件---");
		System.out.println("發件人：" + m.getFrom());
		System.out.println("收件人：" + m.getTo());
		System.out.println("主旨：" + m.getSubject());
		System.out.println("內容：" + m.getContext());
	}
}
