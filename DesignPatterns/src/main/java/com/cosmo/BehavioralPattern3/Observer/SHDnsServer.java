package com.cosmo.BehavioralPattern3.Observer;

import com.cosmo.BehavioralPattern3.ChainOfresponsibility.Recorder;

public class SHDnsServer extends DnsServer {

	@Override
	protected void sign(Recorder recorder) {
		recorder.setOwner("上海頂級服務器");
	}

	@Override
	protected boolean isLocal(Recorder recorder) {
		return recorder.getDomain().endsWith(".sh.cn");
	}

}
