package com.cosmo.SpecificationPattern;

public interface IUserSpecification {

	public boolean isSatisfiedBy(User user);

	public IUserSpecification and(IUserSpecification spec);

	public IUserSpecification or(IUserSpecification spec);

	public IUserSpecification not();
}
