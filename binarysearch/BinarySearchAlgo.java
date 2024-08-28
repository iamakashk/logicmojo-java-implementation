package com.binarysearch;

public class BinarySearchAlgo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1,33,45,67,78,81,82,83,85,86,87,88,98,100};
		System.out.println(BinarySrch(arr, 100, 0, arr.length));
	}

	public static int BinarySrch(int[] arry, int key , int low, int high) {
		if(high < low ) {
			return 0;
		}
		
		int mid  = low + (high-low)/2;
		
		if(arry[mid] == key) {
			return mid;
		}
		
		if(arry[mid] >key) {
			
			return BinarySrch(arry, key, low , mid);
		}else {
			return BinarySrch(arry, key, mid+1, high);
		}
	}
}
