package genelization;

public class AXIS implements RBI
{

	@Override
	public Void saving() {
		
		System.out.println("AXIS saving acc intrest rate is 7.5% ");
		return null;
	}

	@Override
	public void FD() {
		
		System.out.println("AXIS FD acc intrest rate is 8.6% ");
		
	}

	@Override
	public void loan() {
		
		System.out.println("AXIS loan intrest rate is 9.9% ");
		
	}

	public void cashdeposite() 
	{
		System.out.println("AXIS cash deposite atm");
	}
}
