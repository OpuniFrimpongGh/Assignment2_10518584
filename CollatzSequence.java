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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CollatzSequence{
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        List myList = new ArrayList();
        List<Integer> numberlist;
        numberlist = new ArrayList<Integer>();
        int n;
        System.out.print("Starting nubmer: ");
        n = keyboard.nextInt();
        numberlist.add(n);
        while(n>1){
            if(n%2==0){
                n = n/2;
                numberlist.add(n);
            }
            else{
                n= (3*n)+1;
                numberlist.add(n);
            }
        }
        int lengthoflist = numberlist.size();
        int largest = numberlist.get(0);
        for (int i=1;i<lengthoflist;i++){
            if(numberlist.get(i)>largest){
                largest = numberlist.get(i);
        }
        }
        System.out.println(numberlist);
        System.out.printf("The largest value is %d",largest);
        System.out.println();
        
}
}