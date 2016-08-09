package br.com.dudafmme;

import java.util.Locale;
import java.util.Scanner;

/*
 * 1014 - Consumo
 */
public class Consumo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner n = new Scanner(System.in);
	
		int distancia = n.nextInt();
		double combustivel = n.nextDouble();
		
		double gasto = distancia/combustivel;
		
		System.out.printf("%.3f km/l\n",gasto);
	}
}
