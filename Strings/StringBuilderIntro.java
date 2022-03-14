package Strings;

import java.io.StringReader;

public class StringBuilderIntro {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Hey how are you");
    System.out.println(sb);
    
    //get a char
    char s = sb.charAt(2);
    System.out.println(s);
    
    //add at end	
    sb.append('d');
    System.out.println(sb);
    //add at a index
    sb.insert(2, 'z');
    System.out.println(sb);
    
    //update the char
    sb.setCharAt(3, 'z');
    System.out.println(sb);
    
    //remove at an index
    sb.deleteCharAt(0);
    System.out.println(sb);
    
    //delete between indexes
    sb.delete(5, 8);
    System.out.println(sb);
    
    //size
    System.out.println(sb.length());
    
    //substring
    sb.substring(2, 3);
    System.out.println(sb);
    
    //anything to string
    String str = sb.toString();
    
    //performance check
    int n=10000000;
   long startTime = System.currentTimeMillis();
   //for string s1 = " ";
   StringBuilder  s1 = new StringBuilder();
    for(int i=0;i<n;i++) { 
    	s1.append(i); // s1+=i; 
    }
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    System.out.println(duration);
}
}
