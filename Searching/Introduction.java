package Searching;

public class Introduction {
	public static int binarySearch(int arr[],int value){
        int left = 0, right = arr.length - 1;
        while(left<=right){
            //calculate mid
            int mid =(left+right)/2;

            if(arr[mid] == value){
                return  mid;
            }
            else if (arr[mid] < value){
                left = mid + 1;
            }
            else{//arr[mid] > value
              right = mid - 1;
            }
        }
        return  -1; // this means element not present. left shifts to right
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 6));  // output is 5
    }
    }

