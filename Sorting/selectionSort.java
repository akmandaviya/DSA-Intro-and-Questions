package Sorting;


//selection sort
//make 0th element minimum,then iterate in the array and check any element smaller than minimum
//if found make that element minimum
//continue this for the complete loop
//now when we got the smallest element in the array swap it with the 1st element
//repeat the next loop from 2nd element as now 1st element is already sorted
//t.c o(n^2) s.c 0(1)

public class selectionSort {
	private static void selections(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
	}
	
	private static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void swap(int arr[], int a, int b) {
	        int temp = arr[a];
	        arr[a] = arr[b];
	        arr[b] = temp;
	}	   
 public static void main(String[] args) {
	int arr[] = {7,8,3,1,2};
	selections(arr);
	display(arr);
}
}
