package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class Anagram {
	static boolean isAnagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	public static void main(String[] args) {
		char firstWord[] = { 'h', 'e', 'a', 'r', 't' };
		char secondWord[] = { 'e', 'a', 'r', 't', 'h' };
		Anagram anagram = new Anagram();
		if (anagram.isAnagram(firstWord, secondWord))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
	}

}

