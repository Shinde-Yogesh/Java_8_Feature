package java_8_Feature;

import java.util.function.Function;

public class Function_Chaining {

	public static void main(String[] args) {
		Function<Integer, Integer> square = ( i) -> i * i ;
		
		System.out.println("The Square is : " + square.apply(5));
		
		
		Function<Integer, Integer> cube = (i) -> i*i*i;
		
		System.out.println("cube is :" + cube.apply(10));
		
		// By Using the andThen Method 
		System.out.println("By using the andThen Method : "+ square.andThen(cube).apply(5));
		
		// By Using the Compose to 
		
		System.out.println("By using the comapare : "+ cube.compose(square).apply(2));
	}

}
