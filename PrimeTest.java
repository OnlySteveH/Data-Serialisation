import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class PrimeTest{
  public static void main(String[] args) {

        int counter = 2;
        boolean prime = true;
        int numerator = 0;
        int denominator = 0;
        float denom;
        
       
            numerator = 19701;

            denom = numerator / 2;

            denominator = (int) Math.ceil(denom);
	    System.out.println("Denominator is " + denominator);
            prime = true;
            
            for (int i = 2; i <= denominator; i++){
                if(numerator % i == 0){
		    prime = false;
                }
	        System.out.println(numerator + " % " + i + " is " + numerator % i);
            }
	    System.out.println(numerator + " is " + prime);
		    // System.out.println(prime);
            
     System.out.println(numerator);

     }

  } 
