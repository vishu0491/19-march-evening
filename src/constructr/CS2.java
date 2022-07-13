package constructr;

public class CS2 {
	
	String city= "Pune";
	
	String name;
	

	public static void main(String[] args) {
		
		
		CS2 d=new CS2();
		d.display();
		

	}
	
	public void display()
	{
		System.out.println("I am non static Method");
		System.out.println("My city name is"+city);
		System.out.println("My name is"+name);
	}
	
	public static void display1()
	{
		System.out.println("I am  static display1 method");
	}


}
