package Sorting;

public class Introduction {
	public static void bubbleSort(int arr[]) {
	       for(int pass = 1;pass<=arr.length-1;pass++){
	           for(int i=1;i<= arr.length-pass;i++){ //i starts from 1 coz we have to check left is greater than right, if we start from 0 then out of bound.
	               if(arr[i]<arr[i-1]){
	                   //swap
	                   swap(arr,i,i-1); 
	               }
	           }
	       }
	   }
	
public static void  checkBubbleSort(int arr[]) {
	       for(int pass = 1;pass<=arr.length-1;pass++){
	           boolean isSwapped =false;
	           for(int i=1;i<= arr.length-pass;i++){ 
	               if(arr[i]<arr[i-1]){
	                 swap(arr,i,i-1);
	                   isSwapped = true; 
	               }
	           }
	           if(isSwapped == false) break; // break the outer loop array is sorted.
	       }
	   }

public static void selectionSort(int arr[]) {
		// we know n-1 passes
		       for(int pass = 1;pass<=arr.length-1;pass++){
		        int position = pass - 1 ; // position starts 1 position before pass
		        int minIndex = position; // assume as the position is min index
		        for(int i = position;i < arr.length;i++){ //iterating over unsorted array
		            if(arr[i] < arr[minIndex]){
		              minIndex = i; // minimum index of the unsorted array
		            }
		          }
		        swap(arr,minIndex,position);
		       }
		   }

public static void swap(int arr[],int i,int j){
	       int temp = arr[i];
	       arr[i] = arr[j];
	       arr[j] = temp;
	   }
public static void display(int arr[]){
	       for(int i=0;i<arr.length;i++){
	           System.out.print(arr[i] + " ");
	           System.out.println();
	       }
	   }

public static void inserstionSort(int arr[]) {
	       for(int i =1;i<arr.length;i++){
	           int key = arr[i]; // array need to be updated
	           int j = i-1;
	           //shifting greater element to 1 position right
	           while(j>=0 && arr[j] > key ){
	               arr[j+1] = arr[j]; // shifting right
	               j--; //to safeguard j from becoming out of bound.
	           }
	           arr[j+1] = key;
	       }
	   }
      //merge two sorted arrays
public static int[] merge(int a[], int b[]) {
	       int[] res = new int [a.length + b.length]; // result[] = a[] + b []
	       int i = 0, j=0, k=0;

	       while (i < a.length  &&  j <  b.length) {  //both the arrays are there and anyone of the arrays are finished we will do something else
	           if(a[i] <= b[j]) {
	               res[k] = a[i];
	               i++;
	               k++;
	           }
	           else {
	               res[k] = b[j];
	               j++;
	               k++;
	           }
	       }
	       while (i < a.length) {
	           res[k] = a[i];
	           i++;
	           k++;
	       }
	       while(j < b.length) {
	           res[k] = b[j];
	           j++;
	           k++;
	       }
	       return res;
	   }

public static int[] mergeSort(int arr[], int low, int high) {
	       if (low == high) { //single element array
	           int res[] = new int[1];
	           res[0] = arr[low];
	           return res;
	       }
	       int mid = (low + high) / 2;
	       //faith
	       int arr1[] = mergeSort(arr, low, mid); //return an integer array
	       int arr2[] = mergeSort(arr, mid + 1, high);
	       int[] res = merge(arr1, arr2);
	       return res;
	   }
	   //partition algorithm
public static int partition(int arr[], int pivot){
		   //0 to j-1 <=3
		   //j to i-1 >3
		   //i to n-1 unknown
		   int  i =0,j=0;
		   while(i < arr.length){
		       if(arr[i] <= pivot){
		           swap(arr, i ,j);
		           i++;
		           j++; 
		       }
		       else{
		         i++;
		       }
		   }
		   return j-1; // we can use return pivot. To return the pivot index.
		   }

public static void quickSort(int arr[], int low, int high){
		   //  if(low >= high){return;}
		     if(low < high){
		         int pivot = arr[high];
		         int pivotIndex = partition1(arr, pivot, low, high);
		         quickSort(arr,low,pivotIndex-1); //low to pivot
		         quickSort(arr,pivotIndex + 1,high);
		     }
		 }
		         public static int partition1(int arr[], int pivot, int low, int high){ //starting index and ending index
		   //0 to j-1 <=3
		   //j to i-1 >3
		   //i to n-1 unknown
		   int  i =low,j=high;
		   while(i <= high){
		       if(arr[i] <= pivot){
		           swap(arr, i ,j);
		           i++;
		           j++;
		       }
		       else{
		         i++;
		       }
		   }
		   return pivot;
		   }



public static void main(String[] args) {
	int arr[] = {2,7,1,6,4,9};
 display(arr);
 //bubbleSort(arr);
 //selectionSort(arr);
 inserstionSort(arr);
 //quickSort(arr, 0 , arr.length-1);
 display(arr);

}
}

