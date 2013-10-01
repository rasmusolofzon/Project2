package model;

import java.util.HashMap;
import java.util.Map;

import expr.Environment;


public class CellMatrix implements Environment {
	private Map<String,Cell> matrix;
	private String status;
	
	public CellMatrix(int row, int cols){
		matrix = new HashMap<String,Cell>(row * cols);
		for(char i = 'A'; i < cols+'A'; i++){
			for(int j = 1; j <= row; j++){
				matrix.put(i+Integer.toString(j), new Cell());
			}
		}
	}
	
	public String getStatus(){
		return status;
	}
	
	public static void main(String []args){
		new CellMatrix(10,8);
	}

	@Override
	public double value(String name) {
		return matrix.get(name).value(null); // <----- ska det vara null!??!?!
		//TODO FEEEEL
	}

}
