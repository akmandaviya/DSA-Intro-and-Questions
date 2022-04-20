package Sorting;

//insertion sort
//consider 2 parts sorted and unsorted in the starting
//we have to pick element from unsorted and keep in sorted at correct place
//while keeping in sorted part compare the element with the unsorted part
//if element is smaller then push the bigger and keep the smaller element ahead of them
//we are considering 0th element is in sorted part, so we are starting loop from 1.
//t.c=o(n^2) s.c o(1)

public class insertionSort {
	private static void insertionS(int arr[]) {
		for(int i=1;i<arr.length;i++) {//loop in unsorted part
			int curr = arr[i]; //element to be placed in correct placed
			int j = i-1;//last index of sorted part
			while(j >=0 && curr < arr[j]) {//traverse sorted part
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = curr;//placement at correct place
		}
	}
	
	private static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
public static void main(String[] args) {
	int arr[] = {7,8,3,1,2};
	insertionS(arr);
	display(arr);
}
}
