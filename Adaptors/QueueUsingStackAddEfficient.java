package Adaptors;

import java.util.Stack;

public class QueueUsingStackAddEfficient {
Stack<Integer> main;
Stack<Integer> helper;

public QueueUsingStackAddEfficient() {
	main = new Stack<>();
	helper = new Stack<>();
}
//T.C O(1)
public void add(int value) { 
	main.push(value);	
}
//T.C O(n)
public int remove( ) { 
	if(main.size() == 0) return -1;
	
	//remove from main stack
	while (main.size() > 1) {
		helper.push(main.pop());//move from main to helper
	}
	// remove the first item
	int itemToRemove  = main.pop();	
	
	//move items from helper to main
	while(!helper.isEmpty()) { 
		main.push(helper.pop());
	} 
	return itemToRemove;
}
//T.C O(n)
public int peek() { 
if(main.size() == 0) return -1;
	
	//remove from main stack
	while (main.size() > 1) {
		helper.push(main.pop());//move from main to helper
	}
	// return the first item
	int itemToReturn  = main.peek();	
	
	//move items from helper to main
	while(!helper.isEmpty()) { 
		main.push(helper.pop());
	} 
	return itemToReturn;
}

public boolean isEmpty() {
	return main.isEmpty();
}

public int size() { 
	return main.size();
}
}
