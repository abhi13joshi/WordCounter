package WordCounter;
import java.util.Scanner; //Java package for user input
//Abhi Joshi
public class WordCount { //WordCount class that runs through the main method
	 public static void main (String[] args) { //Main method
		 Scanner scanner = new Scanner(System.in); //Scanner function
		 System.out.println("Welcome to the Word Counter!");
		 System.out.println("Enter text here: "); //Message displayed for user to input text
		 String word = scanner.nextLine(); //Converts input into a string
		 System.out.println("There are " + Count(word) + " words"); //Displays number of words that are typed by the user
	 }
	 public static int Count(String word) { //Method for counting the number of words
		 int text = 0; //Loop variable for if there is a space between a character to count it as a word
		 int i = 0; //Loop variable
		 int numOfWords = 0; //Variable for counting the number of words
		 while(i < word.length()) { //Conditional loop for deciphering words within a inputted string
			 if (word.charAt(i) == ' ' || word.charAt(i) == '\n' || word.charAt(i) == '\t') //Conditions for deciding if a group of characters are words
				 text = 0; 
			 else if(text == 0) { //If there's no more text then the number of words is counted
				 text = 1;
				 ++numOfWords; //Prefix increment operator
			 }
			 ++i; //Prefix increment operator
		 }
		 return numOfWords; //Returns the number of words to the String "word"
	 }	 
}
