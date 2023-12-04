package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question_Asked_In_Companies {
	public static void main(String[] args) {
		String str = "ilovejavatechi";
//		number_of_charOccarrance(str);
		greaterThanOneCharOccarance(str);
	}
	// group by here work like how many copies are there 
		public static void number_of_charOccarrance(String str)
		{
			/*
			Map<String, List<String>> all_Occarance = Arrays.stream(str.split(""))
					.collect(Collectors.groupingBy(s -> s));
			System.out.println(all_Occarance);
			*/
			
			 Map<String, Long> result = Arrays.stream(str.split(""))
					.collect(Collectors
					.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(result);
		}
		
		public static void greaterThanOneCharOccarance (String str)
		{
			Map<String, List<String>> all_Occarance  =  Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s -> s));
				System.out.println(all_Occarance);
			
			
			
			 List<String> duplicateElement = Arrays.stream(str.split(""))
					.collect(Collectors
					.groupingBy(Function.identity(),Collectors.counting()))
					.entrySet()
					.stream()
					.filter(x -> x.getValue() > 1)
					.map(Map.Entry :: getKey)
					.collect(Collectors.toList());
		System.out.println(duplicateElement);
		}
}
