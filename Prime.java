import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Prime{
  public static void main(String[] args) {

        int counter = 0;
        boolean prime = true;
        int numerator = 0;
        int denominator = 0;
        float denom;
        
        do {
            numerator++;
            denom = numerator / 2;
            denominator = (int) Math.ceil(denom);
            prime = true;
            // 19701
            for (int i = 2; i <= denominator + 1; i++){
                if(numerator % i == 0){
                    prime = false;
                }
            }
	    // System.out.println(numerator + " is " + prime);
		    // System.out.println(prime);
            if(prime){
                counter++;
            }
            
        } while(counter < 10001);
        
     System.out.println(numerator);
     System.out.println(counter);
     }

  } 
