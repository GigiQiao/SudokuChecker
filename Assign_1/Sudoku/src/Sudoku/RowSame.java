package Sudoku;
// this class is to check if there is a same integer already exist in the row
//if there is such condition, return true, the puzzle cannot be solved, else, return false, the puzzle is correct under this condition
public class RowSame {
	public static int[][] puzzle;
	Check checker = new Check();
	
	public boolean rowsame(){
		for(int k =0; k<Check.ROW; k++){
		for (int i=0; i<Check.COL; i++){
			int num = Check.puzzle[k][i];
			//System.out.print(num);
			for(int j =i+1; j<Check.COL; j++){
				//System.out.print(j);
				if (Check.puzzle[k][j]==num && num!=0){
					//System.out.println("because Rsame"+num);
					return true;
				}
			}
		}
		}
	return false;
	}
	
}
