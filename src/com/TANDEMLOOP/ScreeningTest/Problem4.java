package com.TANDEMLOOP.ScreeningTest;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int size = sc.nextInt();

		int[] dictionary = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] inputArray = new int[size];

		System.out.println("Enter Array Elements:");
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.nextInt();
		}

		for (int i = 0; i < dictionary.length; i++) {
			int count = 0;
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[j] % dictionary[i] == 0) {
					count++;
				}
			}
			System.out.print(dictionary[i] + ": " + count);
			if (i < dictionary.length - 1)
				System.out.print(", ");
		}

		sc.close();
	}
}
