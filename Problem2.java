package com.TANDEMLOOP.ScreeningTest;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();

		if (x >= 1) {
			System.out.print("1");
			for (int i = 2; i <= x; i++) {
				System.out.print(", " + (2 * i - 1));
			}
		} else {
			System.out.println("Invalid Number!");
		}

		sc.close();
	}
}
