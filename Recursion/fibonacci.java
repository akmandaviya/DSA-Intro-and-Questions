package Recursion;

//nth number in  a fibonacci series

public class fibonacci {
	
	//t.c T(N)=T(n) linear
private static int getFib(int n) {
	
	//base case
	if(n == 0 || n == 1) { //fib of 0 & 1 in o & 1 
		return n;
		
		//or if(n<=1)
		//return n;
	}
	
	//faith
	//print to check bad effect on t.c due to repeating same steps in recusrion
	//System.out.println("hello" + n);
	int fib1 = getFib(n-1);
	int fib2 = getFib(n-2);
	
	//expectation
	int fibN = fib1 + fib2;
	return fibN;
}
	
//(2)
private static int fib(int n) {
	if(n<=1) {
		return n;
	}
	
	int sum = fib(n-1) + fib(n-2);
	return sum;
}
public static void main(String[] args) {
        int n = 5;
        System.out.println(getFib(n));
        System.out.println(fib(n));
}
}
