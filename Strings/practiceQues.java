package Strings;

import java.util.Stack;

import Priority_Queue.intro;

public class practiceQues {
	public static int countWord(String str, String value) { 
		String arr[] = str.split("_");
		
		int count = 0;
		
		for(int i=0;i< arr.length;i++) { 
			if(value.equals(arr[i])) { 
				count++;
			}
		}
		return count;
	}
	
public static void printUniqueWords(String str)  {
		int count = 0;
		
		String s [] = str.split(" ");
		
		for(int i=0;i<s.length;i++) {
			count = 1;
			
			for(int j=i+1;j<s.length;j++) { 
				if(s[i].equalsIgnoreCase(s[j])) {
					count++;
					s[j] ="";
				}
			}
			if(count == 1 && s[i] != "")
				System.out.println(s[i]);
		}
	}
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
   public static void reverseString1(String str) {//using StringBuilder o(n)
	   String s = "google";
	   StringBuilder s1 = new StringBuilder();//
	   s1.append(s);
	   s1.reverse();
	   System.out.println(s1);
   }
   public static void reverseString(String str) { //by using extra string 0(n)
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
	
	public static String compression1(String str) {
		   String s = String.valueOf(str.charAt(0));
		   for (int i = 1; i < str.length(); i++) {
		       char current = str.charAt(i);
		       char previous = str.charAt(i - 1);
		       if (current != previous) {
		           s += current; //a
		       }
		   }
		   return s;
		}
	
	public static String compression(String str) {
        String s = String.valueOf(str.charAt(0));
        int count =1;  //2
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);
            if (current == previous) {
                count++;
            }
            else {
                if(count >1) {
                    s += count;
                    count =1;
                }
                s +=current;
            }
        }
        if(count > 1){
            s+=count;
            count = 1;
        }
        return s;
    }

public static int  longestValidParanthesis(String str) {
		int size = str.length();
		
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		
		int ans =0;
		
		for(int i=0;i<size;i++) {
			if(str.charAt(i) =='(' ) { //opening bracket then push
				st.push(i);
			} 
			else {
				// for  closing bracket
				
				if( !st.isEmpty()) {
					st.pop();
				}
			} 
			//check for max substring 
			// for current 
			if(!st.isEmpty()) {
				ans = Math.max(ans, i- st.peek());
			}else {
				st.push(i);// for next paranthesis
			} 
		}
		return ans;
}

	public static void main(String[] args) {
		String str = "()()()))()()()()";
		System.out.println(longestValidParanthesis(str));
		//String s = "The Sun rises in the east.";
	//String s = "This_is_my_car";
		//String s1= "qwerty";
	//String s = "malayalam";
	//	printAllSubstrings(s);
		//System.out.println(isPalindrome(s));
     // PrintAllPalindromicSubstring(s);	
		//reverseString(s1);
		//reverseString1(s);
//		System.out.println(toggleChars(s1));
		//System.out.println(asciiDifference(s1));
	//System.out.println(countWord(s, "is"));
		//String s  = "aaabbbccdd";
        //System.out.println(compression1(s));
            // printUniqueWords(s);
}
}
