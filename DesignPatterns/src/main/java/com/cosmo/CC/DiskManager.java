package com.cosmo.CC;

public class DiskManager {

	public static String df() {
		return "/\t10485760\n/usr\t104857600\n/home\t1048576000\n";
	}

	public static String df_k() {
		return "/\t10240\n/usr\t102400\n/home\t10240000\n";
	}

	public static String df_g() {
		return "/\t10\n/usr\t100\n/home\t1000";
	}
}
