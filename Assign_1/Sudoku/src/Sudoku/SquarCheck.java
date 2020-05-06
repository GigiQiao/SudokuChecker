package Sudoku;
// check the 3*3 square, if the square already contain the number, return true, if the square does not have that number, return false

public class SquarCheck {
	public static int[][] puzzle;
	Check checker = new Check();
	
	//check for the 3*3 square to fit 1-9	
	public boolean checkSquare(int row, int col, int num){
		int rSquare = row-row%3;
		int cSquare = col-col%3;
		for (int i = rSquare; i< rSquare+3; i++){
			for (int j= cSquare; j<cSquare+3; j++){
				
			if (Check.puzzle[i][j] == num){
				return true;
				
			}
		}
		}
			//System.out.println(num+"Square check");
			//System.out.println("This square is complete");
			return false;
		}

}
