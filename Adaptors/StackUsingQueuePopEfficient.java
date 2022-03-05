package Adaptors;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePopEfficient {
Queue<Integer>  main;
Queue<Integer> helper;

public StackUsingQueuePopEfficient() {
	main = new LinkedList<>();
	helper = new LinkedList<>();
}

public void push(int value) { 
	helper.add(value);
	//move all elements from main to helper
	 while(!(main.size() == 0)){  // or while(!main.isEmpty())
		 helper.add(main.remove());
	 }
	// swap both main and helper
	 Queue<Integer> temp = main;
	 main = helper;
	 helper = temp;
}

public int pop()   {
	if(main.isEmpty()) return -1;
	
	return main.remove();
}
public int peek()   {
	if(main.isEmpty()) return -1;
	
	return main.peek();
}
public boolean isEmpty() {
	return main.isEmpty();
}

public int size() {
	return main.size();
}
}
