package Sorting;

import java.util.Arrays;

public class Questions {
	// Merge 2 sorted array in 0(1) without using extra array
	 public static void main(String[] args) {
	       int ar1[] = {1, 5, 9, 10, 15, 20};
	       int ar2[] = {2, 3, 8, 13};
	       int i = ar1.length - 1, j = 0;
	       while (i >= 0 && j < ar2.length) {
	           if (ar1[i] > ar2[j]) {
	               swap(ar1,ar2,i,j);
	               i--;
	               j++;
	           }
	           else{
	               break;
	           }
	       }
	       Arrays.sort(ar1);
	       display(ar1);
	       Arrays.sort(ar2);
	       display(ar2);
	   }

	 public static void swap(int a[], int b[], int start, int end) {
	       int temp = a[start];
	       a[start] = b[end];
	       b[end] = temp;
	   }
	   public static void display(int arr[]){
	       for(int i=0;i<arr.length;i++){
	           System.out.println(arr[i] + " ");
	           System.out.println();
	       }
	   }

}
