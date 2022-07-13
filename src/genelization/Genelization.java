package genelization;

public class Genelization {

	public static void main(String[] args) {
	
		SBI s=new SBI();
		AXIS a=new AXIS();
		
		s.saving();
		s.FD();
		s.loan();
		s.yono();
		
		System.out.println("====================");
		
		a.saving();
		a.FD();
		a.loan();
		a.cashdeposite();
		
		System.out.println("=======================");
		
		Jio j=new Jio();
		Airtel A=new Airtel();
		VI   v=new VI();
	
		j.call();
		j.msg();
		j.data();
		j.jioSavan();
		
		System.out.println("=======================");
		
		A.call();
		A.msg();
		A.data();
		A.Airtel_gana();
		
		System.out.println("=======================");
		
		v.call();
		v.msg();
		v.data();
		v.vi();
		
		System.out.println("=======================");
		
		

	}

}
