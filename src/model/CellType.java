package model;

import expr.Environment;

public interface CellType {
	public String toString();

	public double value(Environment env);

	public String quickValue(Environment env);
}
