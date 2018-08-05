package solution;

import solution.FarmCell;
public class Farm {
	public int farmSize;
	public FarmCell[][] farmCell;
	public Farm(int size) {
		farmSize = size;
		farmCell = new FarmCell[farmSize][farmSize];
		initializeCells();
	}
	public void initializeCells() {
		for( int i = 0; i < farmSize; i++) {
			for (int k = 0; k < farmSize; k++) {
				farmCell[i][k] = new FarmCell();
			}
		}
	
	}	
	public String toString() {
		String s = ""; 
		for( int i = 0; i < farmSize; i++) {
			for (int k = 0; k < farmSize; k++) {
				s += farmCell[i][k].getData();
			}
			s += "\n";
		}		
		return s;
	}
}
