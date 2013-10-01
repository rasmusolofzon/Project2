package model;

import java.io.IOException;

import expr.Environment;
import expr.Expr;

public class Cell extends Expr {
	private String content;
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
		return type.value(content);
	}
	
	public String getString(){
		return type.getString(content);
	}
//	public boolean check(String str){
//		expr.ExprParser parser = new expr.ExprParser();
//		try {
//			check(str, parser.build(str));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public boolean check(String str, Expr expr){
//		expr.ExprParser parser = new expr.ExprParser();
//		try {
//			expr = parser.build(str);
//			parser.build(expr.toString());
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

}
