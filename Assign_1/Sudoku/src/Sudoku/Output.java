package Sudoku;

import java.io.*;
import java.util.*;



public class Output {
	// create object for the method from other classes
	RowCheck rowchecker = new RowCheck();// create object for the method from RowCheck
	Check checker = new Check();//
	Printer printer = new Printer();//create object for the method from Printer
	Solution result = new Solution();// create object for the method from Solution that recursively to get the final result
	Valid valid = new Valid();

	public void solve() {
		checker.read();// read from the original file to know the original puzzle	
	try{
		Check.input = new Scanner (Check.file);
		while(Check.input.hasNextInt()){
		for (int i=0; i<Check.COL; i++){
			for (int j = 0; j<Check.ROW; j++){
			int number = Check.input.nextInt();
					Check.puzzle[i][j]= number;
					//System.out.println(number);
				}
			}
		}
	}	
	//System.out.println(puzzle[1][0]);
	catch (FileNotFoundException e){
		e.printStackTrace();
	}
	//System.out.println("Question Puzzle: ");
	// begin to check if the puzzle is valid or not
	if(valid.validCheck()){
		System.out.println("The following is an invalid start board: ");
		System.out.println("");
		printer.puzzlePrint();// print the unsolved original the puzzle
		
	}// for the condition that shows in the Valid.java class, if the one or more conditions return true, 
	//then the puzzle is invalid, return the original puzzle and do not need further solution check
	else{
		System.out.println("The following is an valid puzzle: ");
		System.out.println(" ");
		printer.puzzlePrint();// print the unsolved original the puzzle
	// the conditions shows in the Valid.java class all return false, then the class is valid to solve
		// go through further solve process
	if(result.solution()){
		System.out.println("");
		System.out.println("");
		System.out.println("Answer: ");
		printer.puzzlePrint();
		System.out.println("The puzzle solution for the puzzle showing above.");
		//printSolution();
	}
	else{
			System.out.println("");
			System.out.println("");
			System.out.println("Answer: ");
			System.out.println("The following is a puzzle which has no solution");
		
	}
	
		}
	}
}
