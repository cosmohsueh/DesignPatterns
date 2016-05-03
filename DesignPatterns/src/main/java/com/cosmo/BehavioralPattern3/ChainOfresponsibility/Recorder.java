package com.cosmo.BehavioralPattern3.ChainOfresponsibility;

public class Recorder {

	private String domain;
	private String ip;
	private String owner;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("域名：" + domain).append("\nIP地址：" + ip).append("\n解析者：" + owner);
		return info.toString();
	}
}
