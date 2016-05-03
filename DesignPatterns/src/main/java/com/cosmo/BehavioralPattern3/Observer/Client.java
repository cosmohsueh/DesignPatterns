package com.cosmo.BehavioralPattern3.Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cosmo.BehavioralPattern3.ChainOfresponsibility.Recorder;

public class Client {

	public static void main(String[] args) throws IOException {
		DnsServer sh = new SHDnsServer();
		DnsServer china = new ChianTopDnsServer();
		DnsServer top = new TopDnsServer();
		sh.setUpperServer(china);
		china.setUpperServer(top);

		System.out.println("---域名解析伺服器---");
		while (true) {
			System.out.println("請輸入域名（輸入n結束）：");
			String domain = new BufferedReader(new InputStreamReader(System.in)).readLine();
			if (domain.equalsIgnoreCase("n")) {
				return;
			}
			Recorder recorder = new Recorder();
			recorder.setDomain(domain);
			sh.update(null, recorder);
			System.out.println("---dns解析結果---");
			System.out.println(recorder.toString());
		}
	}
}
