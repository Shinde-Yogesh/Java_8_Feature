package java_8_Feature;

import java.util.Arrays;
import java.util.List;

public class Method_Refferance {

	public static void main(String[] args) {
		
		//FunctionalInterface funtion_interface = Test :: testImplementation;
		
		// Functional Inteface in java
		Functional_Interface f = ()-> System.out.println("Method implementation");

		f.singleAbstractMethod();
	
	
		// new example
		
		// here is the println is an method
		//:: is an operator
		//out is an oubject of class which we have to refer the method
		//and System is class of which we have to refer the method 
		List<String> list = Arrays.asList("Vijay Nagar", "Kopwada","Satya Nagari","Kochi");
		System.out.println(list);
		list.forEach(System.out::println);
	}

}

class Test
{
	public static void testImplementation()
	{
		System.out.println("This is the test implementation of your abstract Method ");
	}
}