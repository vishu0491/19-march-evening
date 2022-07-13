package arrays;

public class Char_arrays {

	public static void main(String[] args) {
		// 1.Declaration
		
		char grade[]=new char[5];
		
		//2.assign value
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		
		//3.usages
		
		for (int i=0;i<=4;i++)
		{
			System.out.println(grade[i]);
		}

	}

}
