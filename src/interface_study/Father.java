package interface_study;

public interface Father {
	
	       void love();
	       
	       void nature();
	       
	     default void money()
	     {
	    	 System.out.println("Father money");
	     }
	       
	       static void test()
	       {
	    	   System.out.println("Father test");
	       }

}
