package Sudoku;

public class Printer {
	Check check = new Check();
	
	public void puzzlePrint(){
		for(int i =0; i<Check.ROW; i++){
			for (int j=0; j<Check.COL; j++){
				System.out.print(Check.puzzle[i][j]+"  ");
			}
			System.out.println(" ");
			System.out.println("__________________________");
		}
	}



}
