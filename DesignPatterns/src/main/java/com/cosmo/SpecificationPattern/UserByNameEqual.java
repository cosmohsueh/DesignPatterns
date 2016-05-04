package com.cosmo.SpecificationPattern;

public class UserByNameEqual extends CompositeSpecification {

	private String name;

	public UserByNameEqual(String name) {
		this.name = name;
	}

	@Override
	public boolean isSatisfiedBy(User user) {
		return user.getName().equals(name);
	}

}
