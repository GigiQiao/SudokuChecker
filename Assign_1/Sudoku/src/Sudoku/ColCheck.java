package Sudoku;
// to check each column
// if the column already contain the number, then return true, if the column does not contain the number, return false

public class ColCheck {
	public static int[][] puzzle;
	Check checker = new Check();
	
	//check the column to fit all integer 1-9
	public boolean checkCol(int col, int num){
		// check column, row changes
		for (int i=0; i<Check.ROW; i++){
			if (Check.puzzle[i][col] == num){
				return true;
			}
		}
		//System.out.println(num+"Column check");
		//System.out.println("This column is complete");
		return false;
	}

}
