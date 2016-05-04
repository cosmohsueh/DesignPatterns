package com.cosmo.SpecificationPattern;

public abstract class CompositeSpecification implements IUserSpecification {

	public abstract boolean isSatisfiedBy(User user);

	public IUserSpecification and(IUserSpecification spec) {
		return new AndSpecification(this, spec);
	}

	public IUserSpecification or(IUserSpecification spec) {
		return new OrSpecification(this, spec);
	}

	public IUserSpecification not() {
		return new NotSpecification(this);
	}
}
