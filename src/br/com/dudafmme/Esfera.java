package br.com.dudafmme;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/*
 * 1011 - Esfera
 */
public class Esfera {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		BigDecimal pi, raio, volume;
		Scanner entrada = new Scanner(System.in);
		pi = new BigDecimal(3.14159);
		raio = new BigDecimal(entrada.next());
		volume = new BigDecimal(4/3.0).multiply(pi.multiply(raio.pow(3)));
		System.out.format("VOLUME = %.3f\n", volume);
	}
}
