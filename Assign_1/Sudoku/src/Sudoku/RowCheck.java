package Sudoku;


// this class is to check the row that make sure each row has only one 1-9 integer
// this is to check if the exist number (other than 0) equal to the checking number in the row(1-9)
// then this number should not be put into the open element position (true)
// if this number is not exist in this row then this number is a possible number that can be fit into the row (false)
public class RowCheck {
	public static int[][] puzzle;
	Check checker = new Check();
	
	//check the row to fit all integer 1-9
		public boolean checkRow(int row, int num){// check row, column changes
		
				for (int i=0; i<Check.COL; i++){
				if (Check.puzzle[row][i]==num){
					return true;
			}
			}
			//System.out.println(num+"Row check");
			//System.out.println("This row is complete.");
			return false;
		}	

}
