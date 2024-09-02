package com.binarysearch.maxnumber;

public class MaxNumber {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 67, 70, 72, 56, 44, 43, 21, 10, 1 };
		System.out.println(getMaxNumber(arr, 0, arr.length - 1));
	}

	public static int getMaxNumber(int arr[], int si, int ei) {
		/*
		 * 1. left is less and right less less >> Thats the number 2. left is less and
		 * right is more >> go right 3. left is more and right is less >> go left
		 */

		if (si == ei) {
			return arr[si];
		}

		if (si + 1 == ei) {
			if (arr[si] >= arr[ei]) {
				return arr[si];
			} else {
				return arr[ei];
			}
		}

		int mid = si + (ei - si) / 2;

		if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
			// 1. left is less and right less less >> Thats the number
			return arr[mid];
		}

		if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
			// 3. left is more and right is less >> go left
			return getMaxNumber(arr, si, mid);
		} else
			// 2. left is less and right is more >> go right
			return getMaxNumber(arr, mid + 1, ei);
	}
}
