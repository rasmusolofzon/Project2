package model;

public class CellFactory {

	public static CellType build(String string){
		if (string.charAt(0) == '#') {
			return new CommentCell (string);
		}
		else {
			return new ExpressionCell(string);
		}
	
}
}
