package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class FindNumber {
	 public void searchNum(int num) {
	        searchRecursively(0, num);
	    }

	    private int searchRecursively(int left, int right) {
	        int mid = (left + right) / 2;

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("If your number is " + mid + " then type Y else\n" +
	                "Type L if number is lesser\n" +
	                "Type R if number is grater");
	        String response = scanner.nextLine();

	        if (response.equals("Y"))
	            return mid;

	        if (response.equals("L"))
	            return searchRecursively(left, mid);

	        return searchRecursively(mid, right);
	    }
	
	
	public static void main(String[] args) {
        FindNumber magicNumber = new FindNumber();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        int N = scanner.nextInt();
        System.out.println("Think of a number between 0 to " + N);

        magicNumber.searchNum(N);
        System.out.println("CONGRATULATIONS - you have found your number");
  }
}
