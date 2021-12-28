package com.bridgelabz.algorithmprograms;

public class BubbleSort {
	
	    public void sort(int[] arr) {
	        int size = arr.length;
	        for (int i = 0; i < size-1; i++)
	            for (int j = 0; j < size-i-1; j++)
	                if (arr[j] > arr[j+1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }

	    }

	    public void printArray(int[] arr) {
	        int size = arr.length;
	        for (int i=0; i<size; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int arr[] = {64,34,60,12,22,11,50};
		System.out.println("Unsorted array");
		bubbleSort.printArray(arr);
		bubbleSort.sort(arr);
		System.out.println("Sorted array");
		bubbleSort.printArray(arr);
	}

}
