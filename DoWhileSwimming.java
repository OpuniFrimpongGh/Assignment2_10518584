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

public class DoWhileSwimming
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);

		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS ";

		double minimumTemperature = 79.0; // degrees Fahrenheit
		double currentTemperature;
		double savedTemperature;
		int swimTime;

		System.out.print("What is the current water temperature? ");
		currentTemperature = keyboard.nextDouble();
		savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer1 + " approaches the lake...." );

		swimTime = 0;
		while ( currentTemperature >= minimumTemperature )
		{
			System.out.print( "\t" + swimmer1 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600); // pauses for 600 milliseconds
			currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
		}

		System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

		currentTemperature = savedTemperature; // restores original water temperature

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer2 + " approaches the lake...." );

		swimTime = 0;
		do
		{
			System.out.print( "\t" + swimmer2 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600);
			currentTemperature -= 0.5;
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

		} while ( currentTemperature >= minimumTemperature );

		System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
	}
}

// 1) Yes

// 2) This time round Gallant does swim at all but Goofus swims for 1 minute.

// 3) He checks the water temperature first.

// 4) He just dives in

// 5) A while loop checks whether the condition is true befor it 
//    executes the statements where as do-while executes the statement 
//    once and then tests the condition to know if it's true then continues with the execution

// 6) The while loop is the "pre-test loop" and the do-while loop is the "post-test loop"