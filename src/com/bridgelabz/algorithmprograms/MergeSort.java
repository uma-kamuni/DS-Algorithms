package com.bridgelabz.algorithmprograms;

public class MergeSort {

	public void mergeSort(String[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}

	}

	private void merge(String[] arr, int start, int mid, int end) {  //for comparing
		int p = start, q = mid + 1;
		String[] newArr = new String[end - start + 1];
		int j = 0;
		for (int i = start; i <= end; i++) {
			if (p > mid)
				newArr[j++] = arr[q++];
			else if (q > end)
				newArr[j++] = arr[p++];
			else if (arr[p].compareTo(arr[q]) < 0)
				newArr[j++] = arr[p++];
			else
				newArr[j++] = arr[q++];
		}
		for (int k = 0; k < j; k++) {
			arr[start++] = newArr[k];
		}

	}

	public static void printArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		String[] arr = { "uma", "jungkook", "kim", "jimin", "suga", "hope" };
		int start = 0, end = arr.length - 1;
		sort.mergeSort(arr, start, end);
		MergeSort.printArr(arr);

	}
}
