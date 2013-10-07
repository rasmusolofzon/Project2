package model;

import expr.Environment;

public class CommentCell implements CellType {
	private String text;
	
	public CommentCell(String string) {
		text = string;
	}


	@Override
	public String toString() {
		return text;
	}

	@Override
	public double value(Environment env) {
		return 0;
	}
	
	

}
