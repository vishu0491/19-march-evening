package control_statement;

public class Elseif_study {

	public static void main(String[] args) {
		// if your marks--->=66...>you are in distinction
		//else if marks -->=60<66--> you are in 1st class
		//else if marks --->55<60--->you are in 2nd class
		//else if marks   >=40 and <50-> you are in just pass
		//else if ---->you are fail
		
		int marks=85;
		
		if (marks>=80)
			
		{
			System.out.println("you are in distinction");
			
		}
		
		else if(marks>=60& marks<66)
		
		{
			System.out.println("you are in 1st class");
		}
		
		else if(marks>=55 & marks<60)
		
		{
			System.out.println("you are in 2nd class");
		}
		
		else if(marks>40 &marks<50)
		
		{
			System.out.println("you are in just pass");
		}
		
		else {
			System.out.println("you are fail");
		}
		
			
			
		 // If you are in Pune === you are in maharashtra
		//else if you are in dhili = you are not in maharashtra
		//else if you are in surat === you are in gujrat
		//else if you are in
		
		String city = "Mumbai";
		
		if (city=="Pune")
		
		{
			System.out.println("you are in maharashtra");
		}
		
		else if (city=="Mumbai")

		{
			System.out.println("you are in maharashtra");
		}
		
		else if (city=="Nagar")
			
		{
			System.err.println("you are in maharashtra");
			
		}
		
		else
		{
			System.out.println("you are not inmaharshtra");
		}
		
		
		
				
		
		} 
		
		
		
		
			
		

	}


