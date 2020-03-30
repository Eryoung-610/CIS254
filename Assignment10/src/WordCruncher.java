
/*
 * Eric Young
 * CIS254
 * May 6th, 2019
 * Professor Harden
 * Assignment 10
 * 
 * This program of WordCruncher has several methods that will take an inputed word from the user and return the number of letters, number of vowels, convert the word into pig latin and gibberish, 
 * reverses the word, and counts how many times a specific letter is within the word. This program also has a test class to ensure that the methods work as intended and will return the desired
 * information.
 * 
 */

import java.util.*;
import java.lang.*;

public class WordCruncher

{

	String word;

	//Default constructor, leaving it as default in the event that there is no word. 

	public WordCruncher()

	{

		word = "default";

	}

	//Constructor with a string parameter, checks if the word contains any punctuation marks or spaces.

	public WordCruncher(String str)

	{

		boolean punctuation = false, space = false;

		for (int i = 0; i < str.length(); i++)

		{

			switch (str.charAt(i))

			{

			case '.':

			case ',':

			case ':':

			case ';':

			case '!':

				punctuation = true;

				break;

			default:
				break;

			}

		}


		if (str.contains(" "))

			space = true;


		if (space == true || punctuation == true)

			word = "default";

		else

			word = str;

	}

	//Method that checks for the total number of letters within the inputed word. Utilizes a for loop and returns the amount of letters when called.

	public int numLetters()

	{

		int letters = 0;

		// Counting number of letters

		for (int i = 0; i < word.length(); i++)

		{

			if (!Character.isDigit(word.charAt(i)))

				letters++;

		}

		return letters;

	}

	//Method that checks the total number of vowels within the inputed word. Utilizes a for loop and a switch case for the vowels. 

	public int numVowels()

	{

		String w = word.toLowerCase();

		int vowelCnt = 0;

		// Counting vowels

		for (int i = 0; i < w.length(); i++)

		{

			switch (w.charAt(i))

			{

			case 'a':

			case 'e':

			case 'i':

			case 'o':

			case 'u':

				vowelCnt++;

				break;

			default:
				break;

			}

		}

		return vowelCnt;

	}

	//Method that checks if the word begins with a vowel. Utilizes a switch case for said vowels.

	public boolean beginsWithVowel()

	{

		String w = word.toLowerCase();

		// Checking for vowel

		switch (w.charAt(0))

		{

		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':

			return true;

		default:
			return false;

		}

	}

	//Method that converts the inputed word into pig latin. Simple if-else statement is used to make this method work.

	public String toPigLatin()

	{

		String pigLatin = "";


		if (beginsWithVowel())

		{

			pigLatin = word + "way";

		}

		else

		{

			for (int i = 1; i < word.length(); i++)

			{

				pigLatin += word.charAt(i);

			}

			pigLatin += word.charAt(0) + "ay";

		}

		return pigLatin;

	}

	//Method that converts the inputed word into gibberish. Simple if-else statement in addition to a for loop make this method complete.

	public String toGibberish()

	{

		String gibberish = "";

		if (beginsWithVowel())

		{

			gibberish = "ithag" + word;

		}

		else

		{

			gibberish = word.charAt(0) + "ithag";

			for (int i = 1; i < word.length(); i++)

			{

				gibberish += word.charAt(i);

			}

		}

		return gibberish;

	}

	//This method reverses the inputed word. For loop is used to complete this method.

	public String reverse()

	{

		String reverse = "";

		for (int i = word.length() - 1; i >= 0; i--)

			reverse = reverse + word.charAt(i);

		return reverse;

	}

	//This method counts for the number of a specific letter in the inputed word. (Ex. I want to check for how many letters of "I" are in California, this method will return 2.)

	public int numCharOccurrences(char ch)

	{

		int count = 0;

		for (int i = 0; i < word.length(); i++)

		{

			if (word.charAt(i) == ch)

				count++;

		}

		return count;

	}

}


/*OUTPUT

Enter a word (quit to stop reading..): California

Number of letters: 10 


Number of vowels: 5 


Reverse: ainrofilaC 


Pig Latin Version: aliforniaCay 


Gibberish Version: Cithagalifornia 


Enter a Character: i

Number of occurrences of character: 2 



Enter a word (quit to stop reading..): quit



*/