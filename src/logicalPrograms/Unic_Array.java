package logicalPrograms;

import java.util.Scanner;

public class Unic_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int temp,i,flag=0;
          int a[]=new int[10];
          Scanner s=new Scanner(System.in);
          System.out.println("Enter values :  ");
          for( i=0;i<5;)
          {
                      temp=s.nextInt();
                      flag=0;
                      if(temp>10 && temp<100)
                      {
                                  for(int j=0;j<i;j++)
                                              if(a[j]==temp)
                                                          flag=1;
                                  if(flag==0)
                                  {
                                              a[i]=temp;
                                              i++;
                                  }
                                  else
                      System.out.println("Number already entered. Enter another value : ");
                      }
                      else
                      System.out.println("Number not in range. Enter another values : ");
          }
          System.out.println("Numbers in the array are : "); 
          for(int j=0;j<5;j++)
                      System.out.println(a[j]);
}

	}


