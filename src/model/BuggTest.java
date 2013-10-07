package model;

public class BuggTest {

	public static void main(String[] args) {
		CellMatrix matrix = new CellMatrix();

		matrix.set("A1", "1");
		matrix.set("A2", "2");
		matrix.set("A3", "A1+a2");
		// matrix.set("A4", "1");
		// matrix.set("A4", "A4");

		double result = matrix.value("A3");
		System.out.println(result);

	}
}
