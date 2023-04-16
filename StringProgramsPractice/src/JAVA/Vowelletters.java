package JAVA;

import java.util.ArrayList;
import java.util.HashSet;

public class Vowelletters {

	public static void main(String[] args) {
	
		String str="upparasrinivasulu"; // word consists of both consonants and vowels 
		
		char vowels[]= {'a','e','i','o','u'};// list of vowels stored in char vowels array 
		
		ArrayList<Character> jkl=new ArrayList();
		HashSet<Character> jkm=new HashSet();
		
		for(int i=0;i<str.length();i++) {// iterating all characters of string word str 
			
			
			char letters =str.charAt(i); // if iteration successfull store string words  in char variable letters
				
			
				for(int j=0;j<vowels.length;j++) {
					
					if(letters==vowels[j]) {
					
						jkl.add(letters);
						
					}
					else {
						jkm.add(letters);
						
					}
					
					
					
						
					}
				
				
				}
		
		System.out.println(jkl);
		System.out.println(jkm);
	}

}

	
	

	



			


	


