package com.cosmo.BehavioralPattern3.Observer;

import com.cosmo.BehavioralPattern3.ChainOfresponsibility.Recorder;

public class ChianTopDnsServer extends DnsServer {

	@Override
	protected void sign(Recorder recorder) {
		recorder.setOwner("中國頂級DNS服務器");
	}

	@Override
	protected boolean isLocal(Recorder recorder) {
		return recorder.getDomain().endsWith(".cn");
	}

}
