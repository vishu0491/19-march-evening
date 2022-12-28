package abstractClass;

import java.util.Scanner;


public class Prime_number {
	
	  String PrimeTime(double num) { 
	 
	    for (int i = 2; i < Math.sqrt(num); i++){
	      if (num % i == 0){
	        return "false";
	      }
	    }
	        
	    return "true";
	     
	  }      
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    // keep this function call here     
		    Scanner  s = new Scanner(System.in);
		    Prime_number c = new Prime_number();
		  //  System.out.print(c.PrimeTime(s.nextLine())); 
		     
		  }


	
	
	  

	}


