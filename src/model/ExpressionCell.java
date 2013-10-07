package model;

import java.io.IOException;

import util.XLException;
import expr.*;


public class ExpressionCell implements CellType {
	private String text;
	private static ExprParser parser = new ExprParser();
	private Expr expr;
	private double value;
	
	
	public ExpressionCell(String string) {
		text = string;
	}

	@Override
	public String toString() {
		return text;
	}

	@Override
	public double value(Environment env) {
		// TODO helt fel tillbakaskick?!?!?!
		try {
			expr = parser.build(text);
		} catch (IOException e) {
			throw new XLException("Fel i parsning");
		}
		value = expr.value(env);
		return value;
	}

}
