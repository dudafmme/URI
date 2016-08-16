package br.com.dudafmme;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * 1168 - LED
 */
public class Led {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numTestes = entrada.nextInt();
		BigInteger []testes = new BigInteger[numTestes];

		//escrita
		for (int i = 0; i < testes.length; i++) {
			BigInteger num = entrada.nextBigInteger();
			testes[i] = num;
		}

		//leitura do teste
		for (int x = 0; x < testes.length; x++) {
			String leds = testes[x].toString();
			int qtd = 0;

			//leitura dos caracteres do teste
			for (int j = 0; j < leds.length(); j++) {
				char teste = leds.charAt(j);
				if (teste == '1') {
					qtd += 2;
				} else if (teste == '2' || teste == '3' || teste == '5') {
					qtd += 5;
				} else if (teste == '4') {
					qtd += 4;
				} else if (teste == '6' || teste == '9' || teste == '0') {
					qtd += 6;
				} else if (teste == '7') {
					qtd += 3;
				} else if (teste == '8') {
					qtd += 7;
				}
			}
			System.out.printf("%d leds\n",qtd);
			qtd = 0;
		}
	}
}
