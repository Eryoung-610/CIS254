
import java.util.Scanner;

public class WordCruncherTest

{

	public static void main(String args[])

	{

		String word;

		// Reading a word

		Scanner sc = new Scanner(System.in);

		System.out.print("\n Enter a word (quit to stop reading..): ");

		word = sc.nextLine();

		// Loop till user wants to quit

		while (!word.equals("quit"))

		{

			// Performing all operations and printing the results to console

			WordCruncher obj = new WordCruncher(word);

			System.out.println("\n Number of letters: " + obj.numLetters() + " \n");

			System.out.println("\n Number of vowels: " + obj.numVowels() + " \n");

			System.out.println("\n Reverse: " + obj.reverse() + " \n");

			System.out.println("\n Pig Latin Version: " + obj.toPigLatin() + " \n");

			System.out.println("\n Gibberish Version: " + obj.toGibberish() + " \n");

			// Reading a character

			System.out.print("\n Enter a Character: ");

			char ch = sc.next().charAt(0);

			System.out.println("\n Number of occurrences of character: " + obj.numCharOccurrences(ch) + " \n");

			sc.nextLine();

			// Reading word again

			System.out.print("\n\n Enter a word (quit to stop reading..): ");

			word = sc.nextLine();

		}

		System.out.println("\n\n");

	}

}