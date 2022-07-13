package collection;

import java.util.ArrayList;
import java.util.Iterator;

import javax.tools.FileObject;

public class ArrayListUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList al = new ArrayList();
		 
		 al.add("Velocity");//0
		 
		 al.add("May-21");//1
		 al.add(90);//2
		 al.add('A');//3
		 al.add(99.99f);//4
		 al.add("Velocity");//5
		 al.add(null);//6
		 al.add(null);//7
		 
		 System.out.println(al);
		 System.out.println(al.size());
		 System.out.println(al.indexOf("Velocity"));
		 System.out.println(al.lastIndexOf("Velocity"));
		 System.out.println(al);
		 al.set(3,'B');
		 System.out.println(al);
     	 System.out.println(al.isEmpty());
		 System.out.println(al.contains(93));
		 System.out.println(al.get(5));
		 System.out.println(al);
		 
		 al.add(1,"MorningBatch");//");// right shift--> when you are inserting element in between arraylist
//		 
		 al.remove(1);
//		 
     	 System.out.println(al);
		 Iterator it= al.iterator();
		 
		 While(it.hasNext());
		 {
			 System.out.println(it.next());
		 }
		 
		 for(int i=0;i<=al.size()-1;i++)
		 {
			 System.out.println(al.get(i));
		 }
		 
		 for(Object o:al)
		 {
			 System.out.println(o);
		 }
		 
		
		 
	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}
}


