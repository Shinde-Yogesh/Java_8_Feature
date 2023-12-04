package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question_Asked_In_Companies {
	public static void main(String[] args) {
		String str = "ilovejavatechi";
//		number_of_charOccarrance(str);
//		greaterThanOneCharOccarance(str);
//		uniqCharinStr(str);
//		firstNonRepeatChar(str);
//		firstRepeatChar(str);
		
		//number array
		int array[] =  {5,9,11,2,8,21,1};
//		secondHighestNumber(array);
		secondLoweNumber(array);
		
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
		
		public static void uniqCharinStr (String str)
		{ 
			Map<String, List<String>> all_Occarance  =  Arrays.stream(str.split(""))
					.collect(Collectors.groupingBy(s -> s));
			System.out.println(all_Occarance);
			
			
			
			List<String> uniq = Arrays.stream(str.split(""))
					.collect(Collectors
							.groupingBy(Function.identity(),Collectors.counting()))
					.entrySet()
					.stream()
					.filter(x -> x.getValue() == 1)
					.map(Map.Entry :: getKey)
					.collect(Collectors.toList());
			System.out.println(uniq);
		}
		
		public static void firstNonRepeatChar (String str)
		{ 
			Map<String, List<String>> all_Occarance  =  Arrays.stream(str.split(""))
					.collect(Collectors.groupingBy(s -> s));
			System.out.println(all_Occarance);
			
			/*
			 the ans return the c
			 but it is false
			 because the it used hash map so insertion order is not maintain
			 
			 String fist_non_Repeat = Arrays.stream(str.split(""))
					.collect(Collectors
					.groupingBy(Function.identity(),Collectors.counting()))
					.entrySet()
					.stream()
					.filter(x -> x.getValue() == 1)
					.findFirst()
					.get()
					.getKey();
					*/
			String fist_non_Repeat = Arrays.stream(str.split(""))
					.collect(Collectors
							.groupingBy(Function.identity(),LinkedHashMap :: new,Collectors.counting()))
					.entrySet()
					.stream()
					.filter(x -> x.getValue() == 1)
					.findFirst()
					.get()
					.getKey();
			
			System.out.println(fist_non_Repeat);
		  }
		
		public static void firstRepeatChar (String str)
		{ 
			Map<String, List<String>> all_Occarance  =  Arrays.stream(str.split(""))
					.collect(Collectors.groupingBy(s -> s));
			System.out.println(all_Occarance);
			
			String fist_non_Repeat = Arrays.stream(str.split(""))
					.collect(Collectors
							.groupingBy(Function.identity(),LinkedHashMap :: new,Collectors.counting()))
					.entrySet()
					.stream()
					.filter(x -> x.getValue() > 1)
					.findFirst()
					.get()
					.getKey();
			
			System.out.println(fist_non_Repeat);
		  }
		
		public static void secondHighestNumber(int array[])
		{
			List<Integer> sortedArray = Arrays.stream(array)
			.boxed()
			.sorted()
			.collect(Collectors.toList());
			System.out.println(sortedArray);
			
			List<Integer> DescendingOrder = Arrays.stream(array)
					.boxed()
					.sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
			System.out.println(DescendingOrder);
			
			List<Integer> firstRemoveDigit = Arrays.stream(array)
					.boxed()
					.sorted(Comparator.reverseOrder())
					.skip(1)
					.collect(Collectors.toList());
			System.out.println(firstRemoveDigit);
			
			Integer secondeGreaterVal = Arrays.stream(array)
					.boxed()
					.sorted(Comparator.reverseOrder())
					.skip(1)
					.findFirst()
					.get();
			System.out.println(secondeGreaterVal);
			
		 }
		
		public static void secondLoweNumber(int array[])
		{
			List<Integer> sortedArray = Arrays.stream(array)
					.boxed()
					.sorted()
					.collect(Collectors.toList());
			System.out.println(sortedArray);
			
			
			List<Integer> firstRemoveDigit = Arrays.stream(array)
					.boxed()
					.sorted()
					.skip(1)
					.collect(Collectors.toList());
			System.out.println(firstRemoveDigit);
			
			Integer secondeLowerVal = Arrays.stream(array)
					.boxed()
					.sorted()
					.skip(1)
					.findFirst()
					.get();
			System.out.println(secondeLowerVal);
			
		 }
}
