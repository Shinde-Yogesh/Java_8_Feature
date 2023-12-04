package java_8_Feature;

import java.util.function.Predicate;

public class Predicate_Functional_Interface {

	public static void main(String[] args) {
		
		//Predicate_Functional_Interface prediacte  = new Predicate_Functional_Interface();
		//prediacte.testLength("Har vo Maura hai jisme jit ki jalak Dikati hai");
		
		// By using the Lambda Expression 
		
		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println("The length is greather than 5 :  "+ checkLength.test("Har vo Maura hai jisme jit ki jalak Dikati hai") );
		
	}
	
	
	// Genral method to do the string length 
	/*public boolean testLength(String s)
	{
		 if(s.length()>5)
		{
			return true;
		}
		return false;
	}*/

}
