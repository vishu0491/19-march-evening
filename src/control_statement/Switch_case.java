package control_statement;

public class Switch_case {

	public static void main(String[] args) {
		// year 1---->Welcome to 1st year engineering
		// year 2---->Welcome to 2nd year engineering
		// year 3---->Welcome to 3rd year engineering
		// year 4---->Welcome to 4th year engineering
		//year default----->please enter year between-1-4
		
		
		int year=5;
				switch (year) {
				case 1 :System.out.println("Welcome to 1st year engineering");
					
					break;
				case 2 :System.out.println("Welcome to 2nd year engineering");
				    break;
				case 3 :System.out.println("Welcome to 3rd year engineering");
				    break;
				case 4 :System.out.println("Welcome to 4th year engineering"); 
				    break;

				default:System.out.println("please enter year between1-4");
					break;
				}
				
				
        //PNQ---->Welcome to Pune Airport
		//BOM---->Welcome to Mumbai Airport
		//NGP---->Welcome to Nagpur Airport
				
				
				String city ="NGP";
				     switch (city) {
					case "PNQ":System.out.println("Welcome to pune airport");
						
						break;
						
					case "BOM":System.out.println("Welcome to Mumbai airport ");	
					    break;
					case "NGP":System.out.println("Welcome to Nagpur Airport "); 
					    break;
					    
					   

					default:System.out.println("please enter valid code");
						break;
					}
				     
				     
		//1---->Today is Sunday
	    //2----->Today is Monday
		//3----->Today is Tuesday
		//4----->Today is Wednesday
		//5----->Today is Thursday
	    //6----->Today is Friday
		//7----->Today is Saturday
				     
				     int Day=8;
				       switch (Day) {
					case 1 :System.out.println("Today is sunday");
						
						break;
					case 2 :System.out.println("Today is Monday");
					    break;
					    
					case 3 : System.out.println("Today is Tuesday"); 
					    break;
					case 4 :System.out.println("Today is Wednesday");
					    break;
					case 5 :System.out.println("Today is Thursday");
					    break;
					case 6:System.out.println("Today is Friday");
					    break;
					case 7:System.out.println("Today is Saturday");
					    break;
				 

					default:System.out.println("please enter name in between sunday to sturday"); 
						break;
					}
				       
				      
				       
	// JAN---->this is 1st month of year
	//Feb--->			       
				
	}

}
