package com.cosmo.FacadePattern;

public class LetterProcessImpl implements ILetterProcess {

	@Override
	public void writeContext(String context) {
		System.out.println("寫信的內容：" + context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("寫收件人姓名及地址：" + address);
	}

	@Override
	public void letterInotoEnvelope() {
		System.out.println("把信放在信封…");
	}

	@Override
	public void sendLetter() {
		System.out.println("把信寄出去…");
	}

}
