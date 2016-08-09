package br.com.dudafmme;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/*
 * 1005 - Média 1
 */
public class Media1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		BigDecimal media;
		double a, b, notaMax;
		notaMax = 10.0;
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		if(a <= notaMax){
			a *= 3.5;
		}
		if(b <= notaMax){
			b *= 7.5;
		}
		entrada.close();
		media = new BigDecimal((a + b)/11);
		System.out.format("MEDIA = %.5f\n", media);
	}
}
