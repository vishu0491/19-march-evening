package pattern;

public class Eg11 {

	public static void main(String[] args) {
		 // * * * * * 
		 //  * * * * 
		 //   * * * 
		 //    * * 
		 //     *

		int space=0;
		int star =5;
		
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++)
			{
				System.out.print(" *");
			}
			star--;
			space++;
			System.out.println();
		}
	}

}
