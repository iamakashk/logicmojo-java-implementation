package com.mergesort;

import java.util.Arrays;

public class MergeSortImpl {

	public static void main(String[] args) {
		int arr[] = { 100, 3, 5, 7, 8, 34, 0, 50, 23, 4, 88, 11, 22, 2 };
		divide(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void divide(int arr[], int si, int ei) {

		if (si >= ei) {
			return;
		}

		int mid = si + (ei - si) / 2;

		divide(arr, si, mid);
		divide(arr, mid + 1, ei);

		System.out.println("si >> " + si + " ei :: " + ei);
		conquer(arr, si, ei, mid);

	}

	public static void conquer(int arr[], int si, int ei, int mid) {
		int mergedArray[] = new int[ei - si + 1];

		int indx1 = si, indx2 = mid + 1, j = 0;

		while (indx1 <= mid && indx2 <= ei) {
			if (arr[indx1] <= arr[indx2]) {
				mergedArray[j] = arr[indx1];
				j++;
				indx1++;
			} else {
				mergedArray[j] = arr[indx2];
				j++;
				indx2++;
			}
		}

		while (indx1 <= mid) {
			mergedArray[j++] = arr[indx1++];
		}

		while (indx2 <= ei) {
			mergedArray[j++] = arr[indx2++];
		}

		for (int i = 0, j1 = si; i < mergedArray.length; i++, j1++) {

			arr[j1] = mergedArray[i];
		}

	}

}
