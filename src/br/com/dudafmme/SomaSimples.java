package br.com.dudafmme;

import java.util.Scanner;

/*
 * 1003 - Soma Simples
 */
public class SomaSimples {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int soma = a+b;
		System.out.println("SOMA = "+soma);
	}
}
