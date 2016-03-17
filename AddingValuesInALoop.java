/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author opunifrimponggh
 */
import java.util.Scanner;

public class AddingValuesInALoop {
    
    public static void main(String[] args){
      
        Scanner input = new Scanner(System.in);
        int num;
        int x=0;
        
        
        
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        num=input.nextInt();
        while(num!= 0)
        {
            System.out.println("The total so far is " + (x+=num));
             System.out.print("Number: ");
             num=input.nextInt();
           
                    }
        
        
            
        
    }
}
