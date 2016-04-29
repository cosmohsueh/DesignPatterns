package com.cosmo.FlyweightPattern;

import java.util.HashMap;

public class SignInfoFactory {

	private static HashMap<ExtrinsicState, SignInfo> pool = new HashMap<ExtrinsicState, SignInfo>();

	@Deprecated
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}

	public static SignInfo getSignInfo(ExtrinsicState key) {
		SignInfo result = null;
		if (!pool.containsKey(key)) {
			result = new SignInfo();
			pool.put(key, result);
		} else {
			result = pool.get(key);
		}
		return result;
	}
}
