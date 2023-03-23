package test;
public class Traingale_StarPattern {
	public static void main(String[] args) {
		int x, y, row = 5; 
		//Outer loop for rows 
		for (x=0; x<row; x++) 
		{ 
		//inner loop for space 
		for (y=row-x; y>1; y--) 
		{ 
		//To print space between two stars 
		System.out.print(" "); 
		} 
		//inner loop for columns 
		for (y=0; y<=x; y++ ) 
		{ 
		//To print star 
		System.out.print("* "); 
		} 
		//Cursor goes to the new line after printing each line.
		System.out.println();
		
	}
	}
	}
