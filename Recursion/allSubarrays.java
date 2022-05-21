package Recursion;


//Generate all possible sub arrays in an array
public class allSubarrays {
public static void allSubArrays(int arr[], int s, int e) {
	
	//using 2 pointer
	
	if(e == arr.length) {
		return;
	}
	
    //when start > end
	//start from 0 and increment end
	else if(s > e) {
		allSubArrays(arr, 0, e+1);
	}
	
	//print sub-array and increment start
	else {
		System.out.print("");
        for (int i = s; i < e; i++)
            System.out.print(arr[i] + ", ");
        System.out.println(arr[e] + "");
        allSubArrays(arr, s+1, e);
	}
	return;
}
public static void main(String[] args) {
	int arr[] = {1,2,3};
	allSubArrays(arr, 0, 0);
}
}
