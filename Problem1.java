package com.TANDEMLOOP.ScreeningTest;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		double a = sc.nextDouble();
		System.out.print("Enter value of b: ");
		double b = sc.nextDouble();
		System.out.print("Enter operation (Addition/Subtraction/Multiplication/Division): ");
		String op = sc.next();

		double result = 0.0;
		switch (op.toLowerCase()) {
		case "add":
		case "addition":
			result = a + b;
			break;
		case "subtraction":
		case "sub":
			result = a - b;
			break;
		case "multiplication":
		case "mul":
			if (a != 0 || b != 0) {
				result = a * b;
				break;
			} else {
				result = 0;
				break;
			}
		case "division":
		case "div":
			if (b == 0) {
				System.out.println("Division by zero error!");
				return;
			} else {
				result = a / b;
				break;
			}
		default:
			System.out.println("Invalid operation!");
			break;
		}

		System.out.println("Result: " + result);
		sc.close();
	}

}
