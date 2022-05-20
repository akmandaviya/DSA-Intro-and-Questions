package Recursion;



public class longestCommonSubsequence {
	
private static int lCS (String s, String t, int a, int b)	 {
	
	//base case
	if(a==0 || b==0) {
		return 0;
	}
	
	
	//checking for the last character in both the strings
	if(s.charAt(a-1) == t.charAt(b-1)) {
		return 1 + lCS(s, t, a-1, b-1);
	}
	else {
		return Math.max(lCS(s, t, a, b-1), lCS(s, t, a-1,b));
	}
	
	
}
public static void main(String[] args) {
	String s = "GEEK";
	String  t = "GEEKS";
	
	int a = s.length();
	int b = t.length();
	
	System.out.println("Length of LCS:" + lCS(s, t, a, b));
}
}
