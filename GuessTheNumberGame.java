package Arrays;

import java.util.Random;
import java.util.Scanner;

// Guess the number game
public class GuessTheNumberGame {
    // scanner object to take input from the user
    Scanner userInput = new Scanner(System.in);
    // object to create the random numbers.
    Random randomNumber = new Random();
    int low = 1;
    int high = 100;
    int SystemGeneratedNumber = randomNumber.nextInt(high-low) + low; // only takes values between 1 and 100
    int noOfGuesses;

    // getter method for Number of Guesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // setter method for Number of Guesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    //take input from the user
    public void startGuessing() {
        System.out.println(" Ready! Lets start guessing! Enter your guessed Number: ");
        for (int i = 0; i <=noOfGuesses; i++) {

            int guessedNumber = userInput.nextInt();
            if (guessedNumber == SystemGeneratedNumber) {
                System.out.println("Hurray! You win!");
                noOfGuesses += noOfGuesses;
                System.out.println("You took " +getNoOfGuesses() + " to guess the actual number");
                break;


            } else if (guessedNumber < SystemGeneratedNumber) {
                System.out.println(" Sorry! You have entered a smaller number than the actual. Try Again!");
            } else {

                System.out.println("Oh no! You have entered a larger number than the actual. Try Again!");

            }
            noOfGuesses++;
            System.out.println("Please enter your guess again!");

        }
    }

    public static void main(String[] args) {
        GuessTheNumberGame mRef = new GuessTheNumberGame();
        mRef.startGuessing();


    }


}
