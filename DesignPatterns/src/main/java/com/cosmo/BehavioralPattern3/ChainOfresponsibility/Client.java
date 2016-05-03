package com.cosmo.BehavioralPattern3.ChainOfresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) throws IOException {
		DnsServer sh = new SHDnsServer();
		DnsServer china = new ChinaTopDnsServer();
		DnsServer top = new TopDnsServer();
		sh.setUppserServer(china);
		china.setUppserServer(top);

		System.out.println("---域名解析伺服器---");
		while (true) {
			System.out.println("---請輸入域名（輸入N結束）：");
			String domain = new BufferedReader(new InputStreamReader(System.in)).readLine();
			if (domain.equalsIgnoreCase("n")) {
				return;
			}
			Recorder recorder = sh.resolve(domain);
			System.out.println("---DNS服務器解析結果");
			System.out.println(recorder.toString());
		}
	}
}
