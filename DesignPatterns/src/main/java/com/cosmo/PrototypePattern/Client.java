package com.cosmo.PrototypePattern;

import java.util.Random;

public class Client {

	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("版權所有");
		while (i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + "先生（女士）");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			sendEmail(cloneMail);
			i++;
		}
	}

	public static void sendEmail(Mail mail) {
		System.out.println("標題：" + mail.getSubject() + "\t 收件人：" + mail.getReceiver() + "\t …發送成功");
	}

	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
}
