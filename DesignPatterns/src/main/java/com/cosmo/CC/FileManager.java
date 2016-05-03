package com.cosmo.CC;

public class FileManager {

	public static String ls(String path) {
		return "file1\nfile2\nfile3\nfile4";
	}

	public static String ls_l(String path) {
		String str = "drw-rw-rw root system 1024 2016-05-03 14:46 fil1\n";
		str = str + "drw-rw-rw root system 1024 2016-05-03 14:46 fil2\n";
		str = str + "drw-rw-rw root system 1024 2016-05-03 14:46 fil3\n";
		return str;
	}

	public static String ls_a(String path) {
		String str = ".\n..\nfile1\nfile2\nfile3";
		return str;
	}
}
