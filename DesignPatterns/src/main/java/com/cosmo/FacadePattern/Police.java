package com.cosmo.FacadePattern;

public class Police {

	public void checkLetter(ILetterProcess letterProcess){
		System.out.println(letterProcess + "信件檢查過了…");
	}
}
