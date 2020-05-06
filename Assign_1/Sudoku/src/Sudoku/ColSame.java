package Sudoku;

public class ColSame {
	public static int[][] puzzle;
	Check checker = new Check();
	
	public boolean colsame(){
		for(int k =0; k<Check.COL; k++){
		for (int i=0; i<Check.ROW; i++){
			int num = Check.puzzle[i][k];
			//System.out.print(num);
			for(int j =i+1; j<Check.ROW; j++){
				//System.out.print(j);
				if (Check.puzzle[j][k]==num && num!=0){
					//System.out.println("because Csame"+num);
					return true;
				}
			}
		}
		}
	return false;
	}
	
}
