package com.cosmo.SpecificationPattern;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("蘇國慶大", 3));
		userList.add(new User("牛二", 8));
		userList.add(new User("張三國慶", 10));
		userList.add(new User("李四", 15));
		userList.add(new User("王五", 18));
		userList.add(new User("趙國六", 20));
		userList.add(new User("馬七", 25));
		userList.add(new User("國慶楊八", 30));
		userList.add(new User("猴九", 35));
		userList.add(new User("布十", 40));
		IUserProvider userProvider = new UserProvider(userList);
		System.out.println("---年齡大於20歲---");
		IUserSpecification userSpec = new UserByAgeThan(20);
		for (User u : userProvider.findUser(userSpec)) {
			System.out.println(u.toString());
		}

		System.out.println("---名字包含國慶---");
		IUserSpecification spec = new UserByNameLike("%國慶%");
		IUserSpecification spec2 = new UserByAgeThan(20);
		for (User u : userProvider.findUser(spec.and(spec2))) {
			System.out.println(u.toString());
		}
	}
}
