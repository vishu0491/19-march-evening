package logicalPrograms;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		 
		//System.out.println(11/2);
		//System.out.println(11%2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value");
		int a=sc.nextInt();
		
		if (a%2==0)
		{
			System.out.println("Number is Even number");
		}
		else
		{
			System.out.println("Number is odd number");
		}

	}

}
