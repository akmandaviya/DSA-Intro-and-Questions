package Recursion;


//Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
//Output : "gee"


//In this algorithm, a divide and conquer approach is used
//We first divide the arrays of string into two parts. Then we do the same for left part and after that for the right part.
//We will do it until and unless all the strings become of length 1. 
//Now after that, we will start conquering by returning the common prefix of the left and the right strings. 


public class longestCommonPrerfix {
	
	// A Utility Function to find the common prefix between
	// strings- s1 and s2
	
public static String commonPrefix(String s1, String s2) {
		String res = "";
		
		int a = s1.length(), b = s2.length();
		
		for(int i=0, j=0; i <= a-1 && j <= b-1; i++,j++ ) {
			if(s1.charAt(i) != s2.charAt(j)) {
				break;
			}
			res += s1.charAt(i);
		}
		return res;
	}

//divide and conquer method 

public static String commonPrefix(String arr[], int low, int high) {
	if(low == high) {
		return arr[low];
	}
	
	if(high > low) {
		int mid = low + (high - low)/2;	
		
		String s1 = commonPrefix(arr, low, mid);
		String s2 = commonPrefix(arr, mid +1, high);
		
		return commonPrefix(s1, s2);
		}
	return null;
}
public static void main(String[] args) {
	
	
	String arr[] = {"geeksforgeeks", "geeks",
            "geek", "geezer"};
	
	int a = arr.length;
	
	String res = commonPrefix(arr, 0, a-1);
	
	if(res.length() != 0) {
		System.out.println("LCP is : " + res);
	}else {
		System.out.println("No LCP");
	}
}
}
