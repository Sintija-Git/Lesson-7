package Lesson7;
import java.util.Scanner;

public class LinesPrinter {

	public static void main(String[] args) {
		// local variable
		String word;
		
		Scanner input = new Scanner (System.in);
		
		//input
		System.out.println("Enter one word: ");
		word = input.next(); //only one word will be counted
		
		//counter-controlled loop	
		//  p r i n t e r
		// 0 1 2 3 4 5 6
		
		int length = word.length();
		for (int i = 0; i < length; i++) {
			//retrieve the letter from the index i
			char letter  = word.charAt(i);
			//print on each line a letter
//			System.out.println(letter);
			

			//print stars*******                                           //can be used for passwords n stuff
			System.out.print("*");	
		}
		
		System.out.println ();
//		//counter controlled loop to reverse the word                      // REVERSE THE WORD YOU TYPE
		for (int j = length-1; j>=0; j--) {
//			//retrieve the letter from index i 
			char w = word.charAt(j);
			System.out.print (w);	
		

		}
	}//end class

}//end main
