package br.com.dudafmme;

import java.util.Locale;
import java.util.Scanner;

/*
 * 1008 - Salario
 */
public class Salario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		int hours = n.nextInt();
		double valueHour = n.nextDouble();
		n.close();
		double salary = hours * valueHour;
		System.out.format("NUMBER = %d\nSALARY = U$ %.2f\n", number, salary);
	}
}
