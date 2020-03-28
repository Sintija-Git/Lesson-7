package Lesson7;

public class Test {

	public static void main(String[] args) {
		
		
		String word = "repaid";
		
		for (int i = 0; i < word.length(); i++)
			System.out.print(word.charAt(i));
		
		System.out.println();
		
		for (int i = word.length()-1; i >=0; i--) //WRITES BECKWARDS this starts with index 5 (because index is one less then word length)
			System.out.print(word.charAt(i));
		
		//write word backwards but starting from the end 
	}

}
