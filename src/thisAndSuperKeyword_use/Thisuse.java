package thisAndSuperKeyword_use;

public class Thisuse {
	    int a=100;
	    int b=600;
	    static int c=10;
	    

	public static void main(String[] args) {
		Thisuse t=new Thisuse();
		t.addition();

	}
	
	public void addition()
	{
		int a=10;
		
		int sum=a+900;
		System.out.println("Addition is"+sum);
	
		int sum1=this.a+900;// calling global value of a using this keyword
		System.out.println("Addition is "+sum1);
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of a is "+this.a);

		
	}

}
