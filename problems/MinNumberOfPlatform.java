package com.problems;

import java.util.Arrays;

public class MinNumberOfPlatform {

	public static void main(String args[]) {

		/*
		 * List of arrival and departure time is given, Find the minimum number of
		 * platforms are required for the railway as no train waits Input. arr[] =
		 * {9.00, 9.40, 9.50, 11.00, 15.00, 18.00}, dep[] = {9.10, 12.00, 11.20, 11.30,
		 * 19.00, 20.00} Input. arr[] = {9.00, 9.40}, dep[] = {9.10, 12.00}
		 */
		double[] arrival = { 9.00, 9.40 };
		double[] departure = { 9.10, 12.00 };

		Arrays.sort(arrival);
		Arrays.sort(departure);
		System.out.println(" Min Platform required are . " + minPlatforms(arrival, departure));
	}

	public static int minPlatforms(double[] arr, double[] dep) {

		int platformNeeded = 0;
		int maxPlatform = 0;

		int i = 0;
		int j = 0;
		while (i < arr.length && j < dep.length) {
			if (arr[i] < dep[j]) {
				platformNeeded++;
				i++;
				if (platformNeeded > maxPlatform) {
					maxPlatform = platformNeeded;
				}
			} else {
				platformNeeded--;
				j++;
			}
		}
		return maxPlatform;
	}
}
