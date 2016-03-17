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
public class RightTriangleChecker
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Enter three integers: ");
        System.out.print("Side 1: ");
        s1=input.nextInt();
        //System.out.print();
        System.out.print("Side 2: ");
        s2=input.nextInt();
        
        while(s2<s1)
        {
            System.out.println(s2 + " is smaller than " + s1 + ". Try again");
            System.out.print("Side 2: ");
            s2=input.nextInt();
        }
        
        System.out.print("Side 3: ");
        s3=input.nextInt();
        
         while(s3<s2)
        {
            System.out.println(s3 + " is smaller than " + s2 + ". Try again");
            System.out.print("Side 3: ");
            s3=input.nextInt();
        }
        
        System.out.println("Your three sides are " + s1 + " " + s2 + " " + s3);
        
        if (s1!=s2 && s2!=s3 && s1!=s3)
        {
           System.out.println("These sides *do* make a right triangle. Yippy-skippy!"); 
        }
        else
          System.out.println("NO! These sides do not make a right triangle");
    }
}
