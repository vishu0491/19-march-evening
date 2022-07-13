package polymorphism;

public class Method_overloading {

	public static void main(String[] args) {
		
		
		Method_overloading mo=new Method_overloading();
		
		        mo.add();
		        mo.add(90,89);
		        mo.add(10, 10, 10);
		        
	}
	
	
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is"+sum);
	}
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public void add(int a,int b ,int c)
	{
		int sum =a+b+c;
		System.out.println("sum is "+sum);
	}

}
