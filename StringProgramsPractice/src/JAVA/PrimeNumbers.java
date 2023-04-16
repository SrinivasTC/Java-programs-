package JAVA;

public class PrimeNumbers {

	public static void main(String[] args) {
	

		for (int isrd = 2; isrd <=100 ; isrd++) {
			boolean isPrime = true;
			for (int j = 2; j < isrd; j++) {
				if (isrd % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(isrd);
			}
	
	}

	}}
