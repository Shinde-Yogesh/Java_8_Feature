package java_8_Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Stream_Creation {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(50);
//		list.add(15);
//		
//		Collections.sort(list);
//		Collections.reverse(list);
//		
////		using stream 
//		list.stream().sorted().forEach(s -> System.out.println(s)); // for ascending order
//		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
////		System.out.println(list);
		
//		//Creation of the Stream as Filter
//		
//		@SuppressWarnings("rawtypes")
//		Stream s = list.stream().filter(i -> i%2 == 0);
//		s.forEach(x -> System.out.print(x+" "));
//		
//		
//		System.out.println(" ");
//		/// Creating the Stream as the map 
//		@SuppressWarnings("rawtypes")
//		Stream s1 = list.stream().map(i -> i*i);
//		s1.forEach(y -> System.out.print(y+ " "));
//old way

		// for the map
		Map<String,Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		List<Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries,new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
	}
}
