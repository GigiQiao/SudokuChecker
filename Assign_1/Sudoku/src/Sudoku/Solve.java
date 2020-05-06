package Sudoku;

import java.util.*;

// This program is to solve the Sudoku
/*
 * 1. read the file by using scanner, enter the file name and use scanner to read the file(Check.java) is the method that read the file
 * 2. check if the column, row or square have the same number already, if it already have the same number, then it is invalid already,
 * 		do not need further check, return invalid result
 * 3. if the second check is valid, then make the solution for the Sudoku, it is possible to be valid but have no solution
 */

public class Solve {
	// create object for the method from other classes
	Output output = new Output();


//for this class
public Solve (){
	for(;;){
	output.solve();
	System.out.println("Do you want to continue??");
	System.out.println("Countinue: Y.    Not Continue: Others");
	Check.input = new Scanner (System.in);
	String choice = Check.input.nextLine();
	if(choice.equals("y")){
		output.solve();		
	}
	else{
		break;
	}
}
}


		

public static void main(String[] args) {new Solve();}
	
}
