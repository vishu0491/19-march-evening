package interface_study;

public class Son implements Father,Mother {

	public static void main(String[] args) 
	{
		Son s=new Son();
		
		s.reciepe();
		s.care();
		s.love();
		s.nature();
		s.money();
		
		Father.test();
		Mother.test();

	}

	@Override
	public void reciepe() 
	{
		System.out.println("Mother reciepe completed in son class");
		
	}

	@Override
	public void care()
	{
		System.out.println("Mother care completed in son class");
		
	}

	@Override
	public void love()
	{
		System.out.println("Father love completed in son class");
		
	}

	@Override
	public void nature() 
	{
		System.out.println("Father nature completed in son class");
		
	}

	@Override
	public void money() 
	{
		System.out.println("son money");
	     Father.super.money();
	     Mother.super.money();
	     
		
	}

}
