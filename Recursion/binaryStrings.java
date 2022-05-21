package Recursion;


//Generate all binary strings without consecutive 1’s

//if string ends with '1', then put only'0' at the end
//if string end with '0', then out '0' and '1' both 
//at the end to generate new strings

public class binaryStrings {
	
	//array to string
	public static String toString(char[]ch) {
		String str = new String(ch);
		return str;
	}

public static void binaryStrings(int k, char[] c, int n) {
	//base case
	//means end reached
	if(n == k) {
		System.out.print(toString(c) + " ");
		return;
	}
	
	//check for '0', and adding o and 1
		if(c[n-1] == '0') {
			c[n] = '0';
			binaryStrings(k, c, n+1);
			c[n] = '1';
			binaryStrings(k, c, n+1);
		}
		
		
		//check for '1',and adding 0.
	   
			if(c[n-1] == '1') {
				c[n] = '0';
				//recursive call for next value of char array
				binaryStrings(k, c, n+1);
			}
		}


private static void helper(int k) {
	if(k<=0) {
		return;
	}
	
	char [] c1 = new char[k];
	
	//strings starting with 0
	c1[0] = '0';
	binaryStrings(k, c1, 1);
	
	//strings starting with 1
	c1[0] = '1';
	binaryStrings(k, c1, 1);
}
public static void main(String[] args) {
	int k=3;
	helper(k);
}
}
