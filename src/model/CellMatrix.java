package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import util.XLException;
import expr.Environment;

public class CellMatrix extends Observable implements Environment {
	private Map<String, CellType> matrix;
	private String status;

	public CellMatrix() {

		matrix = new HashMap<String, CellType>();
	}

	public String getStatus() {
		return status;
	}

	public static void main(String[] args) {
		new CellMatrix();
	}

	public void reCompute() {
		// TODO inte säker att denna funkar?
		for (CellType e : matrix.values()){
			e.value(this);
		}
	}

	@Override
	public double value(String name) {
		// TODO fel returnvärde?
		return matrix.get(name).value(this);
	}

	public void set(String address, String string) {
		CellType oldslot, newslot;
		oldslot = matrix.get(address);
		try {
			newslot = CellFactory.build(string);
			matrix.put(address, new CircularCell());
			newslot.value(this);
			matrix.put(address, newslot);
			reCompute();
			setChanged();
			notifyAll();
		} catch (XLException e) {
			if (oldslot == null) {
				matrix.remove(address);
			} else {
				matrix.put(address, oldslot);

			}
		}
	}
}
