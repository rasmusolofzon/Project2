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

	public void reCompute() {
		// TODO inte s�ker att denna funkar?
		for (CellType e : matrix.values()) {
			e.value(this);
		}
	}

	@Override
	public double value(String address) {
		if(matrix.containsKey(address)){
			return matrix.get(address).value(this);
		}
		else{
			throw new XLException("Felaktigt uttryck");
		}
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
			notifyObservers();
		} catch (XLException e) {
			if (oldslot == null) {
				matrix.remove(address);
			} else {
				matrix.put(address, oldslot);
			}
			throw new XLException("Cykliskt beroende");
		}
	}

	public String getValue(String address) {
		if(matrix.containsKey(address)){
			return matrix.get(address).quickValue(this);
		}
		else
			return "";
	}

	public String getText(String address) {
		if(matrix.containsKey(address)){
			return matrix.get(address).toString();
		}
		else
			return "";
	}
}
