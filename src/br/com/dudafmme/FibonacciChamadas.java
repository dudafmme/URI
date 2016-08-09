package br.com.dudafmme;

import java.util.Scanner;

/*
 * 1029 - Fibonacci, Quantas Chamadas?
 */
public class FibonacciChamadas {
	static int calls = 0;
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int numTestes = n.nextInt();
		int[] testes = new int[numTestes];
		int num = 0;
		if (numTestes <= 39) {
			for (int i = 0; i < testes.length; i++) {
				num = n.nextInt();
				testes[i] = num;
			}
			for (int i = 0; i < testes.length; i++) {
				int fib = 0;
				fib = fibonacci(testes[i]);
				if (testes[i] < 2){
					System.out.println("fib(" + testes[i] + ") = " + calls + " calls" + " = " + fib);
					calls = 0;
				}else{
					System.out.println("fib(" + testes[i] + ") = " + (calls - 1) + " calls" + " = " + fib);
					calls = 0;
				}
			}
		}
		n.close();
	}

	public static int fibonacci(int n) {
		calls++;
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
