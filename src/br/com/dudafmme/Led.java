package br.com.dudafmme;

import java.util.Scanner;

/*
 * 1168 - LED
 */
public class Led {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int testes = entrada.nextInt();

		while (entrada.hasNext()) {
			int numero = entrada.nextInt();
			String leds = Integer.toString(numero);
			int qtd = 0;

			for (int i = 0; i < leds.length(); i++) {
				char num = leds.charAt(i);
				if (num == '1') {
					qtd += 2;
				} else if (num == '2' || num == '3' || num == '5') {
					qtd += 5;
				} else if (num == '4') {
					qtd += 4;
				} else if (num == '6' || num == '9' || num == '0') {
					qtd += 6;
				} else if (num == '7') {
					qtd += 3;
				} else if (num == '8') {
					qtd += 7;
				}
			}
			System.out.println(qtd);
			qtd = 0;
		}
	}
}
