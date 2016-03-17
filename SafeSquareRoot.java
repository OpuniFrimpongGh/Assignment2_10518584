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
import java.util.Scanner;
public class SafeSquareRoot
{
   public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      int num;
      double root;
      
      
       System.out.println("SQUARE ROOT!");
       
       System.out.print("Enter a number: ");
       num=input.nextInt();
       root=Math.sqrt(num);
       
      while(num<=0)
      {
         System.out.println("You can't take square root of a negative number, silly.");
         System.out.print("Enter a number: ");
         num=input.nextInt();
         root=Math.sqrt(num);
       
         
        }
        
       System.out.println("The square root of " + num + " is " + root);
    }

}
