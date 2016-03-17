/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10518584;

/**
 *
 * @author opunifrimponggh
 */
import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main (String [] args)
    {
       Random r=new Random();
       Scanner input = new Scanner(System.in);
       
       int rand= 1 + r.nextInt(10);
       
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess:");
        int guess=input.nextInt();
        
        if(guess==rand)
            System.out.println("That's right, My secret number is " + rand + "!");
        else
            System.out.println("Sorry, but I was thinking of "+ rand + "."); 
    }
}
