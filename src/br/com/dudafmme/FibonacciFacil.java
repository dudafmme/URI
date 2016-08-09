package br.com.dudafmme;

import java.util.Scanner;

/*
 * 1051 - Fibonacci Facil
 */
public class FibonacciFacil {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		
		if (num > 0 && num < 46) {
			String fib = fibonacci(0) + " ";
			for (int i = 1; i < num; i++) {
				fib += fibonacci(i) + " ";
			}
			fib = fib.trim();
			System.out.println(fib);
		}
		n.close();
	}

	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
