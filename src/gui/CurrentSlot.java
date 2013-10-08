package gui;

import java.awt.Color;
import java.util.Observable;

import model.CellMatrix;

public class CurrentSlot extends Observable {
	private CellMatrix matrix;
	private SlotLabel currentSlot;

	public CurrentSlot(CellMatrix matrix) {
		this.matrix = matrix;
	}

	public String getCurrentSlot() {
		return currentSlot.getAddress();
	}

	public void setCurrentSlot(SlotLabel currentSlot) {
		this.currentSlot.setBackground(Color.WHITE);
		currentSlot.setBackground(Color.YELLOW);
		this.currentSlot = currentSlot;
		setChanged();
		notifyObservers();
	}
	public void initiate(SlotLabel currentSlot){
		this.currentSlot = currentSlot;
	}

	public String getAddress() {
		return currentSlot.getAddress();
	}

}
