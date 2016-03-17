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
public class Nim {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int A = 3;
        int B = 4;
        int C = 5;
        String player1,player2;
        String pile;
        int number;
        System.out.printf("Player1, Enter your name: ");
        player1 = keyboard.next();
        System.out.printf("Player1, Enter your name: ");
        player2 = keyboard.next();
        System.out.printf("A: %d\tB: %d\tC: %d \n",A,B,C);
        while((A+B+C)>0){
            System.out.printf("%s, Choose a pile: ",player1);
            pile = keyboard.next();
            System.out.printf("How many to remove from pile %s ",pile);
            number = keyboard.nextInt();
            
            if(pile.equals("A")){
                A -= number;
            }
            else if (pile.equals("B")){
                B -= number;
            }
            else if (pile.equals("C")){
                C -= number;
            }
            else{
                int last;
            }
            System.out.printf("A: %d\tB: %d\tC: %d \n",A,B,C);
        }
    }
}