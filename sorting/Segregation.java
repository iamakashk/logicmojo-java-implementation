package com.sorting;

import java.util.Arrays;

public class Segregation {

	/**
	 * Title Segregation logic to Sort an array of 0's, 1's and 2's
	 * 
	 * Topic Array problems solving techniques with examples
	 * 
	 * Description Array consist of only 0's, 1's and 2's. Write an algorithm to
	 * sort this array in O(n) time complexity and O(1) Space complexity with only
	 * one traversal Asked in : : Amazon, Microsoft, Adobe, WalmartLabs
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 0 -> extreme left 1 -> middle 2 -> extreme right
		 */
		int arr[] = { 2, 1, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int arr[]) {

		int left = 0, mid = 0;
		int right = arr.length - 1;

		while (mid <= right) {

			if (arr[mid] == 2) {
				swap(arr, mid, right);
				right--;
			}

			if (arr[mid] == 0) {
				swap(arr, mid, left);
				mid++;
				left++;
			}

			if (arr[mid] == 1) {
				mid++;
			}
		}
	}

	public static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
