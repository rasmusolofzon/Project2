package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import model.CellMatrix;

public class Editor extends JTextField implements Observer {
	private CellMatrix matrix;
	
    public Editor(CellMatrix matrix) {
        super();
    	this.matrix = matrix;
    	//matrix.addObserver(this);
    	
    	setBackground(Color.WHITE);
    }
    
    public void update(Observable observable, Object obj) {
    	
    }
}