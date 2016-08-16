package br.com.dudafmme;

import java.util.Locale;
import java.util.Scanner;

/*
 * 1021 - Notas e Moedas
 */
public class NotasMoedas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int n100, n50, n20, n10, n5, n2;
		int m1, m50, m25, m10, m05, m01;
		double dinheiro;
		int notas, resto, moedas;
		Double max = 1000000.00;

		dinheiro = entrada.nextDouble();

		if (dinheiro <= max) {
			notas = (int) dinheiro;
			moedas = (int) Math.round(100 * (dinheiro % notas));

			n100 = notas / 100;
			resto = notas % 100;
			n50 = resto / 50;
			resto = resto % 50;
			n20 = resto / 20;
			resto = resto % 20;
			n10 = resto / 10;
			resto = resto % 10;
			n5 = resto / 5;
			resto = resto % 5;
			n2 = resto / 2;
			resto = resto % 2;
			m1 = resto / 1;
			m50 = moedas / 50;
			resto = moedas % 50;
			m25 = resto / 25;
			resto = resto % 25;
			m10 = resto / 10;
			resto = resto % 10;
			m05 = resto / 5;
			resto = resto % 5;
			m01 = resto / 1;

			System.out.printf("NOTAS:\n" 
					+ "%d nota(s) de R$ 100.00\n" 
					+ "%d nota(s) de R$ 50.00\n"
					+ "%d nota(s) de R$ 50.00\n" 
					+ "%d nota(s) de R$ 10.00\n" 
					+ "%d nota(s) de R$ 5.00\n"
					+ "%d nota(s) de R$ 2.00\n" 
					+ "MOEDAS:\n" 
					+ "%d moeda(s) de R$ 1.00\n" 
					+ "%d moeda(s) de R$ 0.50\n"
					+ "%d moeda(s) de R$ 0.25\n" 
					+ "%d moeda(s) de R$ 0.10\n" 
					+ "%d moeda(s) de R$ 0.05\n"
					+ "%d moeda(s) de R$ 0.01", 
					n100, n50, n20, n10, n5, n2, 
					m1, m50, m25, m10, m05, m01);
		}
	}
}
