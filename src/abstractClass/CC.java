package abstractClass;

public class CC extends AbstractStudy 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CC c=new CC();
		c.test();
		c.test1();
		c.test2();
		c.sample();

	}
	
	public void test()
	{
		System.out.println("this method is complete in concrete class");
	}
   
	public void sample()
	{
		System.out.println("This is own method of cc");
	}
}
