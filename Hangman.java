// Intro to Java Homework from Chapter 7
// Brian C.

package chapter7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        String words[] = {"bat", "cat", "dog", "horse", "milk", "bread", "honey"};

        // get a random number no greater than the length of the array
        Random random = new Random();
        int nextNumber = random.nextInt(words.length);

        System.out.print("\033[H\033[2J"); // clear the console
        System.out.println("__________________________\n");
        System.out.println(" - - - H A N G M A N - - -");
        System.out.println("__________________________\n");
        System.out.printf("hint: your word contains %d letters\n\n", words[nextNumber].length());

        // First, create an array called 'underline' to build the underlines shown
        ArrayList< String> underline = new ArrayList< String>();
        // Second, ADD an '_' to the array for each character in the word
        for (int x = 0; x < words[nextNumber].length(); x++) {
            underline.add("_");
        }

        int lettersRight = 0;
        String randomWord = words[nextNumber]; // get the exact word from the array

        //define array to hold incorrect & all guesses before we start asking
        ArrayList< String> incorrectGuesses = new ArrayList< String>();
        ArrayList< String> allGuesses = new ArrayList< String>();

        int tries = 0; //keep track of how many total guesses it takes

        //loop while user has not guessed all right letters
        while (lettersRight < randomWord.length()) {
            System.out.print("\n\nGuess a letter: ");
              Scanner input = new Scanner(System.in);
              String letterGuessed = input.nextLine();
            
            // check if they already guessed the letter input. if so, ask again 
            if (allGuesses.contains(letterGuessed))
            {
                System.out.print("You already guessed that letter. Try another.");
            } else
              {
                allGuesses.add(letterGuessed); // keep track of users guessed letters
                if (randomWord.contains(letterGuessed))
                {
                    lettersRight = lettersRight + 1;
                    int pos = randomWord.indexOf(letterGuessed);

                    underline.set(pos, letterGuessed);

                    //print out what array now looks like with correct letter added
                    for (int item = 0; item < randomWord.length(); item++) {
                        System.out.print(underline.get(item));
                    }
                } else
                  {
                    incorrectGuesses.add(letterGuessed);

                    System.out.print("Incorrect.\nIncorrect letters so far: ");
                    System.out.printf("%s", incorrectGuesses);
                  } // end ELSE of new letter guess
                
                tries = tries + 1; // put here so we don't added to tries if duplicate letter guessed
                
              } // end ELSE of 'already guessed that letter'
        } // end main WHILE  
        
        System.out.print("\n\n!!! WINNER !!!\n");
        System.out.printf("It only took you %d tries.\n\n", tries);
        
    } //end MAIN
} // end CLASS
