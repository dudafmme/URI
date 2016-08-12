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

			dinheiro = entrada.nextDouble();
			entrada.close();
			
			notas = (int) dinheiro;
			moedas = (int) Math.round((dinheiro % notas) * 100);

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

			System.out.printf("NOTAS:\n%d nota(s) de R$ 100.00\n", n100);
			System.out.printf("%d nota(s) de R$ 50.00\n", n50);
			System.out.printf("%d nota(s) de R$ 20.00\n", n20);
			System.out.printf("%d nota(s) de R$ 10.00\n", n10);
			System.out.printf("%d nota(s) de R$ 5.00\n", n5);
			System.out.printf("%d nota(s) de R$ 2.00\n", n2);
			System.out.printf("MOEDAS:\n%d moeda(s) de R$ 1.00\n", m1);
			System.out.printf("%d moeda(s) de R$ 0.50\n", m50);
			System.out.printf("%d moeda(s) de R$ 0.25\n", m25);
			System.out.printf("%d moeda(s) de R$ 0.10\n", m10);
			System.out.printf("%d moeda(s) de R$ 0.05\n", m05);
			System.out.printf("%d moeda(s) de R$ 0.01", m01);
			
		}
	}
