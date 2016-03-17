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

public class BabyNim {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int A=3;
        int B=3;
        int C=3;
        
       System.out.println("A: " + A +"\tB: " + B + "\tC: "+ C);
       System.out.println();
       while (A>=0 && B>=0 && C>=0)
       {System.out.print("Choose a pile: ");
       String p=input.next();
       System.out.print("How many to remove from pile "+ p + ": ");
       int p1=input.nextInt();
       if (p.equals("A"))
       {
           A-=p1;
          
       }
       else if (p.equals("B"))
       {
           B-=p1;
          
       }
       else if (p.equals("C"))
       { 
           C-=p1;
         
       }
       System.out.println();
       System.out.println("A: " + A +"\tB: " + B + "\tC: "+ C);
       System.out.println();
       
       }
    }    
}
