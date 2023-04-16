package JAVA;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Allstringprograms {

	public static void main(String[] args) {





		//character print from string 

		String chr="srinivas";

		for(int i=0;i<chr.length();i++) {

			char letters=chr.charAt(i);
			

		System.out.println(letters);
		
		// count the occurrence of repeated characters in string 
		
		
		String chrc="srinivas";
		
		
		char sd='s';
		
		int count=0;
		
		for(int ss=0;ss<chrc.length();ss++) {
			
			if(chrc.charAt(ss)==sd) {
				
				count++;
			
		}
		System.out.println(count);
			
			
			
		
		
		}


		// Substring program 
		String str = "Hello world";
		String subStr = str.substring(4,7);
		System.out.println(subStr+" ");
		// Split method 
		String str1 = "java@selenium";
		String[] spilt=str1.split("@");

		String firstpart=spilt[0];

		String secondpart=spilt[1];
		System.out.println(firstpart);
		System.out.println(secondpart);


		//Trim method


		String word = "Java S e le n ium";
		String trimmedStr = word.trim().replaceAll("\\s+", "");
		System.out.println(trimmedStr);


		// Replace all method 
		String ddas = "java selenium";
		String replacedStr = ddas.replaceAll("[ja]", "e");
		System.out.println(replacedStr);
		// Replace method 
		String asda = "java selenium";
		String ads = asda.replace("j", "TEMP").replace("a", "j").replace("TEMP", "a");
		System.out.println(ads);


		//String reverse 

		String af = "srinivas";
		StringBuilder reversedStr = new StringBuilder(af);
		reversedStr.reverse();
		System.out.println(reversedStr.toString());


		//Reverse string without using reverse method 

		String word2 = "srinivas";
		String reversedStr1 = "";

		for (int i33 = str.length() - 1; i33 >= 0; i33--) {
			reversedStr1 += word.charAt(i);
		}

		System.out.println("Original string: " + word);
		System.out.println("Reversed string: " + reversedStr);


		//Swap of two integers without using third integers 

		int a = 5;
		int b = 10;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a); // Output: a = 10
		System.out.println("b = " + b); // Output: b = 5


		//Convert string array to string 

		String[] stringArray = {"hello", "world", "!"};
		String joinedString = String.join(" ", stringArray);
		System.out.println(joinedString); // Output: hello world !

		//Convert string to string array
		String myString = "hello world !";
		String[] stringArray1 = myString.split(" ");
		System.out.println(Arrays.toString(stringArray)); 

		// convert string to char array 

		String name = "hello world";
		char[] charArray = myString.toCharArray();
		System.out.println(Arrays.toString(charArray)); 

		// Reverse star pattern program 

		for (int is = 5; is >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Index of "ii" program in java 


		int[] numbers = {1, 2, 3, 4, 5};

		for (int srinivas = 0; srinivas < numbers.length; srinivas++) {
			System.out.println("Index " + srinivas + ": " + numbers[srinivas]);
		}

		//Fibonacci series program 

		int n = 10, t1 = 0, t2 = 1;
		System.out.print("Fibonacci Series: ");

		for (int i11 = 1; i11 <= n; i11++) {
			System.out.print(t1 + " ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}


		//prime numbers print 

		for (int isrd = 2; isrd <= 20; isrd++) {
			boolean isPrime = true;
			for (int j = 2; j < isrd; j++) {
				if (isrd % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(isrd);
			}


			//Palindrome string program 


			String palindme = "racecar";
			String reversed = new StringBuilder(palindme).reverse().toString();
			if (palindme.equals(reversed)) {
				System.out.println(palindme+ " is a palindrome.");
			} else {
				System.out.println(palindme + " is not a palindrome.");
			}

			//Print current time in system 
			LocalDateTime now= LocalDateTime.now();



			System.out.println("Present time is:"+now);

			// Factorial numbers print program in java 

			int n1 = 20;
			long fact = 1;
			for (int i3 = 1; i3 <= n1; i3++) {
				fact *= i;
			}
			System.out.println("Factorial of " + n1 + " is: " + fact);


			//print repeated characters in string 

			String sadksf = "srinivas";


			for (int iaa = 0; iaa < sadksf.length(); iaa++) {
				char ch = sadksf.charAt(i);
				int count12 = 0;

				// count the occurrence of the current character
				for (int j = 0; j < sadksf.length(); j++) {
					if (sadksf.charAt(j) == ch) {
						count12++;
					}
				}

				// print the character if it occurs more than once
				if (count > 1) {
					System.out.print(ch + " ");
				}

				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(1);
				list.add(4);
				list.add(2);

				Set<Integer> uniqueValues = new HashSet<Integer>();
				Set<Integer> repeatedValues = new HashSet<Integer>();

				// loop through the ArrayList and add each value to the set of unique values
				// if a value is already in the set, add it to the set of repeated values
				for (int value : list) {
					if (!uniqueValues.add(value)) {
						repeatedValues.add(value);
					}
				}

				// print the set of repeated values
				System.out.println("Repeated values in the ArrayList: " + repeatedValues);


			}}}}}













































