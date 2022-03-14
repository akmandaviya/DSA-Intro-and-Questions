package Strings;

import java.util.Scanner;

public class basics {
public static void main(String[] args) {
String str = "Newton School";
	System.out.println(str);
//	Scanner sc = new Scanner(System.in);
//	String s = sc.next(); //takes input about blank space
//	String st = sc.nextLine(); // takes complete line
	//System.out.println(s);
	//System.out.println(st);
	System.out.println(str.length());
	System.out.println(str.substring(2));
	System.out.println(str.substring(3, 10));
	char ch = str.charAt(5);
	System.out.println(ch);
	String s = str + " "+ "Welcome to all ";//append concentination
	System.out.println(s);
	System.out.println(10 + 30 + "Hey" + 10 + 30);
	System.out.println("10" + "30" +"Hey" +"10" + "30" );
	
	String arr[] = s.split(" ");
	for(int i=0;i<arr.length;i++ ) {
		System.out.println("-->"+ arr[i]);
	}
	//string to char array
	char arr1[] = s.toCharArray();
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i] + " ");
	}
	
	//comparison
	String a = "Hello";
	String b = "Hello";
	String c= new String("Hello");
	System.out.println();
	System.out.println(a==b);//address check
	System.out.println(a==c);//address check
	System.out.println(a.equals(b));//value check
	System.out.println(a.equals(c));//value check
 }
}
