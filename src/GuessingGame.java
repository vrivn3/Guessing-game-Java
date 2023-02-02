
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game");
        guess();
    }

public static void guess()
{
    //taking the user input
    Scanner userNumber= new Scanner(System.in);

    int guessed;
    //keeping track of the number of trials
    int trials=2;
    int i=0;
    int k=trials+1;

    //choosing a random number
    int randomNum= (int)Math.floor(Math.random() *(100 - 0 + 1) + 0);

    System.out.println("The computer randomly chose a number between 1 and 100. Guess the number within "+ k + " trials");

    do{
        i++;

        System.out.println("Trial "+ i);

        guessed=userNumber.nextInt();

        if(guessed==randomNum && k==3 )
        {
            System.out.println("Congratulations!! You have a computer mind");
            break;
        } else if (guessed==randomNum && k<3) {
            System.out.println("Congratulations! (it took you more than 1 trial thought)");
            break;
        } else if (randomNum>guessed) {
            System.out.println("Oops, the computer number is greater than your guess");

        } else if (randomNum<guessed) {
            System.out.println("Oops, the computer number is smaller than your guess");
        }

        k--;

        if(k==0)
        {
            System.out.println("Sorry you have unsuccesfully used all of your trials");

            System.out.println("The computer number was "+ randomNum);
            break;
        }
        trials--;

    }while(trials>=0);

}






}