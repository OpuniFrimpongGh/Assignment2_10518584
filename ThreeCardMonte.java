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
public class ThreeCardMonte {

    
    public static void main(String[] args) {
       int x; 
      Scanner input = new Scanner(System.in);
      
      System.out.println("Which one is the ace?");
      System.out.println("\t##  ##  ##");
      System.out.println("\t##  ##  ##");
      System.out.println("\t1   2   3");
      System.out.print("=>");
      x=input.nextInt();
      
      if (x==2)
          System.out.println("You nailed it! fast Eddie reluntantly hands"
                  + " over your winnings, scrowling.");
      else
          System.out.println("Ha! Fast Edie wins again! the ace was card"
                  + " number 2");
      
      System.out.println("\t##  AA  ##");
      System.out.println("\t##  AA  ##");
      System.out.println("\t1   2   3");
      
      
      
        
    }
    
}
