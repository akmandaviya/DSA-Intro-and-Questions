package Stack;

import java.util.Stack;

public class Question {

public static boolean bracketBalanced( String str) { 
		
		Stack<Character> st = new Stack<>(); // char stack
		
		for(int i=0; i<str.length(); i++) { 
			char check = str.charAt(i); // char to check
			
			if(check == '(' || check == '[' || check == '{') { // checking
				st.push(check); // if opening bracket then push in stack
				continue;
			} 
			
			if(st.isEmpty()) { //if no open bracket,then close bracket
				return false; // check if stack is empty or not
			}
			
			char ch;
			
			switch (check) { //switch case
			 
			    case ')': //check for round close bracket
				ch = st.pop();
				if(ch == '{' || ch == '[')
				return false;
				break;
				
			    case '}': //check for curly close bracket
					ch = st.pop();
					if(ch == '(' || ch == '[')
					return false;
					break;

			    case ']': //check for square close bracket
					ch = st.pop();
					if(ch == '{' || ch == '(')
					return false;
					break;
					
			}
		    
		}
		return st.isEmpty();
	}

public static void main(String[] args) {
	String s  = "{}()[()]";
	
	if(bracketBalanced(s)) { 
		System.out.println("Balanced");
	}
	else {
       System.out.println(" Not Balanced");
	}
}
}
