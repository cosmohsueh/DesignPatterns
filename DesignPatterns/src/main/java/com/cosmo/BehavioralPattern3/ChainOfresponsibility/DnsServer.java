package com.cosmo.BehavioralPattern3.ChainOfresponsibility;

import java.util.Random;

public abstract class DnsServer {

	private DnsServer upperServer;

	public final Recorder resolve(String domain) {
		Recorder recorder = null;
		if (isLocal(domain)) {
			recorder = echo(domain);
		} else {
			recorder = upperServer.resolve(domain);
		}
		return recorder;
	}

	public void setUppserServer(DnsServer dnsServer) {
		this.upperServer = dnsServer;
	}

	protected abstract boolean isLocal(String domain);

	protected Recorder echo(String domain) {
		Recorder recorder = new Recorder();
		recorder.setIp(genIpAddress());
		recorder.setDomain(domain);
		return recorder;
	}

	private String genIpAddress() {
		Random random = new Random();
		String address = random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "."
				+ random.nextInt(255);
		return address;
	}
}
