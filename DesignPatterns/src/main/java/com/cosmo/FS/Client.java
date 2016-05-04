package com.cosmo.FS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) {
		Card card = initCard();
		System.out.println("---初始卡訊息---");
		showCard(card);
		boolean flag = true;
		while (flag) {
			Trade trade = createTrade();
			DeductionFacade.deduct(card, trade);
			System.out.println("---交易憑證---");
			System.out.println(trade.getTradeNo() + " 交易成功");
			System.out.println("本次發生的交易金額：" + (trade.getAmount() / 100.0) + "元");
			showCard(card);
			System.out.println("是否需要退出（y/n）");
			if (getInput().equalsIgnoreCase("y")) {
				flag = false;
			}
		}
	}

	private static Card initCard() {
		Card card = new Card();
		card.setCardNo("110001000100");
		card.setFreeMoney(100000);
		card.setSteadyMoney(80000);
		return card;
	}

	private static Trade createTrade() {
		Trade trade = new Trade();
		System.out.print("請輸入交易編號：");
		trade.setTradeNo(getInput());
		System.out.print("請輸入交易金額：");
		trade.setAmount(Integer.parseInt(getInput()));
		return trade;
	}

	public static void showCard(Card card) {
		System.out.println("IC卡編號：" + card.getCardNo());
		System.out.println("固定類型餘額：" + (card.getSteadyMoney() / 100.0) + "元");
		System.out.println("自由類型餘額：" + (card.getFreeMoney() / 100.0) + "元");
	}

	public static String getInput() {
		String str = "";
		try {
			str = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
