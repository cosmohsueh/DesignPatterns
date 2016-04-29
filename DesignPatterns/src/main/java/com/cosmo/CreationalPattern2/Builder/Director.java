package com.cosmo.CreationalPattern2.Builder;

public class Director {

	private CarBuilder benzBuilder = new BenzBuilder();
	private CarBuilder bmwBuilder = new BMWBuilder();

	public ICar createBenzSuv() {
		return this.createCar(benzBuilder, "benz的輪胎", "benz的引擎");
	}

	public ICar createBMWVan() {
		return this.createCar(bmwBuilder, "BMW的輪胎", "BMW的引擎");
	}

	public ICar createComplexCar() {
		return this.createCar(bmwBuilder, "benz的輪胎", "BMW的引擎");
	}

	private ICar createCar(CarBuilder carBuilder, String wheel, String engine) {
		Blueprint bp = new Blueprint();
		bp.setWheel(wheel);
		bp.setEngine(engine);
		System.out.println("獲得生產藍圖");
		carBuilder.receiveBlueprint(bp);
		return carBuilder.buildCar();
	}
}
