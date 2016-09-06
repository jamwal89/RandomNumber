
import java.util.Random;

public class Dice
 {
    public static void main( String[] args )
    
    {
    	output("Roll your Dice");
        int dienumber = 0;
        Random rnd = new Random ();
        
        for (int i=1;i<=6;i++)
        dienumber = 1 + rnd.nextInt(6); 
        
       output("Your die roll was : " + dienumber);
        
        
    }
    private static void output(String aMessage)
    {
      System.out.println(aMessage);
    }
   
 }

