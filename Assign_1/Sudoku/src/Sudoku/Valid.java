package Sudoku;
/* this class is to put four conditions
 * Larger.java, which is check if there is a number in the puzzle that larger than 9
 * RowSame.java, which is to check if there is same integer that other than 0 already exist twice or more in the same row
 * ColSame.java, which is to check if there is same integer that other than 0 already exist twice or more in the same column
 * SquareSame.java which is to check if there is same integer that other than 0 already exist twice or more in the same 3*3 square
 * if none of 4 conditions above exist, then return false, which means the puzzle is valid for solve
 *  
 */

public class Valid {
	public static int[][] puzzle;
	Check checker = new Check();
	Larger larger = new Larger();
	RowSame rsame = new RowSame();
	ColSame csame = new ColSame();
	SquareSame ssame = new SquareSame();
	
	public boolean validCheck(){
	   
	if (!larger.larger()&&!rsame.rowsame()&&!csame.colsame()&&!ssame.squareSame()){
		return false;
				//larger check
				//colValidcheck
				//row valid check 
				//square valid check
			}
	
	return true;
	}

}
	

