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

public class CountingMachineRevisited
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Count from: ");
        int n1= input.nextInt();
        System.out.print("Count to: ");
        int n2= input.nextInt();
        System.out.print("Count by: ");
        int n3= input.nextInt();
        System.out.println();
        
        for (int i=n1; i<=n2; i+=n3)
        {
            System.out.print(i + " ");
        }
        
    }
}