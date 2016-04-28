package com.cosmo.StatePattern;

public class Lift implements ILift {

	private int state;

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public void open() {
		switch (this.state) {
		case OPENING_STATE:
			break;
		case CLOSING_STATE:
			this.openWithoutLogin();
			this.setState(OPENING_STATE);
			break;
		case RUNNING_STATE:
			break;
		case STOPPING_STATE:
			this.openWithoutLogin();
			this.setState(OPENING_STATE);
			break;
		}

	}

	@Override
	public void close() {
		switch (this.state) {
		case OPENING_STATE:
			this.closeWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case CLOSING_STATE:
			break;
		case RUNNING_STATE:
			break;
		case STOPPING_STATE:
			break;
		}

	}

	@Override
	public void run() {
		switch (this.state) {
		case OPENING_STATE:
			break;
		case CLOSING_STATE:
			this.runWithoutLogin();
			this.setState(RUNNING_STATE);
			break;
		case RUNNING_STATE:
			break;
		case STOPPING_STATE:
			this.runWithoutLogin();
			this.setState(RUNNING_STATE);
			break;
		}

	}

	@Override
	public void stop() {
		switch (this.state) {
		case OPENING_STATE:
			break;
		case CLOSING_STATE:
			this.stopWithoutLogin();
			this.setState(STOPPING_STATE);
			break;
		case RUNNING_STATE:
			this.stopWithoutLogin();
			this.setState(STOPPING_STATE);
			break;
		case STOPPING_STATE:
			break;
		}

	}

	private void closeWithoutLogic() {
		System.out.println("電梯關門…");
	}

	private void openWithoutLogin() {
		System.out.println("電梯開門…");
	}

	private void runWithoutLogin() {
		System.out.println("電梯運行");
	}

	private void stopWithoutLogin() {
		System.out.println("電梯停止");
	}

}
