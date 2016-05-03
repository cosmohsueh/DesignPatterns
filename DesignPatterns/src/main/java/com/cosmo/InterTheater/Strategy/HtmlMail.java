package com.cosmo.InterTheater.Strategy;

public class HtmlMail extends MailTemplate {

	public HtmlMail(String from, String to, String subject, String context) {
		super(from, to, subject, context);
	}

	@Override
	public String getContext() {
		String context = "\nContent-Type: multipart/mixed; charset=utf-8\n" + super.getContext();
		context = context + "\n郵件格式為：超文本格式";
		return context;
	}

}
