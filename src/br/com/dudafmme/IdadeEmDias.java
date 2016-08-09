package br.com.dudafmme;

import java.util.Scanner;

/*
 * 1020 - Idade em dias
 */
public class IdadeEmDias {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int dias = n.nextInt();
		int anos = 0;
		int meses = 0;
		int resto = 0;
		anos = dias/365;
		resto = dias % 365;
		meses = resto/30;
		resto = resto % 30;
		dias = resto;
		n.close();
		System.out.println(anos + " ano(s)");
		System.out.println(meses +" mes(es)");
		System.out.println(dias +" dia(s)");
	}
}
