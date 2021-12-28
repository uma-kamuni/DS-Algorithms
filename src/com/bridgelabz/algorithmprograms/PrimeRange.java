package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class PrimeRange {
	 public static void range(int start, int end) {
	        int count;
	        for (int i = start; i <= end; i++) {
	            count=0;
	            for (int j = 1; j <= end; j++) {
	                if ((i % j) == 0) {
	                    count += 1;
	                }
	        }
	            if (count == 2)
	                System.out.println(+i);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner Sc=new Scanner(System.in);
	        System.out.println("enter the range to print prime");
	        int start = Sc.nextInt();
	        int end = Sc.nextInt();
	        System.out.println("the prime numbers from range "+start+" and "+end+" are ");
	        range(start,end);
	    }
}
