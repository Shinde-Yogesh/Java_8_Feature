package java_8_Feature;

import java.util.function.Function;

public class Function_Return_type_value {

	public static void main(String[] args) {
		Function<Integer, Integer> square = (i) -> i*i;
		System.out.println("The Square is i : " + square.apply(5));
	}

}
