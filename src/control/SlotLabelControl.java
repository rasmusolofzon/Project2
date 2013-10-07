package control;

import gui.CurrentSlot;
import gui.SlotLabel;
import gui.SlotLabels;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

import model.CellMatrix;

public class SlotLabelControl implements MouseListener{

	private CellMatrix matrix;
	private SlotLabel view;
	private CurrentSlot currentSlot;
	public SlotLabelControl(CellMatrix matrix, SlotLabel view, CurrentSlot currentSlot){
		this.matrix = matrix;
		this.view = view;
		this.currentSlot = currentSlot;
		view.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		currentSlot.setCurrentSlot(view);
//		view.setBackground(Color.BLACK);
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
