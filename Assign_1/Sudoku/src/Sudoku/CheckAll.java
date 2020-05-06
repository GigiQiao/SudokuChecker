package Sudoku;
// if the all three condition does not have the same number return true, if one of the condition have the same number return false
public class CheckAll {
	public static int[][] puzzle;
	Check checker = new Check();
	RowCheck rowchecker = new RowCheck();
	ColCheck colchecker = new ColCheck();
	SquarCheck squarechecker = new SquarCheck();
	
	
	public boolean checkAll(int row, int col, int num){
		// to make sure the number satisfy all 3 conditions row, column and square
		if(!rowchecker.checkRow(row, num)&&!colchecker.checkCol(col, num)&&!squarechecker.checkSquare(row, col, num)){
			//System.out.println(num);
			return true;
		}
		return false;
	}

}
