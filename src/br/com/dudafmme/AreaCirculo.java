package br.com.dudafmme;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/*
 * 1002 - Area do circulo
 */
public class AreaCirculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		BigDecimal calc, pi, raio, area;
		Scanner entrada = new Scanner(System.in);
		pi = new BigDecimal(3.14159);
		raio = new BigDecimal(entrada.next());
		calc = raio.pow(2);
		area = pi.multiply(calc);
		System.out.format("A=%.4f\n", area);
	}
}
