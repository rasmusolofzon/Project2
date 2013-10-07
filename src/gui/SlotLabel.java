package gui;

import java.awt.Color;

public class SlotLabel extends ColoredLabel {
	private String address;
	
    public SlotLabel() {
        super("                    ", Color.WHITE, RIGHT);
    }
    public SlotLabel(String address){
    	this();
    	this.address = address;
    }
    
    public String getAddress(){
    	return address;
    }
}