package model;

import expr.Environment;
import expr.Expr;

public class Cell extends Expr {
	private String name;
	private CellType type;

	public void setType(CellType type) {
		this.type = type;
	}

	@Override
	public String toString(int prec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double value(Environment env) {
		return type.value(name);
	}

}
