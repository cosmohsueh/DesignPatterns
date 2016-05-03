package com.cosmo.BehavioralPattern3.ChainOfresponsibility;

public class TopDnsServer extends DnsServer {

	@Override
	protected Recorder echo(String domain) {
		Recorder recorder = super.echo(domain);
		recorder.setOwner("全球頂級DNS伺服器");
		return recorder;
	}

	@Override
	protected boolean isLocal(String domain) {
		return true;
	}

}
