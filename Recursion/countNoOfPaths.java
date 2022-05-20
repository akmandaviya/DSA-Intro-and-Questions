package Recursion;
//count no of paths
//when we come down or go up from n steps
//we can  takes 1 2 3 jumps to reach the destination

public class countNoOfPaths {
	
private static int countPaths(int n) {
	//base case
	if(n == 0) { 
		return 1;
	}
	if(n < 0) {
		return 0;
	}
	
	//faith 
	int a1 = countPaths(n-1);
	int a2 = countPaths(n-2);
	int a3 = countPaths(n-3);
	
	//expectations
	int cp = a1+a2+a3;
	
	return cp;
}
public static void main(String[] args) {
	int n = 5;
	System.out.println(countPaths(n));
}
}
