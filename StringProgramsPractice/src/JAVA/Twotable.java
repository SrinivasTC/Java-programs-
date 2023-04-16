package JAVA;

import java.util.Arrays;
import java.util.List;

public class Twotable {
	
	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println	("2*"+i+"="+2 *i);
			
					
					
				}
			// Count  number of even numbers from list
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		long count = numbers.stream()
		                   .filter(num -> num % 2 == 0)
		                   .count();

		System.out.println("Number of even integers: " + count);
	}

		
	}



