package com.cosmo.FactoryMethodPattern;

public class HumanFactory {

	@SuppressWarnings("unchecked")
	static
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.err.println("人種生成錯誤");
		}
		return (T) human;
	}

}
