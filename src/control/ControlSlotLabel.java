package control;

import gui.SlotLabel;
import gui.SlotLabels;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

import model.CellMatrix;

public class ControlSlotLabel implements MouseListener{

	private CellMatrix matrix;
	private SlotLabel view;
	public ControlSlotLabel(CellMatrix matrix, SlotLabel view){
		this.matrix = matrix;
		this.view = view;
		view.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Container c = SwingUtilities.getAncestorOfClass(gui.SlotLabels.class,
               view);
		c = (SlotLabels) c;
		((SlotLabels)c).setAllWhite();
		view.setBackground(Color.BLACK);
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
