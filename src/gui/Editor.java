package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import model.CellMatrix;

public class Editor extends JTextField implements Observer {
	private CellMatrix matrix;
	private String address;
	
    public Editor(CellMatrix matrix,CurrentSlot currentSlot) {
        super();
    	this.matrix = matrix;
    	currentSlot.addObserver(this);
    	setBackground(Color.WHITE);
    }
    
    public void update(Observable observable, Object obj) {
    	CurrentSlot currentSlot = (CurrentSlot) observable;
    	setText(matrix.getText(currentSlot.getAddress()));
    	address = currentSlot.getAddress();
    }
    public String getAddress(){
    	return address;
    }
}