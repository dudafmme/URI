package br.com.dudafmme;

import java.util.Scanner;

/*
 * 1007 - Diferenca
 */
public class Diferenca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int res = (a * b)-(c*d);
		System.out.println("DIFERENCA = " + res);
	}
}
