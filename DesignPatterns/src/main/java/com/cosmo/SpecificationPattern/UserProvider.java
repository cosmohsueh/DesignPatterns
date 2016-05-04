package com.cosmo.SpecificationPattern;

import java.util.ArrayList;

public class UserProvider implements IUserProvider {

	private ArrayList<User> userList;

	public UserProvider(ArrayList<User> userList) {
		this.userList = userList;
	}

	@Override
	public ArrayList<User> findUser(IUserSpecification userSpec) {
		ArrayList<User> result = new ArrayList<User>();
		for (User u : userList) {
			if (userSpec.isSatisfiedBy(u)) {
				result.add(u);
			}
		}
		return result;
	}

}
