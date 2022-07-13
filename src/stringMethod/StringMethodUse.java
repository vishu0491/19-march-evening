package stringMethod;

public class StringMethodUse {

	public static void main(String[] args) {
		
		
		     String name="Velocity";
		     //length method use 
		     
		     System.out.println(name.length());
		       
		     int lengthofstring=name.length();
		     System.out.println(lengthofstring);
		     
		     //To upper case method use
		     
		     System.out.println(name);
		     System.out.println(name.toUpperCase());
		     
		     String m=name.toUpperCase();
		     System.out.println(m);
		 
		     //to lower case method use
		     
		     System.out.println(m.toLowerCase());
		     String n=m.toLowerCase();
		     System.out.println(n);
		     
		     //equal method use
		     
		     String a="Velocity";
		     String b="Velocity";
		     String c=new String("Velocity");
		     String d=new String ("Velocity");
		     String e=new String ("VELOCITY");
		  // === compares memory locations of two operands
		  // equals method compare character sequence of two objects
		     
		     System.out.println(a=b);
		     System.out.println(c=d);
		     System.out.println("=======");
		     System.out.println(a.equals(b));
		     System.out.println(a.equals(c));
		     System.out.println(a.equals(d));
		     
		     boolean result=a.equals(c);
		     System.out.println("a and c are equal=="+result);
		     System.out.println(d.equals(e));
		     
		     
		  //   equalsIgnorecase() methodUse
		     
		     String city ="Pune";
		     String locality ="Pune";
		     String dist ="pune";
		     
		     System.out.println(city.equals(dist));
		     System.out.println(city.equalsIgnoreCase(dist));
		     System.out.println("==============");
		     
		     //contains() method use
		     
		     String k="katraj";
		     System.out.println(k.contains("ka"));
		     System.out.println(k.contains("ar"));
		     
		     System.out.println("=================");
		     
		     //is Empty method use
		     
		     String p="Test";
		     String q="";
		     String r=null;
		     String s="";
		     
		     System.out.println(q.length());
		     
		     System.out.println(p.isEmpty());
		     System.out.println(q.isEmpty());
		     System.out.println(s.isEmpty());
		     
		     System.out.println("====================");
		     
		     System.out.println(q.isBlank());
		     System.out.println(s.isBlank());
		     
		     System.out.println("=====================");
		     
		     //char At method use 
		     
		     String country ="INDIA";
		     
		     System.out.println(country.charAt(0));
		     
		     char requiredchar=country.charAt(0);
		     
		     System.out.println(requiredchar);
		     
		     //country.charAt(-1)
		     
		     System.out.println("==============");
		     
		     //end with method use
		     
		     System.out.println(country.endsWith("IND"));
		     System.out.println(country.endsWith("IA"));
		     System.out.println(country.endsWith("A"));
		     System.out.println("=======================");
		     
		     //starts with method use
		     
		     System.out.println(country.startsWith("INDIA"));
		     System.out.println(country.startsWith("IA"));
		     System.out.println(country.startsWith("I"));
		     
		     //Substring method use 
		     
		     String testing="VELOCITY CORPARATE TRANNING CENTER";
		     String resultString=testing.substring(28);
		     System.out.println(resultString);
		     
		     System.out.println(testing.substring(9,18));
		     
		     System.out.println("======================");
		     
		     //concate method study
		     
		     String x=" Pune ";
		     String y=" city ";
		     
		     
		     System.out.println(x.concat(y).concat("katraj"));
		     System.out.println();
		     
		    // index of method use 
		     
		     String state ="Maharashtra";
		     
		     System.out.println(state.indexOf(a) );
		     System.out.println(state.indexOf('a', 4));
		     System.out.println(state.lastIndexOf('a'));
		     
		     System.out.println("==================================");
		     
		     //replace method use
		     
		     String tal="Pune Mumbai Nagpur";
		    
		     System.out.println(tal.replace('P','M'));
		     System.out.println(tal.replace("Pu","Ku"));
		     System.out.println(tal.replaceAll(" ", "x"));
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		      
		     
		     
		    		 
		     

	}

}
