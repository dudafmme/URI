package br.com.dudafmme;

import java.util.Locale;
import java.util.Scanner;

/*
 * 1040 - Media 3
 */
public class Media3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		float n1, n2, n3, n4, media, notaExame, mediaExame;
		Scanner entrada = new Scanner(System.in);
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		n3 = entrada.nextFloat();
		n4 = entrada.nextFloat();

		media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;

		if (media >= 7.0) {
			System.out.format("Media: %.1f\nAluno aprovado.\n", media);
		} else if (media < 5.0) {
			System.out.format("Media: %.1f\nAluno reprovado.\n", media);
		} else if (media >= 5.0 || media <= 6.9) {
			notaExame = entrada.nextFloat();
			mediaExame = (media + notaExame) / 2;
			System.out.format("Media: %.1f\nAluno em exame.\n", media);
			if (media >= 5.0) {
				System.out.format("Nota do exame: %.1f\nAluno aprovado.\nMedia final: %.1f\n", notaExame, mediaExame);
			} else {
				System.out.format("Nota do exame: %.1f\nAluno reprovado.\nMedia final: %.1f\n", notaExame, mediaExame);
			}
		}
	}
}