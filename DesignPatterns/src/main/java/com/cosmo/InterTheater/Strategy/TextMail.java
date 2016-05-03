package com.cosmo.InterTheater.Strategy;

public class TextMail extends MailTemplate {

	public TextMail(String from, String to, String subject, String context) {
		super(from, to, subject, context);
	}

	@Override
	public String getContext() {
		String context = "\nContent-Type: text/plain;charset=utf8\n" + super.getContext();
		context = context + "\n郵件格式為：文本格式";
		return context;
	}

}
