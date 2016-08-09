package br.com.dudafmme;

import java.util.Scanner;

/*
 * 1161 - Soma de fatoriaisS
 */
public class SomaFatoriais {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		while (entrada.hasNextInt()) {
			int n = entrada.nextInt();
			int m = entrada.nextInt();
			if (n <= 20 && m <= 20) {
				long somaFat = fatorial(n) + fatorial(m);
				System.out.println(somaFat);
			}
		}
	}

	public static long fatorial(int num) {
		int x = 1;
		long fat = x;
		if (x == 0) {
			return fat + 1;
		} else {
			while (num >= x) {
				fat *= x;
				x++;
			}
			return fat;
		}
	}
}
