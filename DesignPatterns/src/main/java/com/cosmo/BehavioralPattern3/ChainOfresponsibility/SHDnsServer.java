package com.cosmo.BehavioralPattern3.ChainOfresponsibility;

public class SHDnsServer extends DnsServer {

	@Override
	protected Recorder echo(String domain) {
		Recorder recorder = super.echo(domain);
		recorder.setOwner("上海DNS服務器");
		return recorder;
	}

	@Override
	protected boolean isLocal(String domain) {
		return domain.endsWith(".sh.cn");
	}

}
