package Lesson7;
import java.util.Scanner;
// IT LOOKS LIKE WE COUNT SPACES HERE, NOT WORDS WITH THIS ALL BELOW
/**
"I love Java."
SentenceCounter -- counts the number of words in a given sentence. We assume that a word is separated from another word by ONE single space character.
*/
public class SentenceCounter {

	public static void main(String[] args) {
		// declare the variable to store the sentence entered by the user
		String sentence;
		
		//declare the cariable of type Scanner and then create an obj of type scanner
		Scanner keyboard = new Scanner(System.in);
		
		//input
		System.out.println("Please enter your sentence: ");
		sentence = keyboard.nextLine(); //next line reads all line, everything that has been entered
				
		int counter = 0;
		int length = sentence.length(); //then of chars in the sentence
		
		//declare a loop control variable
		int i = 0;
		
		while (i<length) {
				//retrieve the char from the sentence located in the index i
				//as well store it into the variable c
			char c = sentence.charAt (i);
			//check whether the current char has a space ' ', if so 
			if (c == ' ') {
				counter ++; // increase the counter +1 that keeps the track the number of words seen so far
			}
			//progression to the next interation 
			i++;
		} //end while
		
		counter +=1;
		
		//output
		System.out.println("Sentence counter: " + counter);
		
		
	} //end main

}//end class
