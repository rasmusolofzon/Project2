package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import model.CellMatrix;

public class EditorControl implements ActionListener {

	private CellMatrix matrix;
	private JTextField view;
	
	public EditorControl(CellMatrix matrix, JTextField view ){
		this.matrix = matrix;
		this.view = view;
		view.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
//		matrix.set("KEY",view.getText());
	}

}
