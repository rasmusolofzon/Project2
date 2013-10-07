package model;

import util.Adjustment;
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

	@Override
	public String quickValue(Environment env) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 11; i++) {
			sb.append(text.charAt(i));
		}
		Adjustment adj = new Adjustment(10);
		return adj.left(sb.toString());
	}

}
