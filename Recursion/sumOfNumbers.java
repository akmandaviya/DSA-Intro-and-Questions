package Recursion;

public class sumOfNumbers {
	
private static int sum(int n) {
	if(n <= 1) {
		return n;
	}
	else {
		return n + sum(n-1); // 5 + sum(4)--> 4 + sum(3)
	}
}	
public static void main(String[] args) {
	int n = 5;
	
	System.out.println(sum(n));
}
}
