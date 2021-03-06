package Lesson7;
import java.util.Scanner;
/**
Develop an application that accepts a one word message from the user as input. The application should then encode the word and output the encoded word by reversing the word and replacing all of the vowels with numbers as
follows: a = 1, e = 5, i = 9, o = 15 and u = 21.
For example, if the user enters Programming the application should create the new word:
gn9mm1rg15rP
*/
public class Encoder {

	public static void main(String[] args) {
		
	//declarations
		String word;
		
		//declare a variable of type of Scanner called keyboard
		Scanner keyboard = new Scanner (System.in);
		
		//input
		System.out.println ("Enter one word: ");
		word = keyboard.next();
		
		//create an obj of type StrinBuffer to build the encoded word	
		StringBuffer sb =  new StringBuffer();
		
		//len  = the number of chars in the word
		int len = word.length();
		//vowels:a = 1, e = 5, i = 9, o = 15 and u = 21.
		
		for (int i= len-1; i>=0; i-=1) {
			//retrieve the char from the word located at the index i, and store in the variable l
			char l = word.charAt(i);
			if (l =='a' || l== 'A') {
				//add 1 to the encoded word
				sb.append(1);
			}else if (l == 'e' || l== 'E') {
				sb.append(5);
			}else if (l == 'i' || l== 'I') {
				sb.append(9);
			}else if (l == 'o' || l== 'O') {
				sb.append(15);
			}else if (l == 'u' || l== 'U') {
				sb.append(21);	
			}else { 
				//if the letter not vowel than add the letter itself to the coded word
				sb.append(l);	
			}
			} //end for
			
		
			// store the ecoded word into a String variable to convert the StringBuffer obj to a String
		String encoded = sb.toString();
		System.out.println("Encoded word: " + encoded);

	}//end main
}//end class
