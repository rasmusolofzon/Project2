package model;

public class BuggTest {

	public static void main(String[] args) {
		CellMatrix matrix = new CellMatrix();

		matrix.set("A1", "2");
		matrix.set("A2", "1");
		matrix.set("A4", "1");
		matrix.set("A4", "A4");

		double result = matrix.value("A4");
		System.out.println(result);

	}
}
