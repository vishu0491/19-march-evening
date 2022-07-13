package accessspecifiers;

public class PrivateUse {

	public static void main(String[] args) 
	{
		PrivateUse pu=new PrivateUse();
		pu.test1();
		pu.test2();
		pu.test3();
		pu.test4();

	}
	
	private void test1()
	{
		System.out.println("hi this is private method");
	}
	
	void test2()
	{
		System.out.println("hi this is void method");
		
	}
	
	protected void test3()
	{
		System.out.println("hii this is protected void method");
	}
	
	public void test4()
	{
		System.out.println("hii this is public void method");
	}
	
	
	

}
