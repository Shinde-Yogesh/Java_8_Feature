package java_8_Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Creation {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(15);
		
		//Creation of the Stream as Filter
		
		@SuppressWarnings("rawtypes")
		Stream s = list.stream().filter(i -> i%2 == 0);
		s.forEach(x -> System.out.print(x+" "));
		
		
		System.out.println(" ");
		/// Creating the Stream as the map 
		@SuppressWarnings("rawtypes")
		Stream s1 = list.stream().map(i -> i*i);
		s1.forEach(y -> System.out.print(y+ " "));

	}
}
