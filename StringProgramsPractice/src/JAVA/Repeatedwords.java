package JAVA;

import java.util.HashSet;

public class Repeatedwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]str={"mango","banana","orange","lemon","mango"};

		HashSet<String>seenwords=new HashSet();	

		for(String word:str) {

			if(seenwords.contains(word)) {

				System.out.println(word);
			}
			else {

				seenwords.add(word);

				

			}

		}}}








