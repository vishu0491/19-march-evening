package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet is=new LinkedHashSet();
		
		is.add("Pune");
		is.add("Pune");
		is.add('A');
		is.add(1230);
		is.add(12.234);
		is.add(null);
		is.add(null);
		is.add(true);
		
		System.out.println(is);
		System.out.println(is.size());
		System.out.println(is.contains('A'));
		System.out.println(is);
		System.out.println("=======================");
		
		// for iterator method
		Iterator it=is.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=======================");
		
		// for loop
		
		for(int i=0;i<=is.size()-1;i++)
		{
			System.out.println(is);
		}
		
		System.out.println("=======================");
		
		
		// for Each loop 
		for(Object o:is)
		{
			System.out.println(is);
		}
		
		System.out.println("=======================");
		
		
	}

}
