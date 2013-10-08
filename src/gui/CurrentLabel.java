package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class CurrentLabel extends ColoredLabel implements Observer {
    public CurrentLabel(CurrentSlot currentSlot) {
        super("A1", Color.WHITE);
        currentSlot.addObserver(this);
    }

    
	@Override
	public void update(Observable o, Object arg) {

		CurrentSlot currentSlot = (CurrentSlot) o;
		setText(currentSlot.getCurrentSlot());
//		setText("B2");
	}
}