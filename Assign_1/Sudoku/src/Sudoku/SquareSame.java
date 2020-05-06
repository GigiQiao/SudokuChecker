package Sudoku;
// this class is to check if there is a same number in the 3*3 square
// if there is such a condition, return true, then the puzzle is invalid
//else, return a false, the puzzle is valid under this condition
public class SquareSame {
		public static int[][] puzzle;
		Check checker = new Check();
		
		int num;
		//check for the 3*3 square to fit 1-9	
		public boolean squareSame(){
			for(int row = 0; row<Check.ROW; row++){
				for(int col=0; col<Check.COL;col++){
			int rSquare = row-row%3;
			int cSquare = col-col%3;
			 num = Check.puzzle[row][col];
			//System.out.println(num);
			for (int i = rSquare; i< rSquare+3; i++){
				for (int j= cSquare; j<cSquare+3; j++){
					//System.out.println("i="+i+"j="+j);
					//at the same position output 3

				if (Check.puzzle[i][j] == num&& num!=0 && i!=row&&j!=col){
					return true;
					
				}
		
			}
			
				}
				}
			}
				return false;
			}

	}

