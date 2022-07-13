package genelization;

public class SBI implements RBI
{

	@Override
	public Void saving() {
		
		System.out.println("SBI saving ACC intrest rate is 7% ");
		return null;
	}

	@Override
	public void FD() {
		
		System.out.println("SBI FD acc intrest rate is 8% ");
		
	}

	@Override
	public void loan() {
		
		System.out.println("SBI loan intrest rate is 11.99% ");
		
	}
	
	public void yono()
	{
		System.out.println("SBI has yono for mobile banking ");
	}

	
	
}
