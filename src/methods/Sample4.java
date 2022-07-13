package methods;

public class Sample4 {

	public static void main(String[] args) {
		Sample4 m1=new Sample4();
		m1.m1();
		m1.m2();
		Sample5 m=new Sample5();
		 m.m3();
		 m.m4();

	}
	public void m1()
	{
		System.out.println("Running non static regular method m1");
	}
	
	public void m2()
	{
		System.out.println("Running non static regular method m2");
	}
	

}
