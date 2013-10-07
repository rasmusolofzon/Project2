package model;

import expr.Environment;
import util.XLException;

public class CircularCell implements CellType {

	@Override
	public double value(Environment env) {
		throw new XLException("Circular reference");
	}

	@Override
	public String quickValue(Environment env) {
		// TODO Auto-generated method stub
		return null;
	}

}
