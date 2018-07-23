package com.abc.client;

import com.abc.util.ArraysSorter;
import com.abc.util.MinElementFinder;

public class MyUtilitiesClient {

	public static void main(String[] args) {

		ArraysSorter arraysSorter = new ArraysSorter();
		int[] a = { 1, 2, 3, 4 };
		a = arraysSorter.sort(a);
		System.out.println(a);
		
		MinElementFinder elementFinder = new MinElementFinder();
		int minElement = elementFinder.getMinElement(a);
		System.out.println(minElement);
	}

}
