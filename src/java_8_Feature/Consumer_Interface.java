package java_8_Feature;

import java.util.function.Consumer;

public class Consumer_Interface {

	public static void main(String[] args) {
		// here consumer is an interface
		// it have one accept method
		// best thing about the consumer it is functional interface so we can use Lambda expression
		Consumer<Integer>  square = (i)-> System.out.println("The Square is : "+ i * i);
		square.accept(5);
		
		Consumer<Integer> double_value = (i)-> System.out.println("The doble value is : "+ i* 2);
		double_value.accept(10);
		
		// Firstly suare is called and then double_value is called 
		square.andThen(double_value).accept(5);;
	}

}
