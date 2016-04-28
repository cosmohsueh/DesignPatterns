package com.cosmo.VisitorPattern;

public interface IVisitor {

	public void visit(CommonEmployee commonEmployee);

	public void visit(Manager manager);

}
