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

public class AddingValuesForLoop
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number: ");
        int num=input.nextInt();
        System.out.println();
        int sum=0;
        for (int i=1; i<=num; i+=1)
        {
            System.out.print(i + " ");
            sum+=i;
        }
        
        System.out.println("\nThe sum is " + sum);
    }
}
