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

public class BabyBlackjack
{
    public static void main (String[] args)
    {
        Random r=new Random();
        int y1,y2,d1,d2, sumd, sumy;
        
        y1=1 + r.nextInt(10);
        y2=1 + r.nextInt(10);
        d1=1 + r.nextInt(10);
        d2=1 + r.nextInt(10);
        sumd=d1+d2;
        sumy=y1+y2;
        
        System.out.println("Baby Blackjack!\n");
        
        System.out.println("You drew " + y1 + " and " + y2);
        System.out.println("Your total is " + (sumy));
        System.out.println();
        
        System.out.println("The dealer has " + d1 + " and " + d2);
        System.out.println("Your total is " + (sumd));
        System.out.println();
        
        if(sumy>sumd)
        {
            System.out.println("YOU WIN!");
       
        }
        else
        System.out.println("DEALER WINS");
        
    }
}
