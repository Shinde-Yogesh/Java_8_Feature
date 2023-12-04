package java_8_Feature;

import java.util.function.BiConsumer;

public class Lambda_Example {

	public static void main(String[] args) {
		
		// BiConsumer is the consume the data and nothing have return
		
		BiConsumer<Integer, Integer> consumer = (Integer a, Integer b)->System.out.println(a+b);
		consumer.accept(40,50);
		
	}
		
	public static void sum(int x, int y)
	{
		System.out.println(x+y);
	}
		
}
/*
	Lambda_Example.add(10, 20);
	
	
	

}
public static void add(int a, int b)
{
	System.out.println(a+b);
}
*/