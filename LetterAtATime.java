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

public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		for ( int i=0; i<message.length(); i++ )
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int a_count = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' )
			{
				a_count++;
			}
		}
                int e_count = 0;
                
                for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'e' || letter == 'E' )
			{
				e_count++;
			}
		}
                int i_count = 0;
                for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'i' || letter == 'I' )
			{
				i_count++;
			}
		}
                int o_count = 0;
                for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'o' || letter == 'O' )
			{
				o_count++;
			}
		}
                int u_count = 0;
                
                for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'u' || letter == 'U' )
			{
				u_count++;
			}
		}

		System.out.println("\nYour message contains the letter 'a' " + a_count + " times. Isn't that interesting?");
                System.out.println("\nYour message contains the letter 'e' " + e_count + " times. Isn't that interesting?");
                System.out.println("\nYour message contains the letter 'i' " + i_count + " times. Isn't that interesting?");
                System.out.println("\nYour message contains the letter 'o' " + o_count + " times. Isn't that interesting?");
                System.out.println("\nYour message contains the letter 'u' " + u_count + " times. Isn't that interesting?");

	}
}
// 1) I get an error because it loops out of the available values
// 2) Length is 3 ... x is in the position 2
// 3) Because when its <=message.length() it goes out of the range
//    of availabe values because when i is equal to message.length , 
//    the index cannot be refered to in the list