package com.cosmo.CC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) throws IOException {
		Invoker invoker = new Invoker();
		while (true) {
			System.out.print("#");
			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
			if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")) {
				return;
			} else {
				System.out.println(invoker.execute(input));
			}
		}
	}
}
