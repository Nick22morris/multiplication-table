
public class MultiplicationTable {
	private int grid[][];
	
	public MultiplicationTable() {
		grid = new int[10][10];
		create();
	}
	public  MultiplicationTable(int rows, int columns) {
		grid = new int[rows][columns];
		create();
	}
	public void create() {
		int y = 1;
		int x = 0;
		// Sets top axis to 1...10
		for(int n : grid[0]) {
			grid[0][x] =  x+1; 
			x++;
		}
		
		// Sets left axis to 1...10
		for(int arr[] : grid) {
			arr[0] = y;
			y++;
		}
		
		// Creates String Matrix]
		for(int j = 0; j < grid.length; j++) {
			for(int i = 0; i < grid[j].length; i++) {
				int top = grid[0][j];
				int left = grid[i][0];
				int product = top * left;
				grid[i][j] = product;
				x++;
			}
		}
		
		// Gets Biggest Value digits
		int yLen = grid.length - 1;
		int xLen = grid[yLen].length - 1;		
		int biggest  = grid[yLen][xLen];
		String biggestString = biggest + "";
		String newMatrix[][]= new String[yLen+1][xLen+1];
		// Cleans it up
		for(int j = 0; j < grid.length; j++) {
			for(int i = 0; i < grid[j].length; i++) {
				int val = grid[j][i];
				String sVal = val + "";
				int len = 5 - sVal.length();
				int added = 0;
				while(added < len) {
					sVal += " ";
					added++;
				}
				newMatrix[j][i] = sVal;
				System.out.print(sVal + "  ");
			}
			System.out.println();
		}
	}
}
