package com.TANDEMLOOP.ScreeningTest;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();

		if (x >= 1) {
			System.out.print("1");
			if (x % 2 == 0) {
				for (int i = 2; i <= x - 1; i++) {
					System.out.print(", " + (2 * i - 1));
				}
			} else {
				for (int i = 2; i <= x; i++) {
					System.out.print(", " + (2 * i - 1));
				}
			}
		} else {
			System.out.println("Invalid Number!");
		}

		sc.close();
	}
}
