package inhertance;

public class SingleLevel_Inhertance {

	public static void main(String[] args) {
		// TO call mother non static property i need mother object
		
		
		Mother m=new Mother();// creat object of mother class 
		
		Child c=new Child(); //creat object of child class
		
		m.nature(); //calling mother property
		Mother.care();//calling mother property
		
		c.mobile();
		Child.laptop();
		
		
		
		
		
		
	}

}
