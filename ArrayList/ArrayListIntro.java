package ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
public static void main(String[] args) {
	ArrayList<Integer>al1 = new ArrayList<>();
	al1.add(1);
	al1.add(1);
	al1.add(1);
    al1.add(1);

	ArrayList<Integer> al = new ArrayList<>(al1);
	System.out.println(al);
	
	//add elements 
	al.add(10);
	al.add(1, 20);
	al.add(40);
	al.add(30);
	al.add(60);
	al.add(70);
	System.out.println(al);
	
	//remove
	al.remove(0);
	System.out.println(al);
	
	//get an element
	System.out.println(al.get(3));
	int a  = al.get(2);
	System.out.println(a);
	
	//set an element/update
	al.set(2, 100);
	System.out.println(al);
	
	//size
	System.out.println(al.size());
	
	//empty/del all the elements
//     al.clear();
//     System.out.println(al);
      
	//to string
	String as = al.toString();
	System.out.println(as);
	
	//looping
//	for(int i=0;i<al.size();i++) {
//		System.out.println(al.get(i));
//	}
	
	//same output
	for(Integer elem:al) {
		System.out.println(elem);
	}
}
}
