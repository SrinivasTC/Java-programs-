package collectionstypes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("selenium");
		list.add("selenium");
		list.add("python");


		Set<String> set = new HashSet<String>();




		for (String str : list) {

			if (!set.add(str)) {
				System.out.println(str);


			}


		}



		ArrayList<Integer>list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(100);
		list1.add(10);


		Set<Integer> set1 = new HashSet<Integer>();
            

		for (Integer num : list1) {
			if (!set1.add(num)) {


				System.out.println(num);
			}



		}}}









