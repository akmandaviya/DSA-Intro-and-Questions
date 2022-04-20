package Array_1D;


public class questions {
	//kadane's algorithm
	public static int maxSumSubArray(int arr[]) {
		int maxSum = 0;
		int  sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			
			if(sum > maxSum) {
				maxSum = sum;
			}
			
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}
	public static void reverseArray(int arr[]) { 
		int l = 0, r = arr.length-1;
		
		//swap
		while(l<r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		l++;
		r--;
		}
	System.out.println("reversed array:");
	for(int i=0;i<arr.length;i++) { 
		System.out.print(arr[i]);
	}
	}
public static void main(String[] args) {
	int arr[] = {5,-4,-2,6,-1};
	System.out.println(maxSumSubArray(arr));
}
}
