package br.com.dudafmme;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/*
 * 1009 - Salario com bonus
 */
public class SalarioComBonus {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner n = new Scanner(System.in);
		String name = n.next();
		BigDecimal salary = n.nextBigDecimal();
		BigDecimal total = n.nextBigDecimal();
		BigDecimal perc = new BigDecimal("0.15");
		n.close();
		salary = salary.add(total.multiply(perc));
		salary = salary.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		System.out.format("TOTAL = R$ " +  salary + "\n");
	}
}
