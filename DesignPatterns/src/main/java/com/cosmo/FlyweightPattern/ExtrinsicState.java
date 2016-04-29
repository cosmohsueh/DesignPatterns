package com.cosmo.FlyweightPattern;

public class ExtrinsicState {

	private String subject;
	private String location;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return this.subject.hashCode() + this.location.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ExtrinsicState) {
			ExtrinsicState state = (ExtrinsicState) obj;
			return state.getSubject().equals(this.subject) && state.getLocation().equals(this.location);
		}
		return false;
	}

}
