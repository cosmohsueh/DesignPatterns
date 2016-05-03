package com.cosmo.BehavioralPattern3.ChainOfresponsibility;

public class ChinaTopDnsServer extends DnsServer {

	@Override
	protected Recorder echo(String domain) {
		Recorder recorder = super.echo(domain);
		recorder.setOwner("中國頂級DNS伺服器");
		return recorder;
	}

	@Override
	protected boolean isLocal(String domain) {
		return domain.endsWith(".cn");
	}

}
