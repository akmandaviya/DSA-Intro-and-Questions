package Sorting;

//bubble sort
//here compare the adjacent element, if left element is smaller than right then swap
//t.c O(n^2)
//s.c o(1)

public class bubbleSort {
	
//ascending sort	
private static void bubbleS(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j] > arr[j+1]) {
				swap(arr, j, j+1);
			}
		}
	}
}

//descending sort
private static void bubbleS1(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j] < arr[j+1]) {
				swap(arr, j, j+1);
			}
		}
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
	bubbleS(arr);
	display(arr);
	bubbleS1(arr);
	display(arr);
}
}
