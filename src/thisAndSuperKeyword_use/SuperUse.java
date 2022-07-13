package thisAndSuperKeyword_use;

public class SuperUse extends Thisuse{
	int a=500;
	

	public static void main(String[] args) {
		SuperUse sub=new SuperUse();
		sub.addition();
		
		

	}
	
	
	public void sub()
	{
	int a=800;
	int sub=a-70;// using local value of a
	System.out.println("Sub is "+sub);
	int sub1=this.a-70;// using global value of a from same class
	System.out.println("Sub1 is "+sub1);
	int sub2=super.a-70;// using global value of a from super class
	System.out.println("Sub2 is "+sub2);
	
	}
}
