package logicalPrograms;

public class Door_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  length=101;
		int arr[]=new int[length];
		
		System.out.println("o is closed");
		System.out.println("1 is opened");
		
		for (int i=3;i<length;i++)
		{
			for (int j=i;j<100;j=j+1)
			{
				if (arr[j]==0)
				{
					arr[j]=1;// door opened
				}
				else if (arr[j]==1)
				{
					arr[j]=0;// door closed
				}
			}
		}
		System.out.println("The below door are open");
		for (int i=1;i<length;i++)
		{
			if(arr[i]==1)
			{
				System.out.println(i);
			}
		}
	}

}
