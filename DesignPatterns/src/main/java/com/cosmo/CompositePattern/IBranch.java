package com.cosmo.CompositePattern;

import java.util.ArrayList;

public interface IBranch extends ICorp {

	public void add(ICorp corp);

	public ArrayList<ICorp> getSubordinate();
}
