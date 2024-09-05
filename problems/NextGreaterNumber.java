package com.problems;

import java.util.Arrays;

public class NextGreaterNumber {

	public static void main(String args[]) {
		int num = 3648;
		int[] arr = Integer.toString(num).chars().map(c -> c - '0').toArray();

		int el = 0;
		int min = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[i - 1]) {
				el = i - 1;
				min = i;
				break;
			}
		}

		for (int i = min + 1; i < arr.length; i++) {
			if (arr[i] < arr[min] && arr[i] > arr[el]) {
				min = i;
			}
		}

		int temp = el;
		el = min;
		min = temp;
		temp = arr[min];
		arr[min] = arr[el];
		arr[el] = temp;

		Arrays.sort(arr, min + 1, arr.length);
		System.out.println(Arrays.toString(arr));

	}

}
