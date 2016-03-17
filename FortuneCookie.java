package assignment2_10518584;

/**
 *
 * @author opunifrimponggh
 */

import java.util.Random;

public class FortuneCookie {
    
    public static void main(String [] args)
    {
        Random r=new Random();
        
        int fortune = 1 + r.nextInt(6);
        
        int f1,f2,f3,f4,f5,f6;
        
       f1= 1 + r.nextInt(54);
       f2= 1 + r.nextInt(54);
       f3= 1 + r.nextInt(54);
       f4= 1 + r.nextInt(54);
       f5= 1 + r.nextInt(54);
       f6= 1 + r.nextInt(54);
       
       if (fortune == 1)
           System.out.println("You'll flourish in your business!");
       
       if (fortune == 2)
           System.out.println("You'll live long!");
       
       if (fortune == 3)
           System.out.println("You'll have a wonderful spouse!");
       
       if (fortune == 4)
           System.out.println("You'll excel greatly!");
       
       if (fortune == 5)
           System.out.println("You're blessed!");
       
       if (fortune == 6)
           System.out.println("You're an awesome individual!");
        
        
     
           System.out.println(f1+"-"+f2+"-"+f3+"-"+f4+"-"+f5+"-"+f6);
    }
    
}
