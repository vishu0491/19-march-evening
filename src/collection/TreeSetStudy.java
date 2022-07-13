package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		 TreeSet t=new TreeSet();
		 
		 t.add(90);
		// t.add("pune");
		 t.add(10);
		 t.add(80);
		 t.add(123);
	//	 t.add(null);
		 //t.add(null);
		 
		 
		 System.out.println(t);
		 System.out.println(t.size());
		 System.out.println(t.contains(80));
		 System.out.println(t.pollFirst());
		 System.out.println(t.last());
		 //System.out.println(t.higher(t));
		 System.out.println(t);
		 System.out.println("=======================");
		 
		 // for iterator method
		 Iterator it=t.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 System.out.println("=======================");
		 
		 //for loop method 
		 for (int i=0;i<=t.size()-1;i++)
		 {
			 System.out.println(i);
		 }
		
		 System.out.println("=======================");
		 
		 // for each method 
		 
		 for(Object o:t)
		 {
			 System.out.println(o);
		 }

	}

}
