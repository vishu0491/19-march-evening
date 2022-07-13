package interface_study;

public interface Mother {

        void reciepe();
        
        void care();
        
       default void money()
       {
    	   System.out.println("Mother money");
       }
        
       static void test()
       {
    	   System.out.println("Mother test");
       }
	
}
