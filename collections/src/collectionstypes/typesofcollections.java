package collectionstypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.TreeSet;

public class typesofcollections {
	
	public static void main(String[] args) {
		
		ArrayList<String> obj1=new ArrayList<>();
		ArrayList<Integer> obj4=new ArrayList();
		ArrayList<Boolean> obj5=new ArrayList();
		LinkedList<String> obj6=new LinkedList();
		HashMap<Integer, Boolean> obj7=new HashMap();
		LinkedList<Integer> obj2=new LinkedList();
		HashMap<String,Integer> obj3=new HashMap();
		HashSet<String> obj=new HashSet();
		Hashmap<Integer> obj44=new Hashmap();
		  TreeSet<String> al=new TreeSet<String>();  
		  ArrayList<Integer> sr=new ArrayList();
		  Hashtable<Integer,String> as=new Hashtable(); 
		  
		// hash table 
		obj.add("srinivas");
		obj.clear();
		as.put(120,"srinivas");
		as.put(120,"pawan");
		as.put(130,"srinivas");
		as.put(140,"mahesh");
		obj.add("srinvas");
		obj.add("srinivas");
		obj.add(null);
        sr.add(12);		
    
		obj2.add(2);
		//hash map 
		obj3.put("srinivas",10);
		obj3.put("ganesh",20);
		obj3.put("null", null);
		obj3.put(null, null);
		obj4.add(20);
		obj5.add(false);
		obj6.add('A');
		obj7.put(20, false);
		obj1.add(30);
	
		System.out.println(obj1);
		
	}

}
