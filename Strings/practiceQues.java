package Strings;

public class practiceQues {
	public static String asciiDifference(String str) { 
		StringBuilder res = new StringBuilder();
		res.append(str.charAt(0)); // adding 1st index
		for(int i =1; i<str.length();i++) {
			int diff = str.charAt(i) - str.charAt(i-1); // that's y starting from 1 
			res.append(diff);//adding diff
			res.append(str.charAt(i));//adding next char
		}
		return res.toString(); //only res will give error as it is SB
	}
	public static String toggleChars(String str) {
     String toggled = " ";
     for(int i=0;i<str.length();i++) {
    	 char letter = str.charAt(i);
    	 
    	 if(Character.isUpperCase(letter)) {
    		 letter = Character.toLowerCase(letter);
    		 toggled = toggled + letter;
    	 }
    	 else if (Character.isLowerCase(letter)) { 
    		 letter = Character.toUpperCase(letter);
    		 toggled = toggled + letter;
    	 }
     }
     return toggled;
	}
	public static String chageToUpperCase(String str) { 
		String res = " ";
		for(int i=0;i<str.length();i++) {//iterate over input string
			char ch= str.charAt(i); //take out every character
			//check if character is lower case
			//'b'=98,'c'=99   'A'=65 'B'=66 'C'=67
			if(ch>=97) {//unicode of small 'a' means number is small
				char upperCase = (char)(ch-'a'+'A');//convert lower to upper
				res +=upperCase;//add in upper
			}else {
				res +=ch;//already upper
			}
		}
		return res;
	}
   public static void reverseString1(String str) {//using StringBuilder
	   String s = "google";
	   StringBuilder s1 = new StringBuilder();
	   s1.append(s);
	   s1.reverse();
	   System.out.println(s1);
   }
   public static void reverseString(String str) { //by using extra string
	String s = "yahoo";
	String ori_s = s;
	String rev= " ";
	for(int i=s.length()-1;i>=0;i--) {
		rev = rev +s.charAt(i);
	}
	System.out.println(rev);
}
   public static void PrintAllPalindromicSubstring(String str) {
	   for(int i=0;i<str.length()-1;i++) {
		   for(int j=i+1;j<str.length();j++) {
			   String subString = str.substring(i, j);
			   
			   if(isPalindrome(subString)) {
				   System.out.println(subString);
			   }
		   }
	   }
   }
	public static boolean isPalindrome(String str) { 
		int left =0, right= str.length()-1;
		while(left < right) { 
			char leftChar = str.charAt(left);
			char rightChar = str.charAt(right);
			
		//	if(leftChar == rightChar) return true; // also left !=right same 
		//if(!(leftChar + "").equals(rightChar + "")) return false;
			if((leftChar + "").equals(rightChar + "")) return true;
			left++;
			right--;
		}
		return false;
	}
	
	public static void printAllSubstrings(String str) { 
		for(int i=0;i<str.length()-1;i++) { 
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i, j));
			}
		}	
	}
	public static void main(String[] args) {
	//String s = "Hey";
		String s1= "qwerty";
	//String s = "malayalam";
	//	printAllSubstrings(s);
		//System.out.println(isPalindrome(s));
     // PrintAllPalindromicSubstring(s);	
		//reverseString(s1);
		//reverseString1(s);
//		System.out.println(toggleChars(s1));
		System.out.println(asciiDifference(s1));
}
}
