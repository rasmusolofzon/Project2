package gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.SwingConstants;

import model.CellMatrix;
import control.SlotLabelControl;

public class SlotLabels extends GridPanel implements Observer{
    private List<SlotLabel> labelList;
    private CellMatrix matrix;
    private CurrentSlot currentSlot;

    public SlotLabels(int rows, int cols, CellMatrix matrix,CurrentSlot currentSlot) {
        super(rows + 1, cols);
        this.matrix = matrix;
        this.currentSlot = currentSlot;
        labelList = new ArrayList<SlotLabel>(rows * cols);
        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY,
                    SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
                SlotLabel label = new SlotLabel(ch+Integer.toString(row));
                add(label);
                labelList.add(label);
                new SlotLabelControl(matrix,label, currentSlot);
            }
        }
        
        currentSlot.initiate(labelList.get(0));
    }

    public void setCurrent(SlotLabel label){
//    	currentLabel = label;
    }
    public void setAllWhite(){
    	for(SlotLabel e : labelList){
    		e.setBackground(Color.WHITE);
    	}
    }
	@Override
	public void update(Observable arg0, Object arg1) {
		for(SlotLabel slot : labelList){
			slot.setText(matrix.getValue(slot.getAddress()));
		}
	}
}
