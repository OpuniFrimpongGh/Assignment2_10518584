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

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}

// 3) Because entry has been declared earlier in the prog with the 'int' 
//    data type and so you can just use 'entry' without the data type 
//      before it in any part of the code.
// 4) It shows a continuous unbreakable display of 
      //"INCORRECT PIN. TRY AGAIN." 
      //"ENTER YOUR PIN: "
      //because there's no break statement in the loop for the execution to stop
