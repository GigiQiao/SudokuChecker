package Sudoku;

import java.io.File;
import java.util.Scanner;
// check class is use to read the original puzzle from the text file

public class Check {
	
	public static Scanner input;
	public static String fileName;
	public static File file;
	public static int[][] puzzle;

	public final static int ROW = 9;
	public final static int COL = 9;
	
	
public void read(){	
	puzzle = new int [ROW][COL];
	System.out.println("Please enter the Sudoku file name: ");
	input = new Scanner (System.in);
	fileName = input.nextLine();
	file = new File (fileName);
}
	
}
