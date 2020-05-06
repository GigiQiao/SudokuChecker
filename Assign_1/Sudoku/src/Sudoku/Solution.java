package Sudoku;
// if the checkAll can fit one number, then return true, if cannot fit any number, then set the position back to 0
public class Solution {
	public static int[][] puzzle;
	Check checker = new Check();
	CheckAll all = new CheckAll();
	
	
	public boolean solution(){
		for(int i=0; i<Check.ROW; i++){
		for(int j=0; j<Check.COL; j++){	
			if(Check.puzzle[i][j]==0){
				for(int num =1; num<Check.ROW+1; num++){
					if (all.checkAll(i, j, num)){
						Check.puzzle[i][j]= num;
						if(solution()){
							return true;
						}
						else{
							Check.puzzle[i][j]=0;
						}
					}
				}
				return false;
			}
			}	
			}
		return true;
			
		}

}
