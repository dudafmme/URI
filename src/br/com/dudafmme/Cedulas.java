package br.com.dudafmme;

import java.util.Scanner;

/*
 * 1018 - Cedulas
 */
public class Cedulas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dinheiro, cem, cinq, vinte, dez, cinco, dois, um, resto;
		dinheiro = entrada.nextInt();
		cem = dinheiro / 100;
		resto = dinheiro % 100;
		cinq = resto / 50;
		resto = resto % 50;
		vinte = resto / 20;
		resto = resto % 20;
		dez = resto / 10;
		resto = resto % 10;
		cinco = resto / 5;
		resto = resto % 5;
		dois = resto / 2;
		resto = resto % 2;
		um = resto / 1;

		System.out.println(dinheiro);
		System.out.printf("%d nota(s) de R$ 100,00\n", cem);
		System.out.printf("%d nota(s) de R$ 50,00\n", cinq);
		System.out.printf("%d nota(s) de R$ 20,00\n", vinte);
		System.out.printf("%d nota(s) de R$ 10,00\n", dez);
		System.out.printf("%d nota(s) de R$ 5,00\n", cinco);
		System.out.printf("%d nota(s) de R$ 2,00\n", dois);
		System.out.printf("%d nota(s) de R$ 1,00\n", um);
	}
}
