import java.util.Random;


public class RandomActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 output("Generate random integers between 5 and 95");
		    
		        

		        Random rnd = new Random();
		       
		        
		        for (int i = 1; i <= 10; i++)
		        {
		          int randomInt = 5 + rnd.nextInt(95);
		          output("Generated number: " + randomInt);
		        }
		    
		        System.out.println("Done.");
		    }
		
	 private static void output(String aMessage)
	  {
	    System.out.println(aMessage);
	  }
	}


