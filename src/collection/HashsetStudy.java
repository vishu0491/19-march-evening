package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) {
		   
		HashSet hs=new HashSet();
		
		hs.add("Pune");
		hs.add("Pune");
		hs.add(null);
		hs.add(null);
		hs.add(123);
		hs.add(12.21);
		hs.add(true);
		hs.add('A');
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains('B'));
		
		// for iterator method
		
	      Iterator it=hs.iterator();
	      while (it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }
	      
		//for loop 
		
		
		for (int i=0;i<=hs.size()-1;i++)
		{
			System.out.println(hs);
		}
		
		//for each 
	      
	      for(Object o:hs)
	      {
	    	System.out.println(o);  
	      }
		
		
		

	}

	

}
