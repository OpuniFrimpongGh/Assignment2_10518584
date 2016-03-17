package assignment2_10518584;

/**
 *
 * @author opunifrimponggh
 */
import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {
    
    public static void main(String [] args)
    {
        
        
        Random r=new Random();
        Scanner input= new Scanner(System.in);
        
        int num, guess;
        num = 1 + r.nextInt(100);
        int tries=1;
        
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses");
        System.out.print("First guess: ");
        guess=input.nextInt();
        
        while (tries<7 && guess!=num)
        {
            if (guess==num)
            { System.out.println("You guessed it! What are the odds?");
               break;
            }
            
            if (guess>num)
               System.out.println("Sorry, you're too high.");
            if(guess < num)
               System.out.println("Sorry, you're too low.");
              
            System.out.print("Guess #"+ (tries+1) + ": ");
            guess=input.nextInt();
               
                tries++;
        }
           if (guess!=num)
              System.out.println("Sorry, you didn't get it in " + (tries)
            + " tries. You lose.");
            
            

        
        
        
    }
}

// 1) Yes

//