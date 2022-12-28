package arrays;

public class Array_study1 {

	public static void main(String[] args) {
		// RAM SEETA LAKSHMAN
		
		//array declaration
		
		String name[]=new String[4];
		
		//array Intialization
		
		name[0]="RAM";
		name[1]="SEETA";
		name[2]="lakshman";
		
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		System.out.println("======================");
		
		for (int i=0;i<=2;i++)
		{
			System.out.println(name[i]);
		}
		
		{
			System.out.println("=============");
		}
		
		for (int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		
		{
			System.out.println("=============");
		}
		
		for (int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
			
		}
		
		
		
		
		
	
		
		
		
		
		

	}

}
