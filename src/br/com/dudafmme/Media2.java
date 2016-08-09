package br.com.dudafmme;

import java.util.Locale;
import java.util.Scanner;

/*
 * 1006 - Média 2
 */
public class Media2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a, b, c, media, notaMax;
		notaMax = 10.0;
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		if(a <= notaMax){
			a *= 2;
		}
		if(b <= notaMax){
			b *= 3;
		}
		if(c <= notaMax){
			c *= 5;
		}
		entrada.close();
		media = (a + b + c )/10;
		System.out.format("MEDIA = %.1f\n", media);
	}
}
