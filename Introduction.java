package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Introduction {
	public static void main(String[] args) {
		//Hash Maps Functions
		HashMap<String, Integer> map = new HashMap<>();
		
		//add in hash map
	    map.put("Akash", 45);
	    map.put("Diya", 50);    
	    map.put("Ajay", 41);
	    map.put("Sunil", 40);
	    map.put("Ali", 48);
	    
	    System.out.println(map);
	 
	    //update call
	    map.put("Ajay", 47);
	    map.put("Diya", 49);
	    map.put("Dinesh",35);//check if present, if not add
	    System.out.println(map);
	     
	    //get element
	    System.out.println( map.get("Ali"));
	    System.out.println( map.get("Diya"));
	    System.out.println( map.get("Sonia"));//not present so null value
	    
	    //if element present return value, if not return default
	    System.out.println(map.getOrDefault("Ajay", 100));
	    System.out.println(map.getOrDefault("Samir", 100));
	    
	    //check key if present then true, or false T.C O(1)
	    System.out.println(map.containsKey("Dinesh"));
	    System.out.println(map.containsKey("Sobha"));
	   
	    //size of hash map
	    System.out.println(map.size());
	    
	    //check for empty
	    System.out.println(map.isEmpty());
	    
	    //remove
	    System.out.println(map.remove("Ali")); //remove key and return value
	    System.out.println(map);
	    map.remove("Sunil"); //only remove
	    System.out.println(map);
	    System.out.println(map.remove("Neha"));// if key not present then null
	    System.out.println();
	    
	    //return key and value(entry)
	     String arr[] = {"India", "is","my","country"};
//	    for(int i=0;i<arr.length;i++) {
//	    	System.out.print(arr[i] + " ");
//	    }
	     
	     //this type of loop can be used in hash map as it has no index
//	    for(String s:arr) {
//	    	System.out.print(s + " ");
//	    }
	     
	     //map.entry gives the number of entries (key and value)
	     //map.entryset gives set of all the  entries in iterable manner
	     //set is a collection
	     //entry.getKey = return key & entry.getValue = return value
	 for(Map.Entry<String, Integer> entry :map.entrySet())  {
		 System.out.println(entry.getKey() + "->"+entry.getValue());
	 } 
	 // return only key
	 for(String key : map.keySet()) {
		 System.out.println(key +" "+ "with marks" + map.get(key));
	 }
	  // same functionality , for each iterating over each element ( k & v) of map
	 //special function (arrow) which take another function as parameter
	 map.forEach((k, v) -> {
		 System.out.println(k+v);
	 } );
	//Hash Set Functions
	 HashSet<Integer> set = new HashSet<>();
		
		//add element in set
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(1);
		set.add(5); //it will do nothing 
		System.out.println(set);
		
		   //no update in set has no value.
		//no get in set, as we know what we are searching 
		
		 //check element in set T.C O(1)
	    System.out.println(set.contains(2));
	    System.out.println(set.contains(6));
	    
	    //remove element from set
	    set.remove(3);
	    System.out.println(set);
	    
	    //empty check
	    System.out.println(set.isEmpty());
	    System.out.println(set.size());
	    
	    for(Integer element : set ) {
	    	System.out.println(element);
	    }
	    set.forEach((el) ->{
	    	System.out.println(el + " in for each");
	    });
	}
	}

