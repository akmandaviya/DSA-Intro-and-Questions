package Searching;

public class Questions {
	
	public static int lastOccurence(int arr[], int val) {

		   int left = 0, right = arr.length - 1, ans = -1;

		   while(left <= right) {
		       // calculate mid
		       int mid = (left + right) / 2;

		       if(arr[mid] == val) {
		           ans = mid; //if ans is on mid, but it is one of the correct answers as we have to find the occurence.

		           left = mid + 1; //move left
		       }
		       else if(arr[mid] < val) {
		           left = mid + 1;
		       }
		       else { //arr[mid] > val
		           right = mid - 1;
		       }
		   }
		   return ans;
		}

	public static int firstOccurence(int arr[], int val) {

		   int left = 0, right = arr.length - 1, ans = -1;

		   while(left <= right) {
		       // calculate mid
		       int mid = (left + right) / 2;

		       if(arr[mid] == val) {
		           ans = mid; //if ans is on mid, but it is one of the correct answers as we have to find the occurence.

		           right = mid - 1; //move left
		       }
		       else if(arr[mid] < val) {
		           left = mid + 1;
		       }
		       else { //arr[mid] > val
		           right = mid - 1;
		       }
		   }
		   return ans;
		}
		public static void main(String[] args) {
		   int arr[] = {10,20,30,40,30,60,60,60};
		  // System.out.println(firstOccurence(arr, 60)); //output is 2
		   System.out.println(lastOccurence(arr, 60));
		}
		}

