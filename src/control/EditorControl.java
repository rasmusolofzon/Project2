package control;

import gui.Editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CellMatrix;
import util.XLException;

public class EditorControl implements ActionListener {

	private CellMatrix matrix;
	private Editor view;
	
	public EditorControl(CellMatrix matrix, Editor view ){
		this.matrix = matrix;
		this.view = view;
		view.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try{
			matrix.set(view.getAddress(),view.getText());
		}
		catch (XLException e){
			System.out.println(e.getMessage());
		}
	}

}
