package com.cosmo.SpecificationPattern;

import java.util.ArrayList;

public interface IUserProvider {

	public ArrayList<User> findUser(IUserSpecification userSpec);
}
