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
public class Dice {
    public static void main(String[] args){
    Random r = new Random();
    
    int x= 1 + r.nextInt(6);
    int y= 1 + r.nextInt(6);
    int z= x+y;
    System.out.println ("Roll #1: " + x);
    System.out.println ("Roll #2: " + y);
    System.out.println ("The total is " + z);
    
}
}