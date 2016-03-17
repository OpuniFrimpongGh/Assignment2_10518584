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
public class AgainWithTheNumberGuessing  {
    public static void main (String [] args)
    {
       Random r=new Random();
       Scanner input = new Scanner(System.in);
       
       int rand= 1 + r.nextInt(10);
       
        System.out.println("I have chosen a number from 1 to 10."
                + " Try to guess it.");
        System.out.print("Your guess:");
        int guess=input.nextInt();
        int tries=1;
        
         do
         {
            System.out.println("That's incorrect. Guess again.");
             System.out.print("Your guess:");
             guess=input.nextInt();
             tries++;
         }
        while (guess!=rand);
        if(guess==rand)
            System.out.println("That's right ! You're a good guesser.");
            System.out.print("It only took you " + tries +" tries.");
        
    }
}