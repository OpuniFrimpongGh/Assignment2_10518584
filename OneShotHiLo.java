package assignment2_10518584;

/**
 *
 * @author opunifrimponggh
 */
import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
    
    public static void main(String [] args)
    {
        
        
        Random r=new Random();
        Scanner input= new Scanner(System.in);
        
        int num, guess;
        num = 1 + r.nextInt(100);
        int lim=100;
        
        System.out.println("Let's play this guessing game !");
        System.out.print("Guess any number from 1-100: ");
        guess=input.nextInt();
        
        if (guess==num)
            System.out.println("Your guess is right! I was thinking of "+ num);
        else if (guess>num)
            System.out.println("You're too high! I was thinking of "+ num);
        else
            System.out.println("You're too low! I was thinking of "+ num);

        
        
        
        
        
    }
}
