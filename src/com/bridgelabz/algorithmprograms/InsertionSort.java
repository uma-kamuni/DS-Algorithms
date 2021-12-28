package com.bridgelabz.algorithmprograms;

public class InsertionSort {

	public void Sort(String[] fruits) {
		int size = fruits.length;
		for (int i = 1; i < size; ++i) {
			String key = fruits[i];
			int j = i - 1;

			while (j >= 0 && fruits[j].compareTo(key) > 0) {
				fruits[j + 1] = fruits[j];
				j = j - 1;
			}
			fruits[j + 1] = key;
		}
	}

	public void printArray(String[] fruits) {
		int n = fruits.length;
		for (int i = 0; i < n; ++i)
			System.out.print(fruits[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {
		String fruits[] = { "grapes", "apple", "orange", "mango", "kiwi", "banana" };
		InsertionSort sort = new InsertionSort();
		System.out.println("Array before Sorting");
		sort.printArray(fruits);
		System.out.println("Array after Sorting");
		sort.Sort(fruits);
		sort.printArray(fruits);
	}

}