package constructr;

public class CS3 {
     
	   int num1;
	   int num2;
	   int num3;
	   
	   public CS3()
	   {
		   num1=10;
		   num2=20;
		   num3=30;
		   
		   
	   }
	   
	   
	   public CS3 (int a)
	   {
		   num1=a;
		   
	   }
	   
	   public CS3(int a,int b)
	   {
		   num1=a;
		   num2=b;
				   
	   }
	   public CS3(int a,int b,int c)
	   {
		   num1=a;
		   num2=b;
		   num3=c;
	   }

	public static void main(String[] args) {
		
		
		CS3 C1=new CS3();// Object created with default value zero
		   C1.addition();
		   
		CS3 C2=new CS3(100);  //Object created with some default value
		    C2.addition();
		    
		CS3 C3=new CS3(80,90);
		    C3.addition();
		    
		CS3 C4=new CS3(70,80,90);
		    C4.addition();
		   
	}
	

	public void addition()// non static method
	{
		int sum= num1+num2+num3;
		System.out.println("Addition is "+sum);
	}
	

	
		
	}


