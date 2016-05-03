package com.cosmo.InterTheater.Bridge;

public class Postfix extends MailServer {

	public Postfix(MailTemplate m) {
		super(m);
	}

	@Override
	public void sendMail() {
		String context = "Received: from XXXX(unknow {xxx.xxx.xxx.xxx}) by aa.aa.com(Postfix) whit ESMTP id djakfl\n";
		super.m.add(context);
		super.sendMail();
	}
}
