package com.cosmo.InterTheater.Bridge;

public class SendMail extends MailServer {

	public SendMail(MailTemplate m) {
		super(m);
	}

	@Override
	public void sendMail() {
		super.m.add("Received: (sendmail);");
		super.sendMail();
	}
}
