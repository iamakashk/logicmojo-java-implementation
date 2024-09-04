
package com.problems;

public class MinimumJump {
	/*
	 * Title Linear time approach to solve jump game problem
	 * 
	 * Topic Array problems solving techniques with examples
	 * 
	 * Description You have an array of non-negative integers,you are initially
	 * positioned at the first index of the array.Each element in the array
	 * represents your maximum jump length at that position.Determine if you are
	 * able to reach the last index in O(n) Time complexity and O(1) Space
	 * Complexity Asked in: Adobe, Intuit
	 */

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		System.out.println(maxJump(arr));
	}

	public static int maxJump(int arr[]) {

		int a = arr[0];
		int b = arr[0];

		int jump = 1;

		for (int i = 1; i <= arr.length; i++) {
			if (i == arr.length - 1)
				return jump;

			a--;
			b--;

			if (arr[i] > b) {
				b = arr[i];
				// jump++;
			}

			if (a == 0) {
				jump++;
				a = b;
			}

		}
		return jump;
	}

}
