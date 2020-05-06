package Sudoku;

// this class is to check if the number in the row
// if there is a number that is larger than 9, then it is invalid, return true
// if there is not such a number, then it is valid, return false
// do not need col or square check because there is no larger number in the full puzzle

public class Larger {
	public static int[][] puzzle;
	Check checker = new Check();
	
	public boolean larger(){
	for(int j=0; j<Check.ROW;j++){	
	for(int i=0; i<Check.COL; i++){
		if(Check.puzzle[j][i]>9){
			//System.out.println("Larger check");
			return true;
		}	
	}
	}
	return false;

}
}