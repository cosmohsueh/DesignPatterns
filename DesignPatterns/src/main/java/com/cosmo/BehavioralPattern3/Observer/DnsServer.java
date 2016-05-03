package com.cosmo.BehavioralPattern3.Observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import com.cosmo.BehavioralPattern3.ChainOfresponsibility.Recorder;

public abstract class DnsServer extends Observable implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		Recorder recorder = (Recorder) arg1;
		if (isLocal(recorder)) {
			recorder.setIp(genIpAddress());
		} else {
			System.out.println("往上");
			responsFromUpperServer(recorder);
		}
		sign(recorder);
	}

	public void setUpperServer(DnsServer dnsServer) {
		super.deleteObservers();
		super.addObserver(dnsServer);
	}

	private void responsFromUpperServer(Recorder recorder) {
		super.setChanged();
		super.notifyObservers(recorder);
	}

	protected abstract void sign(Recorder recorder);

	protected abstract boolean isLocal(Recorder recorder);

	private String genIpAddress() {
		Random random = new Random();
		String ip = random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "."
				+ random.nextInt(255);
		return ip;
	}
}
