package java_8_Feature;

import java.util.function.Predicate;

public class Example {
	public static void main(String[] args) {
		Predicate<String> pridacte = (s) -> s.length() > 0;
		System.out.println("the length is : " + pridacte.test("How are you "));
	}
}
