package br.com.dudafmme;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/*
 * 1012 - Area
 */
public class Area {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		BigDecimal a, b, c, tri, circ, trap, quad, ret, pi;
		a = new BigDecimal(entrada.next());
		b = new BigDecimal(entrada.next());
		c = new BigDecimal(entrada.next());
		pi = new BigDecimal(3.14159);
		tri = a.multiply(c).divide(new BigDecimal(2.0));
		circ = pi.multiply(c.multiply(c));
		trap = a.add(b).multiply(c).divide(new BigDecimal(2.0));
		quad = b.multiply(b);
		ret = a.multiply(b);
		System.out.printf(
				"TRIANGULO: %.3f\n" + "CIRCULO: %.3f\n" + "TRAPEZIO: %.3f\n"
						+ "QUADRADO: %.3f\n" + "RETANGULO: %.3f\n",
				tri, circ, trap, quad, ret);
	}
}
