package com.cosmo.BuilderPattern;

import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) {
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		benz.run();
		
		BMWBuilder bmwBuiler = new BMWBuilder();
		bmwBuiler.setSequence(sequence);
		BMWModel bmw = (BMWModel) bmwBuiler.getCarModel();
		bmw.run();
		
		Director director = new Director();
		
		for(int i=0; i< 1000; i++){
			director.getABenzModel().run();
		}
	}
}
